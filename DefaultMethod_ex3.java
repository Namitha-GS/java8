package java8;

interface Left {
	default void m1() {
		System.out.println("Left m1()");
	}
}

interface Right {
	default void m1() {
		System.out.println("Right m1()");
	}
}

public class DefaultMethod_ex3 implements Left, Right {

	public void m1() {
		//System.out.println("Our own m1()");
		Left.super.m1();
	}
	
	public static void main(String[] args) {
		DefaultMethod_ex3 d = new DefaultMethod_ex3();
		d.m1();
	}

}
