package firstSecureWebApp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.http.HttpServlet;

@WebServlet(
        name = "admin",
        urlPatterns = {"/adminPage"}
)

/**
 *  Servlet that will prevent user from directly accessing display.jsp
 *
 * @author adam faherty
 * on 9/24/2015.
 */
public class AdminRedirect extends HttpServlet {

// when this jsp redirection class is called, the app breaks.  because not being accessed directly? (ie: localhost:8080/admin/adminPage is the page accessed?
    /**
     * Handles HTTP request and response
     * @param request the HTTPServletRequest object
     * @param response the HTTPServletResponse object
     * @throws ServletException if there is a Servlet exception
     * @throws IOException if there is an IO exception
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url ="/admin/admin.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
