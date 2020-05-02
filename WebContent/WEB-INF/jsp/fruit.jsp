<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.Fruit"
%>

<%
Fruit fruit = (Fruit) session.getAttribute("fruit");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>フルーツ単価</title>
  </head>
  <body>
    <h1>フルーツ単価</h1>
    <p>
      フルーツ情報：<%=fruit.getName() %>の単価は<%=fruit.getPrice() %>です。
    </p>
  </body>
</html>