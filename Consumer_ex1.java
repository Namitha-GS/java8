package java8;

import java.util.function.*;

public class Consumer_ex1 {

	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("namitha");
		c.accept("abc");
	}

}
