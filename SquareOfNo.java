package java8;
import java.util.function.*;

public class SquareOfNo {

	public static void main(String[] args) {
		Function<Integer, Integer> f = i -> i*i;
		System.out.println("Square of 5 is: "+f.apply(5));
		System.out.println("Square of 11 is: "+f.apply(11));
	}

}
