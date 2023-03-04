package java8;
import java.util.function.*;

class Student {
	int mks;
	String name;
	Student(int mks, String name) {
		this.mks = mks;
		this.name = name;
	}
}

public class Function_ex2_Grade_of_student {

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
		
		for(Student s1 : s) {
			System.out.println(s1.name+"-"+s1.mks+"-"+f.apply(s1));
		}
	}

}
