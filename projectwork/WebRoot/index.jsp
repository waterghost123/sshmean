<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/hello.css">
  </head>
  
  <body>
   <div class="box">
   <h2>
   图书管理系统
   </h2>
   	<form action="book.action" method="post">
   	<div class="radio-box">
   	<input type="text" name="beener.username"  required=""/>
   		     <label>username</label>			
   	</div>
   <div class="radio-box">
   			<input type="password" name="beener.password" required=""/>
   			<label>password</label>
  </div>
   	<div class="radio-1">
   	人员类型：<input type="radio" name="beener.who" value="学生"/>学生<input type="radio" name="beener.who" value="管理员"/>管理员
   	</div>
   	<div class="radio-2">
   	操作：<input type="radio" name="beener.caozuo" value="注册"/>注册<input type="radio" name="beener.caozuo" value="登陆"/>登陆
   	</div>
   	<div class="submit">
   	<input type="submit" value="确定"/>
   	</div>
   	</form>
   </div>
  </body>
</html>
