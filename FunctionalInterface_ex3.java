package java8;

interface SquareInterf {
	public int square(int n);
}

public class FunctionalInterface_ex3 {

	public static void main(String[] args) {
		SquareInterf i = n -> n*n;
		System.out.println(i.square(8));
		System.out.println(i.square(4));
	}

}
