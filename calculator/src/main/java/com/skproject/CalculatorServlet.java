package com.skproject;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
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
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                Object result = engine.eval(expression);
                request.setAttribute("result", "Result: " + result);
            } else {
                request.setAttribute("result", "Expression is empty or null");
            }
        } catch (Exception e) {
            request.setAttribute("result", "Error in expression");
        }

        // Forward back to the index.jsp page
        String jspPath = "/index.jsp";
        request.getRequestDispatcher(jspPath).forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String expression = request.getParameter("expression");

            if (expression != null && !expression.isEmpty()) {
                ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                Object result = engine.eval(expression);
                request.setAttribute("result", "Result: " + result);
            } else {
                request.setAttribute("result", "Expression is empty or null");
            }
        } catch (Exception e) {
            request.setAttribute("result", "Error in expression");
        }

        // Forward back to the index.jsp page
        String jspPath = "/index.jsp";
        request.getRequestDispatcher(jspPath).forward(request, response);
    }
}
