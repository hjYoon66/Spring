package sec03.brd03;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAO {
    private DataSource dataFactory;
    Connection conn;
    PreparedStatement pstmt;

    public BoardDAO() {
        try{
            Context ctx = new InitialContext();
            Context envContext = (Context) ctx.lookup("java:/comp/env");
            dataFactory = (DataSource) envContext.lookup("jdbc/oracle");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public List<ArticleVO> selectAllArticles(){
        List<ArticleVO> articlesList = new ArrayList<>();
        try{
            conn = dataFactory.getConnection();
            String query = "SELECT LEVEL, articleNo, parentNo, title, content, id, writeDate" +
                    " from t_board" +
                    " START WITH parentNo=0" +
                    " CONNECT BY PRIOR articleNo=parentNo" +
                    " ORDER SIBLINGS BY articleNo DESC";
            System.out.println(query);
            pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                int level = rs.getInt("level");
                int articleNo = rs.getInt("articleNo");
                int parentNo = rs.getInt("parentNo");
                String title = rs.getString("title");
                String content = rs.getString("content");
                String id = rs.getString("id");
                Date writeDate = rs.getDate("writeDate");
                ArticleVO articleVO = new ArticleVO();
                articleVO.setLevel(level);
                articleVO.setArticleNo(articleNo);
                articleVO.setParentNo(parentNo);
                articleVO.setTitle(title);
                articleVO.setContent(content);
                articleVO.setId(id);
                articleVO.setWriteDate(writeDate);
                articlesList.add(articleVO);
            }
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return articlesList;
    }

    private int getNewArticleNo(){
        try{
            conn = dataFactory.getConnection();
            String query = "SELECT max(articleNo) from t_board";
            System.out.println(query);
            pstmt = conn.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next())
                return (rs.getInt(1) + 1);
            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    public int insertNewArticle(ArticleVO article){
        int articleNO = getNewArticleNo();
        try {
            conn = dataFactory.getConnection();
            int parentNO = article.getParentNo();
            String title = article.getTitle();
            String content = article.getContent();
            String id = article.getId();
            String imageFileName = article.getImageFileName();
            String query = "INSERT INTO t_board (articleNo, parentNo, title, content, imageFileName, id)"
                    + " VALUES (?, ? ,?, ?, ?, ?)";
            System.out.println(query);
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, articleNO);
            pstmt.setInt(2, parentNO);
            pstmt.setString(3, title);
            pstmt.setString(4, content);
            pstmt.setString(5, imageFileName);
            pstmt.setString(6, id);
            pstmt.executeUpdate();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return articleNO;
    }
}

