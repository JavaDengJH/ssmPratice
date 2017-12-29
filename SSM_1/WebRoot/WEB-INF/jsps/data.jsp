<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>  --%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>data page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <table>
    <tr><td>编号</td><td>姓名</td><td>身份证号</td><td>手机号</td></tr>
	<c:forEach items="${customers }" var="c">
		<tr><td>${c.customerID}</td><td>${c.customerName}</td><td>${c.customerIDCard }</td><td>${c.customerPhone}</td></tr>
	</c:forEach>
    </table>
  </body>
</html>
