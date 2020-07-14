<%@ page language="java" import="java.util.*" pageEncoding="Utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'managestudent.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/body.css">

  </head>
  
  <body>
  	<a href="biaoll.action">图书管理</a>
    <div class="left">
  	    <div class="box">
  		    <form action="student.action" method="post">
  		    <div class="box-input">
  		    用户名：<input type="text" name="beener.username">
  		    </div>
  		    <div class="box-input">
  		    密码：<input type="text" name="beener.password">
  		    </div>
  		     操作：<input type="radio" name="beener.chaozuo" value="删除">删除<input type="radio" name="beener.chaozuo" value="添加">添加<input type="radio" name="beener.chaozuo" value="修改">修改<br>
  		    	<input type="submit" value="确定">
  		    </form>
  		</div>
  	</div>
  
    <div class="right">
    			<h1>用户管理</h1>
     <table border="1" width="600" id="customers">
   				<tr>
   				<th >用户名</th>
   				<th >密码</th>
   				</tr>
   		<s:iterator  value="#request.list">
   				<tr class="alt">
   				 <td align="center"> <s:property value="username"/></td>
   		         <td align="center"> <s:property value="password"/></td>
   		        </tr>
   		</s:iterator>
   		 </table>
    		</center>
    </div>
  </body>
</html>
