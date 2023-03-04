package java8;

import java.util.function.*;

class Movie {
	String name;
	Movie(String name){
		this.name = name;
	}
}

public class Consumer_ex3 {

	public static void main(String[] args) {
		Movie m = new Movie("Spider");
		Consumer<Movie> c1 = s -> System.out.println(s.name+"A");
		Consumer<Movie> c2 = s -> System.out.println(s.name+"B");
		Consumer<Movie> c3 = s -> System.out.println(s.name+"C");
		
		Consumer<Movie> cc = c1.andThen(c2).andThen(c3);
		cc.accept(m);
	}

}
