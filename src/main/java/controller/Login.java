package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String username = req.getParameter("username");
            String password = req.getParameter("password");





            PrintWriter out = resp.getWriter();



            if(UserList.validateUser(username,password)){

                HttpSession session = req.getSession();
                session.setAttribute("username",username);

                if(req.getParameter("remember")!=null){
                Cookie cookie = new Cookie("username", username);
                cookie.setMaxAge(30*24*60*60);
                resp.addCookie(cookie);
;


                }


                     else if(req.getParameter("remember")==null){
                         Cookie ck = new Cookie("username", "");
                        ck.setMaxAge(0);
                        resp.addCookie(ck);
                }


                Cookie promoCokie = new Cookie("promo", "$100");
                 promoCokie.setMaxAge(30*24*60*60);
                 resp.addCookie(promoCokie);




                resp.sendRedirect("index.jsp");



            }

            else{

                 out.println("<html><body>Username or Password incorrect</body><html>");

            }


    }
}
