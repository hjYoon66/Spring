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

@WebServlet("/set")
public class SetAttribute extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        String ctxMesg = "context에 바인딩됩니다.";
        String sesMesg = "session에 바인딩됩니다.";
        String reqMesg = "request에 바인딩됩니다.";

        ServletContext ctx = getServletContext();
        HttpSession session = request.getSession();
        ctx.setAttribute("context", ctxMesg);
        session.setAttribute("session", sesMesg);
        request.setAttribute("request", reqMesg);
        out.print("바인딩을 수행한다.");
    }
}
