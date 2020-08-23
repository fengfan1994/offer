<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>查询员工</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">

    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>

<body>
<!-- 注册表单 -->
<form  method="get" action="/emp/find" style="margin-left:500px;margin-top:200px;">
    <div class="form-group">
        <label stype="display:inline;">工号：</label>
        <input type="text" class="form-control" name="id" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label stype="display:inline;">姓名：</label>
        <input type="text" class="form-control" name="username" style="display:inline;width:200px;" autocomplete="off" />
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

    <button type="submit" class="btn btn-primary" onclick="register()">查询</button>
</form>
</body>
</html>