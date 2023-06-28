package InheritanceConcepts;

class A {
	void m1() {
		System.out.println("Method name is m1");
	}

}

class B extends A {
	void m2() {
		System.out.println("Method name is m2");
	}
}

public class Ex_SinglevelInheritance {
	public static void main(String[] args) {

		A aobj = new A();
		aobj.m1();

		B bobj = new B();
		bobj.m2();
		bobj.m1();
	}

}
