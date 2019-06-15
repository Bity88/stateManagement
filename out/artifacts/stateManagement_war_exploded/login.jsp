<%--
  Created by IntelliJ IDEA.
  controller.User: baniy
  Date: 6/12/2019
  Time: 10:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>controller.Login</title>
</head>
<body>

<form action = "/login" method="post">
        <fieldset>
      <label>Username:</label><br/>
        <input id="username" name="username" value="${cookie.username.value}"><br/>

        <label>Password</label><br/>
        <input id = "password" name="password" >
        <br/>

        <label>Remember me</label>
        <input type="checkbox" id="remember" name="remember" ${cookie.username.value !=null ? "checked": null}>

         <br/>

        <input type="submit" value="Login" >


        </fieldset>

    </form>

</body>
</html>
