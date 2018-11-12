package org.smart4j.chapter2.controller;

/**
 * Created by Administrator on 2017/8/30.
 */
public class CustomerServlet {
     @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = dft.format(new Date());
        req.setAttribute("currentTime", currentTime);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
}
