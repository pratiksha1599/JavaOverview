package com.citiustech;

public class Employee {

	int no;
	String name;
	double salary;
	int deptno;
	String job;

	void display() {
		System.out.println(no);
		System.out.println(name);
		System.out.println(deptno);
		System.out.println(job);
		System.out.println(salary);
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.no=10;
		emp.name="Mayuresh";
		emp.salary=100000;
		emp.deptno=15;
		emp.job="Quality Analysist";
		emp.display();
		
		
		Employee emp1 = new Employee();
		emp1.no=12;
		emp1.name="Pratiksha";
		emp1.salary=70000;
		emp1.deptno=45;
		emp1.job="Quality analysist";
		emp1.display();
	}
}
