package Controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RectangleInput", urlPatterns = {"/RectangleInput"})
public class RectangleInput extends HttpServlet {

    private static final String RESULT_PAGE = "/RectangleResult.jsp";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String length = request.getParameter("length");
        String width = request.getParameter("width");
        double convertedLength = Double.parseDouble(length);
        double convertedWidth = Double.parseDouble(width);
        double area = convertedLength * convertedWidth;
        request.setAttribute("rectangleArea", area);

        RequestDispatcher dispatch = request.getRequestDispatcher(RESULT_PAGE);
        dispatch.forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
