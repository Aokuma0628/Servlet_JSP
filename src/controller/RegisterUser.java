package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import model.User;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    String forwardPath = null;

    //リクエストからactionパラメータを取得
    String action = request.getParameter("action");

    if (action == null) {
        forwardPath = "/WEB-INF/jsp/registerForm.jsp";
    }
    else if (action.equals("done")) {
      HttpSession session = request.getSession();

      //セッションスコープから登録ユーザのインスタンスを取得
      User registerUser = (User) session.getAttribute("resterUser");

      //ユーザの登録(仮)
      RegisterUserLogic logic = new RegisterUserLogic();
      logic.execute(registerUser);

      //セッションスコープの削除
      session.removeAttribute("resisterUser");

      forwardPath = "/WEB-INF/jsp/registerDone.jsp";
    }
    //jspファイルにフォワード
    RequestDispatcher dispatcher =
        request.getRequestDispatcher(forwardPath);
    dispatcher.forward(request, response);
  }

  protected void doPost(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    request.setCharacterEncoding("UTF-8");

    //リクエストからパラメータを取得
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String pass = request.getParameter("pass");

    //リクエストの情報を用いてインスタンスの生成
    User registerUser = new User(id, name, pass);

    //セッションスコープに登録ユーザを保存
    HttpSession session = request.getSession();
    session.setAttribute("registerUser", registerUser);

    //jspファイルにフォワード
    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
    dispatcher.forward(request, response);
  }
}
