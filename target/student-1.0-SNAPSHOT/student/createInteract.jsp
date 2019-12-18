<%--
  Created by IntelliJ IDEA.
  User: asvs
  Date: 2019/11/3
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html lang="zh">
<head>
    <title>创建互动</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/bootstrap.min.css">

    <script charset="utf-8" src="${path}/lang/zh_CN.js"></script>

    <style type="text/css">
        body {
            padding-top: 60px;
            padding-bottom: 40px;
            font-family: "微软雅黑" "楷体";
        }
    </style>
    <script type="text/javascript" src="${path}/js/jquery-1.5.2.min.js"></script>
    <script type="text/javascript" src="${path}/js/bootstrap.js"></script>



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
                    <li><a href="#" style="color: white;">欢迎：xxx</a></li>
                    <li><a href="#about">关于</a></li>
                    <li><a href="#contact">联系我们</a></li>
                    <li class="dropdown active">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">功能菜单 <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li class="divider"></li>
                            <li class="nav-header">其它功能</li>
                            <li><a href="#">修改密码</a></li>
                            <li><a href="${path}/logout">离开</a></li>
                        </ul>
                    </li>
                </ul>
            </div><!--/.nav-collapse -->
        </div>
    </div>
</div>

<div class="container" style="width: 800px;">
    <h3>创建互动</h3>
    <form class="form-horizontal form-actions" action="${path}/question_add" method="post" id="for">
        <div style="font-size: 18px">请填写互动标题：</div>
        <div class="control-group">
            <textarea rows="3" style="width:98% ;resize:none; height: 20px"></textarea>
        </div>

        <div class="control-group">
            <div style="font-size: 18px;" >请填写互动详情：</div>
            <textarea id="textarea"  name="content" style="width:99%; height:150px;" id="textarea"></textarea>
            <input type="hidden" id="textareaValue" name="textareaValue"/>
        </div>

        <input type="submit" class="btn" value="提交" style="margin-left: 65%; width:12%; margin-right: 5% "/>
        <input type="reset" class="btn" value="重置" style="width:12%"/>
    </form>

    <div class="alert alert-error"  id="error">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <strong>错误! </strong><span id="erroSpan"> 错误信息提示</span>
    </div>

    <div class="alert alert-success" id="success">
        <button type="button" class="close" data-dismiss="alert">&times;</button>
        <strong>消息! </strong> 保存成功
    </div>
    <hr>
    <footer>
        <p>&copy; Company 2014</p>
    </footer>

</div> <!-- /container -->

</body>
</html>

