package day0415;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("AFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("AFilter start");
        chain.doFilter(request, response);
        PrintWriter p = response.getWriter();
        p.append("<html><head></head><body>it's good</body></html>");
        p.flush();
        p.close();
        System.out.println("AFilter end");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("AFilter destory");
    }

}
