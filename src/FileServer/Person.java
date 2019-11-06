package FileServer;

import java.io.Serializable;
import java.util.Scanner;
import java.io.Serializable;

public class Person implements Serializable {
	private String name;
	private int age;

	public Person(String namePerson, int agePerson) {
		this.setName(namePerson);
		this.setAge(agePerson);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void InputPerson() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap Ten: ");
		this.name = sc.next();
		System.out.print("Nhap Tuoi: ");
		this.age = sc.nextInt();
	}

	public void OutputPerson() {
		System.out.print("Name: " + this.name + "\t");
		System.out.print("Age: " + this.age + "\t");
	}
}
