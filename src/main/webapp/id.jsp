<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add something</title>
    <script src= /js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<div class="container-fluid ">
    <h1>Input Id</h1>
    <div class="col-md-5">
        <form id="addForm" method="get" action="/search">
            <div class="form-group">
                <label for="id">Id: </label>
                <input type="text" name="id" id="id" class="form-control">
            </div>
            <button type="submit" class="btn btn-default" id="AddButton">Show</button>
        </form>
    </div>
</div>
</body>
</html>