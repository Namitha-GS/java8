package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpSortBasedOnAlphabeticalOrderOfName {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("DEF", 1));
		l.add(new Employee("ABC", 10));	
		l.add(new Employee("JKL", 3));
		l.add(new Employee("ACD", 5));
		l.add(new Employee("EGG", 6));
		
		Comparator<Employee> c = (e1, e2) -> e1.name.compareTo(e2.name);
		Collections.sort(l, c);
		for(Employee e : l) {
			System.out.println(e.eno+"-"+e.name);
		}
	}

}
