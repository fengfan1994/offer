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
                        <li><a href="${pageContext.request.contextPath}/adminEmp/getAll" >员工信息</a></li>
                    </ul>
                </li>
                <li class="first-li"><a>考勤管理</a>
                    <ul class="sub-li" style="display: none;">
                        <li><a href="${pageContext.request.contextPath}/file/upload" >文件上传</a></li>
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
            <c:forEach items="${pageInfo.list}" var="emps">
                <tr>
                    <td>${emps.id}</td>
                    <td>${emps.username}</td>
                    <td>${emps.phonenum}</td>
                    <td>${emps.sex}</td>
                    <c:if test="${emps.role==3}"><td>员工</td></c:if>
                    <c:if test="${emps.role==6}"><td>经理</td></c:if>
                    <c:if test="${emps.role==9}"><td>系统管理员</td></c:if>
                    <td><a href="${pageContext.request.contextPath}/adminEmp/update.do?id=${emps.id}" >编辑</a></td>
                </tr>
            </c:forEach>
            <!--显示分页信息-->
            </tbody>
        </table>
        <div class="row">
            <!--文字信息-->
            <div class="col-md-6">
                当前第 ${pageInfo.pageNum} 页，总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录
            </div>

            <!--点击分页-->
            <div class="col-md-6">
                <nav aria-label="Page navigation">
                    <ul class="pagination">

                        <li><a href="${pageContext.request.contextPath}/adminEmp/getAll?pageNum=1">首页</a></li>

                        <!--上一页-->
                        <li>
                            <c:if test="${pageInfo.hasPreviousPage}">
                                <a href="${pageContext.request.contextPath}/adminEmp/getAll?pageNum=${pageInfo.pageNum-1}" aria-label="Previous">
                                    <span aria-hidden="true">«</span>
                                </a>
                            </c:if>
                        </li>

                        <!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                            <c:if test="${page_num == pageInfo.pageNum}">
                                <li class="active"><a href="#">${page_num}</a></li>
                            </c:if>
                            <c:if test="${page_num != pageInfo.pageNum}">
                                <li><a href="${pageContext.request.contextPath}/adminEmp/getAll?pageNum=${page_num}">${page_num}</a></li>
                            </c:if>
                        </c:forEach>

                        <!--下一页-->
                        <li>
                            <c:if test="${pageInfo.hasNextPage}">
                                <a href="${pageContext.request.contextPath}/adminEmp/getAll?pageNum=${pageInfo.pageNum+1}"
                                   aria-label="Next">
                                    <span aria-hidden="true">»</span>
                                </a>
                            </c:if>
                        </li>

                        <li><a href="${pageContext.request.contextPath}/adminEmp/getAll?pageNum=${pageInfo.pages}">尾页</a></li>
                    </ul>
                </nav>
            </div>

        </div>
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
    <script language="JavaScript">
        function realSysTime(clock){
            var now=new Date();            //创建Date对象
            var year=now.getFullYear();    //获取年份
            var month=now.getMonth();    //获取月份
            var date=now.getDate();        //获取日期
            var day=now.getDay();        //获取星期
            var hour=now.getHours();    //获取小时
            var minu=now.getMinutes();    //获取分钟
            var sec=now.getSeconds();    //获取秒钟
            month=month+1;
            var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
            var week=arr_week[day];        //获取中文的星期
            var time=year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;    //组合系统时间
            clock.innerHTML=time;    //显示系统时间
        }
        window.οnlοad=function(){
            window.setInterval("realSysTime(clock)",1000);    //实时获取并显示系统时间
        }
    </script>

</body>
</html>