package java8;
import java.util.function.*;

public class Predicate_ex4 {

	public static void main(String[] args) {
		int[] a = {0, 5, 10, 15, 20, 25};
		Predicate<Integer> p1 = i -> i>6;
		Predicate<Integer> p2 = i -> i%2 == 0;
		for(int x : a) {
			if(p1.and(p2).test(x))
				System.out.println(x);
		}
		System.out.println();
		for(int x : a) {
			if(p1.or(p2).test(x))
				System.out.println(x);
		}
		System.out.println();
		for(int x : a) {
			if(p1.negate().test(x))
				System.out.println(x);
		}
	}

}
