package InheritanceConcepts;

class FirstClass {
	void display() {
		System.out.println("First");
	}
}

class SecondClass extends FirstClass {
	void print() {
		System.out.println("Second");
	}
}

class ThirdClass extends SecondClass {
	void run() {
		System.out.println("Third");
	}
}

public class Ex_MultilevelInheritance {
	public static void main(String[] args) {
		FirstClass fobj = new FirstClass();
		fobj.display();

		ThirdClass th = new ThirdClass();
		th.display();
		th.print();
		th.run();
	}

}
