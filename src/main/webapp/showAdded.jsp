
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Added</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
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
            <tr>
                <td>${PLANE.name}</td>
                <td>${PLANE.speed}</td>
                <td>${PLANE.mass}</td>
                <td>${PLANE.numberOfPassengers}</td>
                <td>${PLANE.numberOfWheels}</td>
                <td>${PLANE.numberOfPilots}</td>
                <td>${PLANE.id}</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
