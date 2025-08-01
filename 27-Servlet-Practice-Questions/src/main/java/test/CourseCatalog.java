package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/courses")
public class CourseCatalog extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();

	    String dept = request.getParameter("department");
	    if(dept == null || dept.trim().isEmpty()) {
	        pw.println("Missing department parameter.");
	        return;
	    }
	    dept = dept.toUpperCase();

	    String[] courses = null;

	    if(dept.equals("CS")) {
	        courses = new String[] {"Data Structures", "Algorithms", "Databases"};
	    } else if(dept.equals("ME")) {
	        courses = new String[] {"Thermodynamics", "Fluid Mechanics", "Machine Design"};
	    } else if(dept.equals("EE")) {
	        courses = new String[] {"Circuits", "Signal Processing", "Electromagnetics"};
	    }
	    if(courses == null) {
	        pw.println("Department not found.");
	    } else {
	        pw.println("Courses for " + dept + " Department");
	        for(String course : courses) {
	            pw.println( course );
	        }
	        pw.println();
	}
}
}
