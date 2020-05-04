<%@
page language="java"
contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"
import="model.SiteEV"
%>

<%
SiteEV siteEV = (SiteEV) application.getAttribute("siteEV");
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>ユーザインデックス</title>
  </head>
  <body>
    <h1>ユーザインデックス</h1>
    <p>
      <a href="/Sukkiri_Servlet/UserIndex?action=like">いいね</a>：
        <%= siteEV.getLike() %>人です。
    </p>
    <p>
      <a href="/Sukkiri_Servlet/UserIndex?action=dislike">よくないね</a>：
        <%= siteEV.getDislike() %>人です。
    </p>
  </body>
</html>