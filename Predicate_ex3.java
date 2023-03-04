package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

class Employee1 {
	String name;
	int salary;
	Employee1(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Predicate_ex3 {

	public static void main(String[] args) {
		List<Employee1> l = new ArrayList<>();
		l.add(new Employee1("DEF", 100));
		l.add(new Employee1("ABC", 10000));	
		l.add(new Employee1("JKL", 20000));
		l.add(new Employee1("ACD", 9999));
		l.add(new Employee1("EGG", 200));
		
		Predicate<Employee1> p = e -> e.salary > 9999;
		for(Employee1 e : l) {
			if(p.test(e))
				System.out.println(e.name+"-"+e.salary);
		}
	}

}
