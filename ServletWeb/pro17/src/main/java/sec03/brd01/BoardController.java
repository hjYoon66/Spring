package sec03.brd01;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//@WebServlet("/board/*")
public class BoardController extends HttpServlet {
    BoardService boardService;
    ArticleVO articleVO;

    @Override
    public void init() throws ServletException {
        boardService = new BoardService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandle(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doHandle(req, resp);
    }

    private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String nextPage = "";
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        String action = request.getPathInfo();
        System.out.println("action = " + action);
        try{
            List<ArticleVO> articlesList = new ArrayList<>();
            if(action == null){
                articlesList = boardService.listArticles();
                request.setAttribute("articlesList", articlesList);
                nextPage = "/board01/listArticles.jsp";
            } else if (action.equals("/listArticles.do")) {
                articlesList = boardService.listArticles();
                request.setAttribute("articlesList", articlesList);
                nextPage = "/board01/listArticles.jsp";
            }
            RequestDispatcher dispatch = request.getRequestDispatcher(nextPage);
            dispatch.forward(request, response);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
