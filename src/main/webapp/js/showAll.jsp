
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show ALL</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<div class="container">
    <div>
        <table id="myTable" class="table">
            <thead class="thead thead-default">
            <tr>
                <th>Name</th>
                <th>Speed</th>
                <th>Mass</th>
                <th>Number Of Passengers</th>
                <th>Number Of Wheels</th>
                <th>Number Of Pilots</th>
                <th>Id</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${Plane}" var="Plane">
                <tr>
                    <td>${Plane.name}</td>
                    <td>${Plane.speed}</td>
                    <td>${Plane.mass}</td>
                    <td>${Plane.numberofpassengers}</td>
                    <td>${Plane.numberofwheels}</td>
                    <td>${Plane.numberofpilots}</td>
                    <td>${Plane.id}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>


</body>
</html>
