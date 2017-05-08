package calculate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置字符集
		request.setCharacterEncoding("UTF-8");
		//变量接收前台传过来 的参数
		String figures=request.getParameter("figure");
		String number=request.getParameter("number");
		//如果传进来字符串为空  或者 参数为空  返回页面
		if(figures==null || "".equals(figures) || (number==null || "".equals(number))){
		RequestDispatcher re=request.getRequestDispatcher("calculate/index.jsp");
		re.forward(request, response);
		return;
		}
		String computerType=request.getParameter("computerType");
		//把string类型转换成int类型
		int digit=Integer.valueOf(figures);
		int math=Integer.valueOf(number);
		//实列化类  创建对象 用接口类型变量接收实现类
		Count counttest=new CountTest();
		//定义总和的值
		int sum=0;
		//判断加减乘除
		if("+".equals(computerType)){
			sum=counttest.plus(digit, math);
		}
		if("-".equals(computerType)){
			sum=counttest.subtract(digit, math);
		}
		if("*".equals(computerType)){
			sum=counttest.ride(digit, math);
		}
		if("/".equals(computerType)){
			sum=counttest.divide(digit, math);
		}
		//向前台传值
		request.setAttribute("total", sum);
		request.setAttribute("addend", digit);
		request.setAttribute("augend", math);
		System.out.println("输出总和的值等于："+sum);
		//跳转页面
		RequestDispatcher re=request.getRequestDispatcher("calculate/index.jsp");
		re.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
