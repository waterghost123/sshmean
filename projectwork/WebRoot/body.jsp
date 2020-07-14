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
    
    <title>My JSP 'body.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/body.css">
	
  </head>
  
  <body>
  	<div class="ing">
  	<a href="index.jsp">退出登录</a>
  	</div>
  	<div>
  	<a href="biaobb.action">学生账号管理</a>
  	</div>
  	
  	<div class="left">
  	    <div class="box">
  		    <form action="bookshow.action" method="post">
  		    <div class="box-input">
  		    编号：<input type="text" name="twobeener.indentifier">
  		    </div>
  		    <div class="box-input">
  		    书名：<input type="text" name="twobeener.bookname">
  		    </div>
  		    <div class="box-input">
  		    数量：<input type="text" name="twobeener.number">
  		    </div>
  		    操作：<input type="radio" name="twobeener.chaozuo" value="删除">删除<input type="radio" name="twobeener.chaozuo" value="添加">添加<input type="radio" name="twobeener.chaozuo" value="修改">修改<br>
  		    	<input type="submit" value="确定">
  		    </form>
  		</div>
  	</div>
  
    <div class="right">
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
       <script>
!function(){
	function n(n,e,t){
		return n.getAttribute(e)||t
	}
	function e(n){
		return document.getElementsByTagName(n)
	}
	function t(){
		var t=e("script"),o=t.length,i=t[o-1];
		return{
			l:o,z:n(i,"zIndex",-1),o:n(i,"opacity",.5),c:n(i,"color","0,0,0"),n:n(i,"count",122)
		}
	}
	function o(){
		a=m.width=window.innerWidth||document.documentElement.clientWidth||document.body.clientWidth,c=m.height=window.innerHeight||document.documentElement.clientHeight||document.body.clientHeight
	}
	function i(){
		r.clearRect(0,0,a,c);var n,e,t,o,m,l;
		s.forEach(function(i,x){
			for(i.x+=i.xa,i.y+=i.ya,i.xa*=i.x>a||i.x<0?-1:1,i.ya*=i.y>c||
				i.y<0?-1:1,
				r.fillRect(i.x-.5,i.y-.5,1,1),e=x+1;
				e<u.length;e++)n=u[e],
				null!==n.x&&null!==n.y&&(o=i.x-n.x,m=i.y-n.y,l=o*o+m*m,l<n.max&&(n===y&&l>=n.max/2&&(i.x-=.03*o,i.y-=.03*m),t=(n.max-l)/n.max,
					r.beginPath(),
					r.lineWidth=t/2,
					r.strokeStyle="rgba("+d.c+","+(t+.2)+")",
					r.moveTo(i.x,i.y),
					r.lineTo(n.x,n.y),r.stroke()))
	}),
		x(i)}var a,c,u,m=document.createElement("canvas"),d=t(),l="c_n"+d.l,
		r=m.getContext("2d"),x=window.requestAnimationFrame||window.webkitRequestAnimationFrame||
		window.mozRequestAnimationFrame||
		window.oRequestAnimationFrame||
		window.msRequestAnimationFrame||
		function(n){
			window.setTimeout(n,1e3/45)
		},
		w=Math.random,y={
			x:null,y:null,max:2e4
		};
		m.id=l,m.style.cssText="position:fixed;top:0;left:0;z-index:"+d.z+";opacity:"+d.o,e("body")[0]
		.appendChild(m),o(),window.οnresize=o,
		window.οnmοusemοve=function(n){
			n=n||
			window.event,y.x=n.clientX,y.y=n.clientY
		},
		window.οnmοuseοut=function(){
			y.x=null,y.y=null
		};
		for(var s=[],f=0;d.n>f;f++){
			var h=w()*a,g=w()*c,v=2*w()-1,p=2*w()-1;s.push({
				x:h,y:g,xa:v,ya:p,max:6e3
			})
		}
		u=s.concat([y]),setTimeout(function(){
			i()
		},100)
	}();
</script>

	


     
	
  </body>
</html>
