package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mutter;
import model.PostMutterLogic;
import model.UserInfo;

@WebServlet("/Main")
public class Main extends HttpServlet {
  private static final long serialVersionUID = 1L;

  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    //アプリケーションスコープからつぶやきリストの取得
    ServletContext application = this.getServletContext();
    List<Mutter> mutterList =
        (List<Mutter>) application.getAttribute("mutterList");

    //NUllの場合は新規作成
    if (mutterList == null) {
      mutterList = new ArrayList<>();
      application.setAttribute("mutterList", mutterList);
    }

    //セッションスコープからログインユーザ情報の取得
    HttpSession session = request.getSession();
    UserInfo userInfo = (UserInfo) session.getAttribute("loginUser");
    System.out.println("セッションID：" + session);

    //ログインユーザの有無で画面遷移先を変更
    if (userInfo == null) {
      response.sendRedirect("/Sukkiri_Servlet/");
    } else {
      RequestDispatcher dispatcher =
          request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
      dispatcher.forward(request, response);
    }
  }

  protected void doPost(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {
    //パラメータ取得
    request.setCharacterEncoding("UTF-8");
    String text = request.getParameter("text");

    //入力値チェック
    if (text != null && text.length() != 0) {
      //リストの取得
      ServletContext application = this.getServletContext();
      List<Mutter> mutterList = (List<Mutter>) application.getAttribute("mutterList");

      //ログインユーザの取得
      HttpSession session = request.getSession();
      UserInfo loginUser = (UserInfo) session.getAttribute("loginUser");

      //つぶやきの作成
      Mutter mutter = new Mutter(loginUser.getName(), text);
      PostMutterLogic postMutterLogic = new PostMutterLogic();
      postMutterLogic.execute(mutter, mutterList);
    } else {
      //未入力のエラーメッセージ
      request.setAttribute("errMsg", "未入力です。");
    }

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
    dispatcher.forward(request, response);

  }
}
