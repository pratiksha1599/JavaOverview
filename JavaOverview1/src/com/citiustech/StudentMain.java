package com.citiustech;

public class StudentMain {

	public static void main(String[] args) {
		/* Assign values using reference variables */

		// constructor nvoke at the time of object creation
		Student stu1 = new Student(2020, "Mira", 'A');
		/*
		 * stu1.sid = 1010; stu1.sname = "John"; stu1.grade = 'A';
		 * 
		 * stu1.display();
		 */
// by using method (assigning class variables using methods)
		// stu1.getValues(1011, "john", 'A');

		stu1.display();

	}
}
