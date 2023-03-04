package java8;

class Sample {
	Sample() {
		System.out.println("Sample executed");
	}
}

interface ConstructorRefInterf {
	public Sample get();
}

public class Constructor_reference {

	public static void main(String[] args) {
		ConstructorRefInterf c = Sample::new;
		Sample s = c.get();
	}

}
