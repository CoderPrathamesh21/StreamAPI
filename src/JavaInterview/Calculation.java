package JavaInterview;

public class Calculation implements Calculate{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation cal = new Calculation();
		
		cal.sum(12, 21);
		cal.sub(42, 21);
		cal.mul(12, 21);
		cal.div(42, 21);
		
	}

	@Override
	public int sum(int a, int b) {
		int add = a+b;
		System.out.println(add);
		return add;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		int add = a-b;
		System.out.println(add);
		return add;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		int add = a*b;
		System.out.println(add);
		return add;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		int add = a/b;
		System.out.println(add);
		return add;
	}

}
