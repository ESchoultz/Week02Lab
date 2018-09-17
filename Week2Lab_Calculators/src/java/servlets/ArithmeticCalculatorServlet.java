/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 669385
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstval = request.getParameter("firstval");
        String secondval = request.getParameter("secondval");
        String arithType = request.getParameter("arithType");

        request.setAttribute("firstval", firstval);
        request.setAttribute("secondval", secondval);

        int fval;
        int sval;
        int nval=0;

        try {
            fval = Integer.parseInt(firstval);
            sval = Integer.parseInt(secondval);
            
            if (arithType.equalsIgnoreCase("+")){
                nval = ( fval + sval );
                return;
            }
            if (arithType.equalsIgnoreCase("-")){
                nval = ( sval - fval );
                return;
            }
            if (arithType.equalsIgnoreCase("*")){
                nval = ( fval * sval );
                return;
            }
            if (arithType.equalsIgnoreCase("%")){
                nval = ( sval % fval );
                return;
            }
            request.setAttribute("result", "Your age next year will be " + nval);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            request.setAttribute("result", "Please enter both values.");
            request.setAttribute("firstval", firstval);
            request.setAttribute("secondval", secondval);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
        }
    }
}
