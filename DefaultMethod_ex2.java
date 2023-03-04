package java8;

interface DefaultInterf1 {
	default void m1() {
		System.out.println("Default m1()");
	}
}

public class DefaultMethod_ex2 implements DefaultInterf1 {
	
	public void m1() {
		System.out.println("Default m1() overridden");
	}

	public static void main(String[] args) {
		DefaultMethod_ex2 d = new DefaultMethod_ex2();
		d.m1();
	}

}
