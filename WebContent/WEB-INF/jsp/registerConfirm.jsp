<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.User"
%>

<%
User registerUser = (User) session.getAttribute("registerUser");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>ユーザ確認画面</title>
  </head>
  <body>
    <h1>ユーザ確認画面</h1>
    <h2>下記のユーザを登録します</h2>
    <p>
      <label>ログインID：<%= registerUser.getId() %></label>
    </p>
    <p>
      <label>名前：<%= registerUser.getName() %></label>
    </p>
    <p>
      <a href="/Sukkiri_Servlet/RegisterUser">戻る</a><br>
      <a href="/Sukkiri_Servlet/RegisterUser?action=done">登録</a>
    </p>
  </body>
</html>