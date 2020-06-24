<%--
  Created by IntelliJ IDEA.
  User: 浩劫
  Date: 2019/6/3
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta charset="UTF-8">
  <link type="text/css" rel="stylesheet" href="css/style.css">
  <title>登录—温州商学院课表系统</title>
</head>
<body id="login">
<section>
  <form id="form" name="form" method="post" action="login.do?method=1">
    <input type="password" name="number" class="in">
    <br/>
    <input type="password" name="pwd" class="in">
    <div id="choose">
      <input type="radio" name="occupation" value="teacher" checked="checked">教师
      <input type="radio" name="occupation" value="student">学生
    </div>
    <input type="submit" value="登  录" id="loginbutton">
  </form>
</section>
</body>
</html>
