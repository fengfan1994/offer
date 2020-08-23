<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>注册界面</title>

    <!-- 新 Bootstrap4 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

    <!-- popper.min.js 用于弹窗、提示、下拉菜单 -->
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>

    <!-- 最新的 Bootstrap4 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>

<body th:src="/static/images/img8.jpg">

<!-- 注册表单 -->
<form  method="post" action="/emp/register" class="form-horizontal" style="margin-left:500px;margin-top:200px;">
    <div class="form-group">
        <label stype="display:inline;">姓名：</label>
        <input type="text"  class="form-control" placeholder="请输入姓名"
               id="insert_name" name="username" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label style="display:inline;">密码：</label>
        <input type="password" class="form-control" placeholder="请输入密码"
               id="insert_password" name="password" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label style="display:inline;">电话：</label>
        <input type="text"  class="form-control" placeholder="请输入电话号码" name="phonenum" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-horizontal">
        <label  class="col-md-2 control-label">
            性别：
        </label>
            <label class="radio-inline">
                <input type="radio" name="sex" value="男" checked />男
            </label>
            <label class="radio-inline">
                <input type="radio" name="sex" value="女" />女
            </label>
    </div>
    <div class="form-horizontal">
        <label  class="col-md-2 control-label">
            权限：
        </label>
        <label class="radio-inline">
            <input type="radio" name="role" value="6" checked />经理
        </label>
        <label class="radio-inline">
            <input type="radio" name="role" value="3" />员工
        </label>
    </div>
    <div>
        <label valign="middle" align="right">
            验证码:
            <img id="num" th:src="@{/user/code}" />
            <a href="javascript:;" onclick="document.getElementById('num').src = '/emp/code?'+(new Date()).getTime()">换一张</a>
        </label>
        <label valign="middle" align="left">
            <input id="kaptcha" type="text" class="inputgri" name="code" />
        </label>
    </div>
    <button type="submit" class="btn btn-primary">确认注册</button>
</form>


</body>
</html>