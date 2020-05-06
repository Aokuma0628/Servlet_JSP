<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.UserInfo, model.Mutter, java.util.List"
%>

<%
UserInfo loginUser = (UserInfo) session.getAttribute("loginUser");
List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");
String errMsg = (String) request.getAttribute("errMsg");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>どこつぶ</title>
  </head>
  <body>
    <h1>どこつぶメイン</h1>
    <p>
      「<%= loginUser.getName() %>」さんがログイン中です。
    </p>
    <p>
      <a href="/Sukkiri_Servlet/Logout">ログアウトする</a>
    </p>
    <p>
      <a href="/Sukkiri_Servlet/Main">更新する</a>
    </p>
    <form action="/Sukkiri_Servlet/Main" method="post">
      <p>
        つぶやき欄：<input type="text" name="text">
      </p>
      <p>
        <input type="submit" value="つぶやく">
      </p>
    </form>
    <% if (errMsg != null) { %>
    <p> <%= errMsg %> </p>
    <% } %>
    <% for (Mutter mutter : mutterList) { %>
      <p>
        <%= mutter.getUserName() %>：<%= mutter.getText() %>
      </p>
    <% } %>
  </body>
</html>