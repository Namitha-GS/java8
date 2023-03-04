package java8;

interface Abc {
	public static void m1() {
		System.out.println("m1()");
	}
}
public class StaticMethods_ex1 {

	public static void main(String[] args) {
		Abc.m1();
	}

}
