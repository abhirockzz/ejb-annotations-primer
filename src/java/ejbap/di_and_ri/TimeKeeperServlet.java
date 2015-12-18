package ejbap.di_and_ri;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "TimeKeeperServlet", urlPatterns = {"/time"})
public class TimeKeeperServlet extends HttpServlet {

    @EJB
    TimeKeeper keeper;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Time Keeper Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Time is " + keeper.dateTime() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

}
