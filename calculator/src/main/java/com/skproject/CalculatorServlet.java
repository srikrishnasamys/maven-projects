package com.skproject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String expression = request.getParameter("expression");

            if (expression != null && !expression.isEmpty()) {
                // Perform the calculation and set result in request attribute
                // ...

            } else {
                request.setAttribute("result", "Expression is empty or null");
            }
        } catch (Exception e) {
            request.setAttribute("result", "Error in expression");
        }

        // Forward to the JSP page
        request.getRequestDispatcher("/webapp/WEB-INF/calculator.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}


