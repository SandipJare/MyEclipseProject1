package InheritanceConcept;

public class ClassA {

	void a1() {

		System.out.println("This is class A member");
	}

	void a2(int b) {

		System.out.println("This is in a2 class " + b);
	}

	static int m3(int b, int c) {
		int d = b + c;
		System.out.println("Sum of given two numbers are: " + d);
		return d;

	}
}
