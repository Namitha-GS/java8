package java8;

/*
 *   @FunctionalInterface - if we dont declare also, it is a FunctionalInterface itself,
 *   becoz of single abstract method
 *   
 *   Lets print Hello
 */
@FunctionalInterface
interface Interf {
	public void m1();
}

public class FuctionalInterface_ex1 {

	public static void main(String[] args) {
		Interf i = () -> System.out.println("Hello");
		i.m1();
		i.m1();
		i.m1();
	}

}
