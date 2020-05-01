<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>ユーザ登録</title>
  </head>
  <body>
    <h1>ユーザ登録</h1>
    <form action="/Sukkiri_Servlet/RegisterUser" method="post">
      <p>
        <label>ログインID：<input type="text" name="id"></label>
      </p>
      <p>
        <label>パスワード：<input type="password" name="pass"></label>
      </p>
      <p>
        <label>名前：<input type="text" name="name"></label>
      </p>
      <p>
        <input type="submit" value="確認">
      </p>
    </form>
  </body>
</html>