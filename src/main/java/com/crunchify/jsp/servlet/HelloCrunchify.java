package com.crunchify.jsp.servlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.InputMismatchException;

public class HelloCrunchify extends HttpServlet{
    protected void doGet (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstValue = (String) request.getParameter("firstValue");
    String secondValue = (String) request.getParameter("secondValue");
    String error = "";
        Double secondValueD= 0.0;
        Double firstValueD = 0.0;
        Double resultD = 0.0;
try {
    firstValueD = Double.valueOf(firstValue);
    secondValueD = Double.valueOf(secondValue);
    resultD = firstValueD + secondValueD;
} catch(Exception e){
    error = " Please insert a double value";
}
/*
        //TO DO HANDLE EXCEPTIONS IF THE VALUES ARE NOT NUMBERS
    PrintWriter out = response.getWriter();
    out.println(
            "<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" +" +
                    "http://www.w3.org/TR/html4/loose.dtd\">\n" +
                    "<html> \n" +
                    "<head> \n" +
                    "<meta http-equiv=\"Content-Type\" content=\"text/html; " +
                    "charset=ISO-8859-1\"> \n" +
                    "<title> Crunchify.com JSP Servlet Example  </title> \n" +
                    "</head> \n" +
                    "<body> <div align='center'> \n" +
                    "<style= \"font-size=\"18px\" color='red'\"" + "\">" +
                    "The result is  " + resultD + " <br> " + "</font></body> \n" +
                    "</html>"
    ); */

       request.setAttribute("firstValue", firstValueD);
        request.setAttribute("secondValue", secondValueD);
        request.setAttribute("result", resultD);
        request.getRequestDispatcher("Crunchify.jsp").forward(request, response);
    }
}
