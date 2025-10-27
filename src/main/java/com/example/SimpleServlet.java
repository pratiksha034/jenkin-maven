package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
// Correct imports for Jakarta EE (used by Tomcat 11 and your pom.xml)
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class SimpleServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Deployment Test</title></head>");
        out.println("<body>");
        out.println("<h2>Deployment Successful!</h2>");
        out.println("<p>This servlet confirms the automatic deployment via Jenkins.</p>");
        out.println("<p>Current Server Time: <strong>" + new Date() + "</strong></p>");
        out.println("<p>Commit: #1 - Initial Setup</p>"); // Change this line for the next commit!
        out.println("</body>");
        out.println("</html>");
    }
}
