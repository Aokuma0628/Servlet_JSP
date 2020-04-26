<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="java.util.Date,
		java.text.SimpleDateFormat"
%>

<%
String[] luckArray = { "大吉", "中吉", "小吉", "凶"};
int index = (int)(Math.random() * 4);

Date date = new Date();
SimpleDateFormat sfmt = new SimpleDateFormat("MM月dd日HH時mm分ss秒");
String today = sfmt.format(date);

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>占い結果</title>
</head>

<body>
<h1>占いコーナー</h1>
<p>今日の日付:<%= today %>
<p>占いの結果は
	<b><%= luckArray[index] %></b>
です。</p>
<button type="button" name="b1">占う</button>

</body>

</html>