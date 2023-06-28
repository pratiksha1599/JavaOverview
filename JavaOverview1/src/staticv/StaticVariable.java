package staticv;

public class StaticVariable {

	static int a = 10; // static variable
	int b = 20; // non static variable

	static void m1() // static method

	{
		System.out.println("This is m1 a static method");
	}

	void m2() // non static variable

	{
		System.out.println("This is m2 non static method");
	}

	public static void main(String[] args) {
		// static method can access only static stuff

		// static method can also access non static stuff but through object
		// Non static methods can access both static and non static methods

		System.out.println(a);
		// m1();
		StaticVariable st = new StaticVariable();
		st.m2();
		m1();
		StaticVariable.m1();
		
		System.out.println(st.b);

	}
}
