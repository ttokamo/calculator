<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype HTML>
<html>
<head>
    <%@ page contentType="text/html; charset=UTF-8" %>
    <meta charset="utf-8">
    <title>Hello</title>
</head>
<body>
</body>
    <h1>Регистрация</h1>
    ${exception}
    <form action="/finish-registration" accept-charset="UTF-8" method="post">
        <input type="text" placeholder="username *" name="username" autofocus/><br>
        <input type="password" placeholder="password *" name="password"/><br>
        <input type="password" placeholder="repassword *" name="repassword"/><br>
        <button type="submit">Регистрация</button>
    </form>
     Есть аккаунт ? <a href="/login"> Войдите ! </a>
</html>