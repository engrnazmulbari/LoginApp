<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "org.login.dto.User" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<h1>Login Successful!!!</h1>
	<jsp:useBean id="user" class="org.login.dto.User" scope="request">
		<jsp:setProperty property="userName" name="user" value="new user" />
	</jsp:useBean>
	<%--
		User user = (User)request.getAttribute("user");
		
	--%>
	Hi <%--= user.getUserName() --%>
	Hello <jsp:getProperty property="userName" name="user"/>
	
</body>
</html>