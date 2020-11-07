package com.java.colections;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	
	
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(Student input) {
		if(this.age==input.age)
		{
			return 0;
		}else if(this.age > input.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
	

}
