package day0415;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class BFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // TODO Auto-generated method stub
        System.out.println("BFilter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("BFilter start");
        chain.doFilter(request, response);
        System.out.println("BFilter end");
    }

    @Override
    public void destroy() {
        // TODO Auto-generated method stub
        System.out.println("BFilter destory");
    }

}
