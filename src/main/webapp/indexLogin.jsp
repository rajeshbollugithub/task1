<%@page import="dto.UserData"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	List<UserData> data =(List)request.getAttribute("key");
	%>
	
	
	<table>
	<tr>
	<th>ID</th>
	<th>name</th>
	<th>age</th>
	<th>dob</th>
	<th>email</th>
	</tr>
	<tr>
	<% for (UserData data2:data){ %>
	<td><%=    data2.getId()%></td>
	<td><%= data2.getUserName() %></td>
	<td><%= data2.getUserAge() %></td>
	<td><%= data2.getUserDob()%></td>
	<td><%= data2.getUserEmail() %></td>
	<%} %>
	</tr>
	
	
	</table>
</body>
</html>