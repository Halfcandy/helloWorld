package com.hc.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Half_candy
 */
@WebServlet("/myController")
public class Controller extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        req.setAttribute("name", name);
        System.out.println(name);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
