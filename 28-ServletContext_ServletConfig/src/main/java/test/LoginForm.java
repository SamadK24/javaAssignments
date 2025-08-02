package test;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/AgeServlet")
public class LoginForm extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String ageStr = request.getParameter("age");
        int age = Integer.parseInt(ageStr);

        if (age < 18) {
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html><head><title>Voting Eligibility</title></head><body>");
            out.println("<h2>Check Your Voting Eligibility</h2>");
            out.println("<form action=\"AgeServlet\" method=\"post\">");
            out.println("<label for=\"age\">Enter your age:</label>");
            out.println("<input type=\"number\" id=\"age\" name=\"age\" min=\"0\" required>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</form>");
            out.println("<p style=\"color:red;\">You must be at least 18 to vote.</p>");
            out.println("</body></html>");
        } else if (age > 60) {
            // Forward to senior page
            RequestDispatcher rd = request.getRequestDispatcher("seniorPage.html");
            rd.forward(request, response);
        } else {
            // Forward to success page
            RequestDispatcher rd = request.getRequestDispatcher("successPage.html");
            rd.forward(request, response);
        }
    }
}
