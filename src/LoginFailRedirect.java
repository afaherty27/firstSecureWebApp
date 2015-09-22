import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.*;

@WebServlet(
        name = "loginFailForward",
        urlPatterns = {"/loginFail"}
)

/**
 * Created by L on 9/22/2015.
 */
public class LoginFailRedirect extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url ="/login-error.jsp";

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }
}
