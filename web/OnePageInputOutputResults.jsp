<%-- 
    Document   : OnePageInputOutputResults
    Created on : Feb 7, 2013, 8:42:17 AM
    Author     : Skybeorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Calculator</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <form id="one" name="one" method="POST" action="RectangleInput">
            <table border="1" width="230">
                <tr>
                    <td align="center">
                        <p>Rectangular Area Calculator </p>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        Length: <input type="text" name="length"> 
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        Width: <input type="text" name="width">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <input type="submit" value="Calculate">
                    </td>
                </tr>
                <tr>
                    <td align="center">            
                        <%
                            Object rectangleAnswer = request.getAttribute("rectangleArea");
                            String rectangleArea = "";
                            if (rectangleAnswer != null) {
                                rectangleArea = rectangleAnswer.toString();
                                out.print("Answer: " + rectangleArea);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>

        <form id="two" name="two" method="POST" action="CircleInput"> 

            <table border="1" width="230">
                <tr>
                    <td align="center">
                        <p>Circle Area Calculator </p>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        Radius: <input type="text" name="radius">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <input type="submit" value="Calculate">
                    </td>
                </tr>
                <tr>
                    <td align="center">            
                        <%
                            Object circleResult = request.getAttribute("circleArea");
                            String circleArea = "";
                            if (circleResult != null) {
                                circleArea = circleResult.toString();
                                out.print("Answer: " + circleArea);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>

        <form id="three" name="three" method="POST" action="TriangleInput"> 

            <table border="1" width="230">
                <tr>
                    <td align="center">
                        <p>Pythagoras' Theorem</p>
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        Side 1: <input type="text" name="sideA">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        Side 2: <input type="text" name="sideB">
                    </td>
                </tr>
                <tr>
                    <td align="center">
                        <input type="submit" value="Calculate!">
                    </td>
                </tr>
                <tr>
                    <td align="center">            
                        <%
                            Object hypotenuseResult = request.getAttribute("hypotenuse");
                            String hypotenuse = "";
                            if (hypotenuseResult != null) {
                                hypotenuse = hypotenuseResult.toString();
                                out.print("Answer: " + hypotenuse);
                            }
                        %>
                    </td>
                </tr>
            </table>
            <hr width="230" align="left">
        </form>
    </body>
</html>
