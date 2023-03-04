package java8;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_ex1 {

	public static void main(String[] args) {
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}

}
