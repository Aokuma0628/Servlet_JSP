<%@
page language="java"
contentType="text/html; charset=utf-8"
pageEncoding="utf-8"
%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>お問い合わせページ</title>
  </head>

  <body>
    <h1>問い合わせページ</h1>
    <form action="/Sukkiri_Servlet/Prac_5" method="post" accept-charset="utf-8" autocomplete="off">
      <p>
        <label>名前:<input type="text" name="name" size="20" maxlength="20"></label>
      </p>
      <p>
        <label>お問い合わせの種類:
          <select name="qtype" >
            <option value="company">会社について</option>
            <option value="product">製品について</option>
            <option value="support">アフターサポートについて</option>
        </select>
        </label>
      </p>
      <p>
        <label>お問い合わせ内容:
          <br><textarea name="body" cols="20" rows="3" ></textarea>
        </label>
      </p>
      <p>
        <input type="submit" value="送信">
      </p>
    </form>
  </body>
</html>