package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class CurrencyConverter extends HttpServlet{
  
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();

		String from = req.getParameter("from-currency");
		String to = req.getParameter("to-currency");
		String amount = req.getParameter("amount");
		Integer amount_int=Integer.parseInt(amount);
		 if (from == null || to == null || amount == null || amount.trim().isEmpty()) {
	            pw.println("<h3>Invalid input. Please go back and fill all fields.</h3>");
	            return;
	        }

	        if(from.equalsIgnoreCase("INR")) {
	        		if(to.equalsIgnoreCase("USD")) {
	        			pw.write("amouunt in usd : "+amount_int/86.78);
	        			}
	        }
	        
	        if(from.equalsIgnoreCase("USD")) {
        		if(to.equalsIgnoreCase("INR")) {
        			pw.write("amouunt in usd : "+amount_int*86.78);
        			}
        }

	}
}
