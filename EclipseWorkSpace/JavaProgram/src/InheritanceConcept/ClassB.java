package InheritanceConcept;

public class ClassB extends ClassA {

	void m1(int c, String address) {

		System.out.println("This is class B " + c + " " + address);

	}

	public static void main(String[] args) {

		ClassB obj = new ClassB();

		obj.m1(2500, "Pune");
		obj.a1();
		obj.a2(200);
		obj.a2(5000);
		m3(100, 300);

	}

}
