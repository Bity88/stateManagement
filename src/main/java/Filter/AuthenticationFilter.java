package Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class AuthenticationFilter implements Filter {



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest)servletRequest;
        HttpServletResponse res = (HttpServletResponse)servletResponse;

            String uri = req.getRequestURI();

            HttpSession session = req.getSession(false);

            boolean isLogged = session !=null && session.getAttribute("username")!=null;
            boolean isLoggedIn = req.getRequestURI().equals(req.getContextPath()+"/login")||req.getRequestURI().equals("/");
                if(isLogged || isLoggedIn){
                     filterChain.doFilter(req,res);
                }
                    else
                {

                     res.sendRedirect("/");
                }
    }

    @Override
    public void destroy() {

    }
}
