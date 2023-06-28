package constructor;

public class Test {

	Test(int a) {
		System.out.println(a);
	}

	Test(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		Test t = new Test(10,20);
		

	}
}
