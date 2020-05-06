<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.UserInfo"
%>

<%
UserInfo loginUser = (UserInfo)session.getAttribute("loginUser");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>どこつぶ</title>
  </head>
  <body>
    <h1>ログイン</h1>
      <% if (loginUser != null) { %>
      <p>ログインに成功しました。</p>
      <p>ようこそ「<%= loginUser.getName() %>」さん</p>
      <p>
        <a href="/Sukkiri_Servlet/Main">メイン画面へ</a>
      </p>
      <% } else { %>
      <p>ログインに失敗しました</p>
      <p>
        <a href="/Sukkiri_Servlet">Topへ</a>
      </p>
      <% } %>
  </body>
</html>