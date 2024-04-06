package sec01.ex01;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/get")
public class GetAttribute extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        ServletContext ctx = getServletContext();
        HttpSession sess = request.getSession();

        String ctxMesg = (String) ctx.getAttribute("context");
        String sesMesg = (String) sess.getAttribute("session");
        String reqMesg = (String) request.getAttribute("requset");

        out.print("context 값 : "+ ctxMesg + "<br>");
        out.print("session 값 : "+ sesMesg + "<br>");
        out.print("request 값 : "+ reqMesg + "<br>");
    }
}
