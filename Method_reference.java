package java8;

interface MethodRefInterf {
	public void add(int a, int b);
}

public class Method_reference {
	
	public static void sum(int x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		MethodRefInterf a = Method_reference :: sum;
		a.add(10, 20);
		a.add(100, 200);
	}

}
