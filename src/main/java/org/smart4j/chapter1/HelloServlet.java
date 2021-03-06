package org.smart4j.chapter1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/8/29.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dft.format(new Date());
        String userName = "lilimin";
        req.setAttribute("currentTime", currentTime + userName);
        req.getRequestDispatcher("/jsp/hello.jsp").forward(req, resp);
    }
}
