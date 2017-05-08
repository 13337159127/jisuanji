package numberdemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Number
 */
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Number() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置字符集
		request.setCharacterEncoding("UTF-8");
		// 接收前台name的值
		String number = request.getParameter("digit");
		String chars=request.getParameter("character");
		// 把string类型转换成int类型
		int figure = Integer.valueOf(number);
	    //对变量值进行判断
		if (figure <= 5) {
			request.setAttribute("key", "凌晨好");
		}
		if (figure >= 6 && figure <= 12) {
			request.setAttribute("key", "上午好");
		}
		if (figure >= 13 && figure <= 20) {
			request.setAttribute("key", "下午好");
		}
		if (figure >= 20 && figure <= 24) {
			request.setAttribute("key", "晚上好");
		}
		request.setAttribute("key1", figure);
		RequestDispatcher re = request.getRequestDispatcher("numberdemo/index.jsp");
		re.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
