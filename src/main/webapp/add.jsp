
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add something</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css">
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
               <label for="speednow">Speed: </label>
                <input type="text" name="speednow" id="speednow" class="form-control">
            </div>
            <div class="form-group">
                <label for="mass">Mass: </label>
                <input type="text" name="mass" id="mass" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberofpassengers">Number of passengers: </label>
                <input type="text" name="numberofpassengers" id="numberofpassengers" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberofwheels">Number of wheels: </label>
                <input type="text" name="numberofwheels" id="numberofwheels" class="form-control">
            </div>
            <div class="form-group">
                <label for="numberofpilots">Number of pilots: </label>
                <input type="text" name="numberofpilots" id="numberofpilots" class="form-control">
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
