package calculate;

/**
 * 实现接口描述的加减乘除四则运算
 * 
 * @author lenovo
 *
 */
public class CountTest implements Count {

	@Override
	public int plus(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}

	@Override
	public int ride(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public int divide(int a, int b) {
		// TODO Auto-generated method stub
		return a / b;
	}

}
