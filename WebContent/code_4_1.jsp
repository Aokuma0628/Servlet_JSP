
<%--Javaコード --%>
<%--JSPファイルの設定 --%>
<%@
	page contentType = "text/html;
	charset = UTF-8"
	pageEncoding = "UTF-8"
%>
<%--本文 --%>
<%
	String name = "Aosan Test";
	int age = 24;
%>

<%--HTMLコード --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSPサンプルページ</title>
</head>

<body>
私の名前は<%= name %>です。年齢は<%= age %>才です。
</body>
</html>