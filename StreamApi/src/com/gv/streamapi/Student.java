package com.gv.streamapi;

public class Student {
	private int rollno;
	private int Age;
	private String Name;
	

	public Student(int rollno, int age, String name) {
		super();
		this.rollno = rollno;
		Age = age;
		Name = name;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return Age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		Age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", Age=" + Age + ", Name=" + Name + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
