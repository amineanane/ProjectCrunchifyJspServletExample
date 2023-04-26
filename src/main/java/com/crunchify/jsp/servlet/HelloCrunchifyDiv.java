package com.crunchify.jsp.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.InputMismatchException;
public class HelloCrunchifyDiv extends HttpServlet{
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValue = request.getParameter("firstValue");
        String secondValue = request.getParameter("secondValue");
        Double firstValueDiv = 0.0;
        Double secondValueDiv = 0.0;
        Double resultDiv=(Double) 0.0;
        String error = "";
        try{
        firstValueDiv = Double.valueOf(firstValue);
        secondValueDiv = Double.valueOf(secondValue);
        resultDiv = ( firstValueDiv / secondValueDiv);
                } catch (Exception e) {
            error = "Please insert a double number";
        }
        request.setAttribute("firstValue", firstValueDiv);
        request.setAttribute("secondValue", secondValueDiv);
        request.setAttribute("result", resultDiv);
        request.getRequestDispatcher("Crunchify.jsp").forward(request, response);
    }
}
