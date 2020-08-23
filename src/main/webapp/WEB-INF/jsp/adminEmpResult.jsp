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
<!-- 一个典型的上左右布局demo -->
<div class="container"  style="border-color: aquamarine;color: cornflowerblue">欢迎登陆</div>
<div class="container">
    <div class="row">
        <!-- 一个简单的二级菜单，可以用其他插件自行修改 -->
        <div class="col-md-2"  >
            <ul>
                <li class="first-li"><a>员工管理</a>
                    <ul class="sub-li" style="display: none;">
                        <li><a href="${pageContext.request.contextPath}/adminEmp/find.do" >员工查找</a></li>
                        <li><a href="${pageContext.request.contextPath}/adminEmp/update.do" >员工信息更新</a></li>
                    </ul>
                </li>
                <li class="first-li"><a>考勤管理</a>
                    <ul class="sub-li" style="display: none;">
                        <li><a href="${pageContext.request.contextPath}/adminAttend/getAll.do" >考勤详情</a></li>
                        <li><a href="${pageContext.request.contextPath}/adminAttend/getByStatus.do" >考勤查询</a></li>
                    </ul>
                </li>
            </ul>
        </div>
        <div class="col-md-7">
            <h4  class="text-left" style="color: green">中国农业银行祝您生活愉快</h4>
        </div>
        <div class="col-md-3">
            <p class="text-right"><%=(new java.util.Date()).toLocaleString()%> </p>
            <p class="text-right" style="color: chartreuse"><a href="/emp/login.do">注销</a> </p>
        </div>
    </div>
</div>

<div class="container">

    <div class="col-md-2" >
        <div class="panel panel-warning">
            <div class="panel-heading">每日诗歌</div>
            <div class="panel-body">
                秋丛绕舍似陶家，遍绕篱边日渐斜。
                不是花中偏爱菊，此花开尽更无花。
            </div>
        </div>
    </div>
    <div class="col-md-9">
        <h2  class="text-center">员工信息列表</h2>
        <table class="table table-hover" >
            <thead>
            <tr>
                <th >员工id</th>
                <th >姓名</th>
                <th >手机号</th>
                <th >性别</th>
                <th >权限</th>
                <th >操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${empList}" var="emps">
                <tr>
                    <td>${emps.id}</td>
                    <td>${emps.username}</td>
                    <td>${emps.phonenum}</td>
                    <td>${emps.sex}</td>
                    <c:if test="${emps.role==3}"><td>员工</td></c:if>
                    <c:if test="${emps.role==6}"><td>经理</td></c:if>
                    <c:if test="${emps.role==9}"><td>系统管理员</td></c:if>
                    <td><a href="${pageContext.request.contextPath}/adminEmp/update.do?id=${attends.id}">编辑</a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

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