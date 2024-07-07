package sec03.ex01;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class EncoderFilter implements Filter {
    ServletContext context;

    @Override
    public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("utf-8 인코딩.....");
        context = fConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("doFilter 호출");
        request.setCharacterEncoding("utf-8");
        String context = ((HttpServletRequest) request).getContextPath();
        String pathinfo = ((HttpServletRequest) request).getRequestURI();
        String realPath = request.getRealPath(pathinfo);
        String mesg = "Context 정보 : " + context + "\n URI 정보 : " + pathinfo + "\n 물리적 경로 : " + realPath;
        System.out.println(mesg);
        long begin = System.currentTimeMillis();
        chain.doFilter(request, response);

        long end = System.currentTimeMillis();
        System.out.println("작업 시간 : " + (end - begin) + "ms");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 호출");
    }
}
