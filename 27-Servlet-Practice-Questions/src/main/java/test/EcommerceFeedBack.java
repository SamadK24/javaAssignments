package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/feedback")
public class EcommerceFeedBack extends HttpServlet {
	private static final List<String> feedbackList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String productId = request.getParameter("productId");
        String ratingStr = request.getParameter("rating");
        String review = request.getParameter("review");

        StringBuilder errors = new StringBuilder();

        
        if (productId == null || productId.trim().isEmpty()) {
            errors.append("<li>Product ID is required.</li>");
        }

        
        int rating = 0;
        try {
            rating = Integer.parseInt(ratingStr);
            if (rating < 1 || rating > 5) {
                errors.append("<li>Rating must be between 1 and 5.</li>");
            }
        } catch (Exception e) {
            errors.append("<li>Valid rating is required.</li>");
        }

       
        if (review == null || review.trim().isEmpty()) {
            errors.append("<li>Review cannot be empty.</li>");
        }

     
        if (errors.length() > 0) {
            out.println("<h3>Feedback Submission Failed:</h3><ul>" + errors.toString() + "</ul>");
            out.println("<a href=\"ECommerceFeedback.html\">Go Back</a>");
            return;
        }

        // Store feedback (just demonstrating with a string list)
        String feedbackRecord = "Product: " + productId + ", Rating: " + rating + ", Review: " + review;
        feedbackList.add(feedbackRecord);

        
        out.println("<a href=\"ECommerceFeedback.html\">Submit Another Feedback</a>");

        
        out.println("<hr><h4>All Feedbacks (In-Memory):</h4><ul>");
        for(String fb : feedbackList) {
            out.println("<li>" + fb + "</li>");
        }
        out.println("</ul>");
    }
}
