<%-- 
    Document   : CircleResult
    Created on : Feb 5, 2013, 10:44:06 AM
    Author     : Skybeorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Circle Area Page</title>
    </head>
    <body>
        <p>
            <%
                double x = (Double) request.getAttribute("circleArea");
                out.print("<strong> Circle Area Is: " + x + "</strong>");
            %>
        </p>
    </body>
</html>
