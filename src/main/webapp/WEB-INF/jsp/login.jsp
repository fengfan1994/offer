<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>登录界面</title>

    <!-- 新 Bootstrap4 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

    <!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>

    <!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>

<body>
<<form  method="get" action="/emp/login" style="margin-left:500px;margin-top:200px;">
    <div class="form-group">
        <label stype="display:inline;">姓名：</label>
        <input type="text" class="form-control" name="username"
               placeholder="请输入姓名" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label  style="display:inline;">密码：</label>
        <input type="password" class="form-control" name="password"
               placeholder="请输入密码" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <button type="submit" class="btn-primary" onclick="login()">登录</button>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <button  type="submit" class="btn-default"><a href="${pageContext.request.contextPath}/emp/register.do" >注册账号</a></button>

</form>
</body>
</html>