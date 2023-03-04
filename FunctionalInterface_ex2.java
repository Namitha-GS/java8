package java8;

/*
 * Add 2nos, using Lambda expression
 */

interface AddInterf {
	public int add(int a, int b);
}

public class FunctionalInterface_ex2 {

	public static void main(String[] args) {
		AddInterf i = (a,b) -> a+b;
		System.out.println(i.add(5, 1));
		System.out.println(i.add(10, 20));
		System.out.println(i.add(50, 2));
	}

}
