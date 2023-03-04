package java8;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		if(i1 < i2)
			return -1;
		else if(i1 > i2)
			return 1;
		else
			return 0;
	}
}

public class SortUsingComparator {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(10);
		l.add(5);
		l.add(11);
		l.add(3);
		Collections.sort(l, new MyComparator());
		System.out.println(l);
	}

}
