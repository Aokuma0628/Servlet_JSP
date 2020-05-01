<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.Health"
%>

<%
Health health = (Health) request.getAttribute("health");
%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>BMI診断結果</title>
  </head>
  <body>
    <h1>BMI診断結果</h1>
    <p>
      身長：<%= health.getHeight() %><br>
      体重：<%= health.getWeight() %><br>
      BMI：<%= health.getBmi() %><br>
      体系：<%= health.getBodyType() %>
    </p>
    <p>
      <a href="/Sukkiri_Servlet/HealthCheck">戻る</a>
    </p>
  </body>
</html>