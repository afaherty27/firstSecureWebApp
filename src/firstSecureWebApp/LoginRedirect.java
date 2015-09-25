package firstSecureWebApp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
    name = "LoginRedirect",
    urlPatterns = {"/loginPage"}
)
/**
 *  Servlet that will prevent user from directly accessing login.jsp
 *
 * @author adam faherty
 * on 9/24/2015.
 */

public class LoginRedirect extends HttpServlet {

    /**
     * Handles HTTP request and response
     * @param request the HTTPServletRequest object
     * @param response the HTTPServletResponse object
     * @throws ServletException if there is a Servlet exception
     * @throws IOException if there is an IO exception
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url ="/login.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
