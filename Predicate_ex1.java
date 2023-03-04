package java8;

import java.util.function.*;

public class Predicate_ex1 {

	public static void main(String[] args) {
		/*
		 * Check whether Length of String is > than 5
		 */
		Predicate<String> p = s -> s.length() > 5;
		System.out.println(p.test("Namitha"));
		System.out.println(p.test("ABC"));
		
		/*
		 * Check whether Length of String is Even or not
		 */
		System.out.println();
		Predicate<String> p1 = s -> s.length()%2 == 0;
		System.out.println(p1.test("Namitha"));
		System.out.println(p1.test("ABCD"));
	}

}
