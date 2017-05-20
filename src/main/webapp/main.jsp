
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<style>
    .b1 {
        background: navy;
        color: white;
        border-radius: 20%;
    }
    .b2 {
        background: #d80300;
        color: white;
        border-radius: 20%;
    }
</style>
<form>
    <div class="container">
        Your choice</br>
        <button formaction="/add" class="b1" formmethod="POST">To ADD</button>
        <button formaction="/showAll" class="b2" formmethod="POST">To ShowALL</button>
    </div>
</form>
</body>
</html>
