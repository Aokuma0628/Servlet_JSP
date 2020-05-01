<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>BMI診断</title>
  </head>
  <body>
    <h1>BMI診断</h1>
    <form action="/Sukkiri_Servlet/HealthCheck" method="post">
      <p>
        <label>身長:<input type="text" name="height"></label>
      </p>
      <p>
        <label>体重:<input type="text" name="weight"></label>
      </p>
      <p>
        <input type="submit" value="送信">
      </p>
    </form>
  </body>
</html>