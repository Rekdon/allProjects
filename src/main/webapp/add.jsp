
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add something</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>

</head>
<body>

<div class="container-fluid ">
    <h1>Add new plane:</h1>
    <div class="col-md-5">
        <form id="addForm" method="get" action="/show">
            <div class="form-group">
                <label for="name">Name: </label>
                <input type="text" name="name" id="name" class="form-control">
            </div>
            <div class="form-group">
               <label for="speed">Speed: </label>
                <input type="text" name="speed" id="speed" class="form-control">
            </div>
            <div class="form-group">
                <label for="mass">Mass: </label>
                <input type="text" name="mass" id="mass" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberOfPassengers">Number of passengers: </label>
                <input type="text" name="numberOfPassengers" id="numberOfPassengers" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberOfWheels">Number of wheels: </label>
                <input type="text" name="numberOfWheels" id="numberOfWheels" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberOfPilots">Number of pilots: </label>
                <input type="text" name="numberOfPilots" id="numberOfPilots" class="form-control">
            </div>
            <div class="form-group">
                <label for="id">Id: </label>
                <input type="text" name="id" id="id" class="form-control">
            </div>

            <button type="submit" class="btn btn-default" id="AddButton">Add</button>

        </form>
    </div>
</div>

</body>
</html>
