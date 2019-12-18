<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html lang="zh">
<head>
    <title>所有学生信息</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="${path}/css/bootstrap.min.css">
    <style type="text/css">
        body {
            padding-top: 60px;
            padding-bottom: 40px;
            font-family: "微软雅黑" "楷体";
        }

        #null{
            height: 200px;
            font-size: 20px;
            color: gray;
            text-align: center;
        }

    </style>
    <link rel="stylesheet" type="text/css" href="${path}/css/bootstrap-responsive.min.css">
    <link rel="shortcut icon" href="${path}/favicon.ico">
</head>



<body>
<hr/>
<div class="navbar navbar-inverse navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="brand" href="#"><font color="Orange">Baizhi 教学互动系统</font></a>

            <div class="nav-collapse collapse">


                <ul class="nav">
                    <li class="active"><a href="#">欢迎：xxx</a></li>
                    <li><a href="#about">关于</a></li>
                    <li><a href="#contact">联系我们</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">功能菜单 <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">修改密码</a></li>
                            <li class="nav-header">其它功能</li>
                            <li><a href="#">离开</a></li>
                        </ul>

                    </li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>
<div class="container">
    <!-- 模糊查询开始 -->
    <form action="${path}/student_showLike" method="post" id="queryForm">

        <div class="input-append" style="padding-left:40px">

            <select name="key" class="span3" id="sele" style="width: 150px;margin-left: 10px; border-radius:4px;" >
                <option value="sname" selected>学生名称</option>
                <option value="cname">班级名称</option>
            </select>

            <input value="" class="span2" type="text" placeholder="请输入姓名" name="name" style="width: 250px; height: 30px;margin-left: 10px; border-radius:4px;">&nbsp;
            <button class="btn" type="submit" style="margin-left: 10px; border-radius:10px;" >搜索</button>
            <button class="btn" type="submit" style="margin-left: 10px; border-radius:10px;" ><a href="${path}/student/add.jsp">添加</a> </button>
        </div>
    </form>
    <!-- 模糊查询结束 -->
    <table class="table table-hover" style="height: 250px;">
        <thead>

        <tr>
            <th style="text-align: center;"><a href="javascript:void(0)"   style="text-decoration: none; text-align: c">学号</a></th>
            <th style="text-align: center;"><a href="javascript:void(0)"  style="text-decoration: none;">学生名称</a></th>
            <th style="text-align: center;"><a href="javascript:void(0)"  style="text-decoration: none;">学生性别</a></th>
            <th style="text-align: center;"><a href="javascript:void(0)"  style="text-decoration: none;">联系电话</a></th>
            <th style="text-align: center;"><a href="javascript:void(0)"  style="text-decoration: none;">所属班级</a></th>
            <th style="text-align: center;"><a href="javascript:void(0)" style="text-decoration: none;" >操作</a></th>

        </tr>

        </thead>

        <!-- 展示数据 -->
        <tbody id="tbody">
        <tr style="display: none;"><th colspan="8">
            <div id="null">
                <div style="margin-top: 50px">
                    亲～没有找到符合条件的互动～
                </div>
                <div style="font-size: 15px; margin-top: 6px"><a href="#" style="text-decoration: none; margin-left: 100px;">那我创建一条</a></div>

            </div>
        </th>

        <%--循环开始--%>
        <c:forEach items="${sessionScope.student}" var="l">
        <tr height="10px;" >
        <tr>
            <th style="text-align: center;">${l.id}</th>
            <th style="text-align: center;">${l.name}</th>
            <th style="text-align: center;">${l.sex}</th>
            <th style="text-align: center;">${l.mobile}</th>
            <th style="text-align: center;">${l.clazz}</th>
            <th  style="text-align: center; ">
                <a href="${path}/teacher_showAll" style="text-decoration: none;" >创建互动</a>
                &nbsp;&nbsp;&nbsp;
                <a href="${path}/student/update.jsp?id=${l.id}" style="text-decoration: none;" >修改信息</a>
                &nbsp;&nbsp;&nbsp;
                <a href="${path}/student_delete?id=${l.id}" >删除</a>
            </th>
        </tr>
        </c:forEach>
        <%--循环结束--%>



        </tbody>
    </table>

    <div class="row">
        <div class="pagination" style="text-align: center;">
            <ul>
                <li class="disabled"><a href="javascript:void(0)" >上一页</a></li>
                <li><a href="#">1</a></li>
                <li class="disabled"><a href="javascript:void(0)" >下一页</a></li>
                <li><a href="javascript:v0oid(0)" hidden >下一页</a></li>
            </ul>
        </div>
    </div>
    <hr>
    <footer>
        <p>&copy; Company 2014</p>
    </footer>

</div> <!-- /container -->
<script type="text/javascript" src="${path}/js/jquery-1.5.2.min.js"></script>
<script type="text/javascript" src="${path}/js/bootstrap.js"></script>
</body>
</html>
