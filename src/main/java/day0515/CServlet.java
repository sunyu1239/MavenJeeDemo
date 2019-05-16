package day0515;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
        req.setCharacterEncoding("utf-8");
        System.out.println(req.getQueryString());
        System.out.println(req.getParameter("name"));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doPost(req, resp);
        req.setCharacterEncoding("utf-8");
        BufferedReader r = req.getReader();
        StringBuffer sb = new StringBuffer();
        String s;
        while ((s = r.readLine()) != null) {
            sb.append(s);
        }
        System.out.println(sb);
    }

}
