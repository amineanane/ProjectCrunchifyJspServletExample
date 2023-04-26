package com.crunchify.jsp.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.InputMismatchException;
public class HelloCrunchifyMul extends HttpServlet{
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValue = request.getParameter("firstValue");
        String secondValue = request.getParameter("secondValue");
        Double firstValueMul = 0.0;
        Double resultMul= 0.0;
        Double secondValueMul = 0.0;
        String error = "";
        try{
        firstValueMul =Double.valueOf(firstValue);
        secondValueMul = Double.valueOf(secondValue);
        resultMul = firstValueMul * secondValueMul;
        } catch (Exception e) {
            error = "Please insert a double number";
        }
        request.setAttribute("firstValue", firstValueMul);
        request.setAttribute("secondValue", secondValueMul);
        request.setAttribute("result", resultMul);
        request.getRequestDispatcher("Crunchify.jsp").forward(request, response);
    }
}
