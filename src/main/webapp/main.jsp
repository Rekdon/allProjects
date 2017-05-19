
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Menu</title>
    <script src="/js/JQuery.js"></script>
    <link rel="stylesheet" href="/src/main/webapp/css/bootstrap.min.css">
    <script src="/js/bootstrap.js"></script>
</head>
<body>
<form>
    <div class="container">
        <button formaction="/add" formmethod="POST">To ADD</button>
        <button formaction="/showAll" formmethod="POST">To ShowALL</button>
    </div>
</form>
</body>
</html>
