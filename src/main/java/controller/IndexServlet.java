package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/index")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String user = (String) session.getAttribute("username");

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>Welcome</title></head><body>");
        out.println("<h3>Welcome "+user+"</h3>");
        out.println("<a href=\"logout\">Logout</a>");
        out.println("</body></html>");

    }
}
