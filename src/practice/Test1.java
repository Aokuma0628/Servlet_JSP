package practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test1
 */
@WebServlet("/practice")
public class Test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet
	 * #doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response
	) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//占いの運勢をランダムで決定
		String[] luckArray = {"大吉", "中吉", "小吉", "凶"};
		int index = (int)(Math.random() * 4);
		String luck = luckArray[index];

		//実行日の取得
		Date date = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("MM月dd日HH時mm分");
		String today = fmt.format(date);

		//HTML出力
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>占いコーナー</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>" + today + "の運勢は「" + luck + "」です。...</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet
	 * #doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(
	HttpServletRequest request,
	HttpServletResponse response
	) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
