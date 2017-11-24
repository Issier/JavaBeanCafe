<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring Security Example </title>
    </head>
    <body>
        <c:if test="${param.error}">
            Invalid username and password.
        </c:if>
        <c:if test="${param.logout}">
            You have been logged out.
        </c:if>
        <c:url var="loginURL" value="/login"/>
        <form action="${loginURL}" method="post">
            <div><label> User Name : <input type="text" name="username"/> </label></div>
            <div><label> Password: <input type="password" name="password"/> </label></div>
            <div><input type="submit" value="Sign In"/></div>
        </form>
    </body>
</html>