package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class ComparatorUsingLE {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(3);
		l.add(5);
		l.add(18);
		Comparator<Integer> c = (i1, i2) -> ((i1<i2) ? -1 : (i1>i2) ? 1 : 0);
		Collections.sort(l, c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
	}

}
