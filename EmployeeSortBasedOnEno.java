package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	String name;
	int eno;
	Employee(String name, int eno) {
		this.name = name;
		this.eno = eno;
	}
}

public class EmployeeSortBasedOnEno {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee("ABC", 10));
		l.add(new Employee("DEF", 1));
		l.add(new Employee("GHI", 5));
		l.add(new Employee("JKL", 3));
		
		Comparator<Employee> c = (e1, e2) -> ((e1.eno < e2.eno) ? -1: (e1.eno > e2.eno) ? 1: 0);
		Collections.sort(l, c);
		for(Employee e : l) {
			System.out.println(e.eno+"-"+e.name);
		}
	}

}
