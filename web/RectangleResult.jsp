<%-- 
    Document   : ResultPage
    Created on : Jan 31, 2013, 1:25:32 PM
    Author     : Skybeorn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Rectangle Area Result Page</title>
    </head>
    <body>
        <p>
            <%
                double x = (Double) request.getAttribute("rectangleArea");
                out.print("<strong>" + x + "</strong>");
            %>
        </p>
    </body>
</html>
