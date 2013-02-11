package Controller;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import Model.Interfaces.IAreaCalculator;
import Model.CircularArea;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Skybeorn
 */
@WebServlet(name = "CircleInput", urlPatterns = {"/CircleInput"})
public class CircleInput extends HttpServlet {

    private static final String RESULT_PAGE = "/OnePageInputOutputResults.jsp";
    CircularArea calc = new CircularArea();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String radius = request.getParameter("radius");
        calc.setRadius(radius);
        double area = calc.getArea();
        request.setAttribute("circleArea", area);

        RequestDispatcher dispatch = request.getRequestDispatcher(RESULT_PAGE);
        dispatch.forward(request, response);

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
