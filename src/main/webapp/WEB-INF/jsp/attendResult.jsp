<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>主页</title>
    <link rel="stylesheet" href="./css/index.css">
    <link rel="stylesheet" href="/webjars/bootstrap/3.3.5/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.1.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</head>

<body>
<div class="header">欢迎登陆</div>
<div class="container">
    <div class="left">
        <!-- 一个简单的二级菜单，可以用其他插件自行修改 -->
        <div class="menu">
            <ul>
                <li class="first-li"><a>员工管理</a>
                    <ul class="sub-li" style="display: none;">
                        <li><a href="${pageContext.request.contextPath}/emp/find.do" >员工查找</a></li>
                        <li>员工信息更新</li>
                    </ul>
                </li>
                <li class="first-li"><a>考勤管理</a>
                    <ul class="sub-li" style="display: none;">
                        <li><a href="${pageContext.request.contextPath}/attend/getByStatus.do">考勤查询</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>

</div>

<table class="table table-hover">
    <thead>
    <tr>
        <th >员工id</th>
        <th >姓名</th>
        <th >考勤</th>
        <th >时间</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${attendList}" var="attends">
        <tr>
            <td>${attends.id}</td>
            <td>${attends.username}</td>
            <td>${attends.status}</td>
            <td>${attends.time}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="./js/jquery.min.js"></script>
<script>
    // 菜单切换
    $('.first-li').click(function(){
        $(this).children('ul').show();
        $(this).siblings('li').children('ul').hide();
    })
</script>
</body>
</html>