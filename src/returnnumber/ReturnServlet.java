package returnnumber;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReturnServlet
 */
public class ReturnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReturnServlet() {
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
		// 接收前台参数
		String figure = request.getParameter("count");
		String math = request.getParameter("digit");
		String chars = request.getParameter("number");
		// 把string类型转换成int类型
		int integer = Integer.valueOf(figure);
		int integertype = Integer.valueOf(math);
		// 定义字符串
		String name = "";
		// 循环i的值
		for (int i = integer; i <= integertype; i++) {
			name = name + "." + i;
		}
		request.setAttribute("sum", integer);
		request.setAttribute("total", integertype);
		request.setAttribute("character", name);
		RequestDispatcher re = request.getRequestDispatcher("returnnumber/index.jsp");
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
