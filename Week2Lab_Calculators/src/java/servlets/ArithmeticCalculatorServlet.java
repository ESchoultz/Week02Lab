package servlets;

import java.io.IOException;
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
        String atype = request.getParameter("atype");
        request.setAttribute("firstval", firstval);
        request.setAttribute("secondval", secondval);

        int fval;
        int sval;

        try {
            fval = Integer.parseInt(firstval);
            sval = Integer.parseInt(secondval);
            int nval = 0;
            
            switch(atype){
            case "+": {
                nval = (fval + sval);
                break;
            }
            case "-": {
                nval = (fval - sval);
                break;
            }
            case "*": {
                nval = (fval * sval);
                break;
            }
            case "%": {
                nval = (fval % sval);
                break;
            }
            }
            request.setAttribute("result", "Result: " + nval);
            request.setAttribute("firstval", fval);
            request.setAttribute("secondval", sval);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            } catch (NumberFormatException e) {
            request.setAttribute("result", "Result: Invalid.");
            request.setAttribute("firstval", firstval);
            request.setAttribute("secondval", secondval);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }
    }
}
