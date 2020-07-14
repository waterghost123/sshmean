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
    
    <title>My JSP 'bookshow.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/body.css">
	

  </head>
  
  <body>
  	<a href="index.jsp">退出登录</a>
  	
    <div class="right">
    	 <center>
    			<h1>图书信息管理</h1>
     <table border="1" width="600" id="customers">
   				<tr>
   				<th >编号</th>
   				<th >书名</th>
   				<th >数量</th>
   				</tr>
   		<s:iterator  value="#request.list">
   				<tr class="alt">
   				 <td align="center"> <s:property value="indentifier"/></td>
   		         <td align="center"> <s:property value="bookname"/></td>
   		         <td align="center"> <s:property value="number"/></td>
   		        </tr>
   		</s:iterator>
   		 </table>
    		</center>
    </div>
  </body>
</html>
