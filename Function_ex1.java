package java8;

import java.util.function.Function;

public class Function_ex1 {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("Namitha"));
		
		Function<String, String> fu = s -> s.toUpperCase();
		System.out.println(fu.apply("namitha"));
	}

}
