package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.UserInfo;

@WebServlet("/Login")
public class Login extends HttpServlet {
  private static final long serialVersionUID = 1L;

  /*protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

  }*/

  protected void doPost(
    HttpServletRequest request,
    HttpServletResponse response)
    throws ServletException, IOException {
    //リクエストからパラメータの取得
    request.setCharacterEncoding("UTF-8");
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");

    System.out.println("名前：" + name + "\nパス：" + pass);

    //リクエストの情報からユーザ情報インスタンスを作成
    UserInfo userInfo = new UserInfo(name, pass);

    //ログイン認証
    LoginLogic loginLogic = new LoginLogic();
    boolean isLogin = loginLogic.execute(userInfo);

    //ログイン認証に成功した場合、セッションスコープに保存
    HttpSession session = request.getSession();
    if (isLogin) {
      session.setAttribute("loginUser", userInfo);
    } else if (session.getAttribute("loginUser") != null){
      session.removeAttribute("loginUser");
    }

    //ログイン結果画面にフォワード
    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/userResult.jsp");
    dispatcher.forward(request, response);
  }
}
