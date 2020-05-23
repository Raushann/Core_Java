package com.String.Basic;

public class P11 {
	public static void main(String[] args) {
		Student student=new Student();
		String s1=String.valueOf(student);
		System.out.println(s1);
		System.out.println("**********");
		
		
		Employee emp=new Employee();
		String s2=String.valueOf(emp);
		System.out.println(s2);
		
		
		
	}

}


class Student{
	
}

class Employee{
	int eid;

	@Override
	public String toString() {
		return "Employee [eid=" + eid + "]";
	}
	
}
