package polymorphism;

public class MethodOverloading {

	void add(int a, int b) {
		System.out.println(a + b);
	}

	void add(int a, float b) {
		System.out.println(a + b);
	}

	void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	void add(int a, String b) {
		System.out.println(a + " " + b);
	}

	void add(double s, double w) {
		System.out.println(s + w);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(12, "pp");
		m.add(4, 4, 4);
		m.add(4.4, 4.4);

	}

}
