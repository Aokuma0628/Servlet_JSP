package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Health;
import model.HealthCheckLogic;

@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
  private static final long serialVersionUID = 1L;


  protected void doGet(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
    dispatcher.forward(request, response);
  }

  protected void doPost(
      HttpServletRequest request,
      HttpServletResponse response)
      throws ServletException, IOException {

    String weight = request.getParameter("weight");
    String height = request.getParameter("height");

    Health health = new Health();
    health.setHeight(Double.parseDouble(height));
    health.setHWeight(Double.parseDouble(weight));

    HealthCheckLogic healthCheckLogic = new HealthCheckLogic();
    healthCheckLogic.execute(health);

    //リクエストスコープに保存
    request.setAttribute("health", health);

    RequestDispatcher dispatcher =
        request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
    dispatcher.forward(request, response);


  }

}
