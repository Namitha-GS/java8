package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Consumer_ex2 {

	public static void main(String[] args) {
		Function<Student, String> f = s -> {
			String grade="";
			int marks = s.mks;
			if(marks >= 80) 
				grade="A";
			else if(marks >= 60)
				grade="B";
			else if(marks >= 35)
				grade="C";
			else
				grade="failed";
			return grade;
		};
		
		Student[] s = {new Student(10, "ABC"), new Student(25, "DEF"),
				       new Student(100, "KLM"), new Student(45, "PQR"), new Student(67, "MNU")};
		
		Predicate<Student> p = st -> st.mks >= 45;
		
		Consumer<Student> c = sd -> {
			System.out.println(sd.name+"-"+sd.mks+"-"+f.apply(sd));
		};
		
		for(Student s1 : s) {
			if(p.test(s1)) {
				c.accept(s1);
			}
		}
	}

}
