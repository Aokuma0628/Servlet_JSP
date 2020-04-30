<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<%@ page import = "practice.Prac_4" %>

<%
Prac_4 emp = new Prac_4("0001", "田中さん");
String name = emp.getName();
String id = emp.getId();
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>練習問題4</title>
</head>

<body>
<% for(int i = 0; i < 10; i++){
	if(i % 3 == 0) {
%>
<p style = "color:red">
<% } else { %>
<p>
<% } %>
IDは<%= id %>, 名前は<%= name %>です。</p>
<% } %>
</body>
</html>