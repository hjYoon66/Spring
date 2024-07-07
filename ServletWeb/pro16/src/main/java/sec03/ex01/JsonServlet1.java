package sec03.ex01;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import sec02.ex01.MemberDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/json")
public class JsonServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandler(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doHandler(request, response);
    }

    private void doHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");

        String jsonInfo = request.getParameter("jsonInfo");
        try{
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(jsonInfo);
            System.out.println("* 회원 정보 *");
            System.out.println(jsonObject.get("name"));
            System.out.println(jsonObject.get("age"));
            System.out.println(jsonObject.get("gender"));
            System.out.println(jsonObject.get("nickname"));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
