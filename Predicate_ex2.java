package java8;

import java.util.function.*;

public class Predicate_ex2 {

	public static void main(String[] args) {
		String[] s = {"ABCDEF", "XYZ", "LM", "Namitha", "pqr"};
		Predicate<String> p = i -> i.length() > 5;
		for(String s1 : s) {
			if(p.test(s1))
				System.out.println(s1);
		}
	}

}
