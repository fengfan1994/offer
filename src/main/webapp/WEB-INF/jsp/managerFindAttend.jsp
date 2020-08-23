<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8" />
    <title>查询考勤记录</title>

    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">

    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>

    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>

    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>

</head>

<body>
<!-- 注册表单 -->
<form  method="get" action="/managerAttend/find" style="margin-left:500px;margin-top:200px;">
    <div class="form-group">
        <label stype="display:inline;">权限：</label>
        <input type="text" class="form-control" name="role" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label stype="display:inline;">考勤状态：</label>
        <input type="text" class="form-control" name="status" style="display:inline;width:200px;" autocomplete="off" />
    </div>

    <button type="submit" class="btn btn-primary" onclick="register()">查询</button>
</form>
</body>
</html>