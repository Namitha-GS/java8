package java8;

interface DefaultInterf {
	default void m1() {
		System.out.println("Default m1()");
	}
}

public class DefaultMethod_ex1 implements DefaultInterf {
	
	public static void main(String[] args) {
		DefaultMethod_ex1 d = new DefaultMethod_ex1();
		d.m1();
	}
  
}
