package firstSecureWebApp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet class that prevents user from directly accessing index.jsp
 * @author afaherty
 * on 9/24/15
 */
@WebServlet(
    name = "IndexRedirect",
    urlPatterns = {"/indexPage"}
)
public class IndexRedirect extends HttpServlet {
//this jsp redirection class also breaks the application
    /**
     * Handles HTTP request and response
     * @param request the HTTPServletRequest object
     * @param response the HTTPServletResponse object
     * @throws ServletException if there is a Servlet exception
     * @throws IOException if there is an IO exception
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url ="/index.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}

