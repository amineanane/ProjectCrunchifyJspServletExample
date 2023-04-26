package com.crunchify.jsp.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.InputMismatchException;
public class HelloCrunchifyDiff extends HttpServlet {
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValue = request.getParameter("firstValue");
        String secondValue = request.getParameter("secondValue");
        Double firstValueDiff = 0.0 ;
        Double secondValueDiff= 0.0;
        Double resultDiff= 0.0;
        String error = "";
        try {
        firstValueDiff = Double.valueOf(firstValue);
        secondValueDiff = Double.valueOf(secondValue);
        resultDiff = firstValueDiff - secondValueDiff;
        } catch (Exception e){
            error = " Please insert a double value";
        }
        request.setAttribute("firstValue", firstValueDiff);
        request.setAttribute("secondValue", secondValueDiff);
        request.setAttribute("result", resultDiff);
        request.getRequestDispatcher("Crunchify.jsp").forward(request, response);
    }
}
