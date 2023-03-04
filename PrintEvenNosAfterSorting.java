package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PrintEvenNosAfterSorting {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(5);
		l.add(2);
		l.add(7);
		Comparator<Integer> c = (i1,i2) -> ((i1<i2) ? -1 : (i1>i2) ? 1 : 0);
		Collections.sort(l, c);
		System.out.println(l);
		List<Integer> list = l.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(list);
	}

}
