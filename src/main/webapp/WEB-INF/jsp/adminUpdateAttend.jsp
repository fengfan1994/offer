<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>修改考勤信息</title>
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/4.1.0/css/bootstrap.min.css">
    <script src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdn.bootcss.com/popper.js/1.12.5/umd/popper.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/4.1.0/js/bootstrap.min.js"></script>
</head>
<body>
<form  method="get" action="/adminAttend/update" style="margin-left:500px;margin-top:200px;">
    <%
        int id = Integer.parseInt(request.getParameter("id"));
    %>
    <div class="form-group">
        <label stype="display:inline;">工号：</label>
        <input type="text" value="<%=id %>"  class="form-control" name="id" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-group">
        <label stype="display:inline;">姓名：</label>
        <input type="text" class="form-control" name="username"
               placeholder="请输入姓名" style="display:inline;width:200px;" autocomplete="off" />
    </div>
    <div class="form-horizontal">
        <label  class="col-md-2 control-label">
            考勤状态：
        </label>
        <label class="radio-inline">
            <input type="radio" name="status" value="良好" checked />良好
        </label>
        <label class="radio-inline">
            <input type="radio" name="status" value="正常" checked />正常
        </label>
        <label class="radio-inline">
            <input type="radio" name="status" value="迟到" />迟到
        </label>
    </div>

    <button type="submit" class="btn btn-primary" onclick="register()">确认修改</button>
</form>
</body>
</html>