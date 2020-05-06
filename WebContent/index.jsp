<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>どこつぶ</title>
  </head>
  <body>
    <h1>どこつぶ</h1>
    <form action="/Sukkiri_Servlet/Login" method="post">
      <p>
        <label>ユーザ名：<input type="text" name="name"
                            autocomplete="off" required>
        </label>
      </p>
      <p>
        <label>パスワード：<input type="password" name="pass"
                             autocomplete="off" required>
        </label>
      </p>
      <p>
        <input type="submit" value="ログイン">
      </p>
    </form>
  </body>
</html>