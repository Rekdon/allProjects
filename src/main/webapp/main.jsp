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
        border-radius: 10%;
        width:120px;
        height:75px;
    }

    .b2 {
        background: #d80300;
        color: white;
        border-radius: 10%;
        width:120px;
        height:75px;
    }

    .b3 {
        background: #12b8b7;
        color: white;
        border-radius: 10%;
        width:120px;
        height:75px;
    }
</style>
<form>
    <div class="container">
        <div style="text-align: center;">
          <div style="font-size: 200%">  Your choice</div></br>
            <button  formaction="/add" class="b1" formmethod="POST">ADD/UPDATE</button>
            <button  formaction="/showAll" class="b2" formmethod="POST">ALL INFO</button>
            <button  formaction="/inputId" class="b3" formmethod="POST">SEARCH</button></br></br>
            <p><img src="/acb.png" alt="Письма мастера дзен"></p>
        </div>
    </div>
</form>
</body>
</html>
