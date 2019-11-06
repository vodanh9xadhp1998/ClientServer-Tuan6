package FileServer;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.io.Serializable;
public class Student extends Person implements Serializable{
	private int studentID;
	private ArrayList<Subject> subject;
	private float markavge;
	public Student()
	{
		super("",0);
		this.setStudentID(0);
		this.setSubject(new ArrayList<Subject>());
		this.setMarkavge(0);
	}
	public Student(int IDStudent, int age, String name,float agve)
	{
		super(name,age);
		this.setStudentID(IDStudent);
		this.setSubject(new ArrayList<Subject>());
		this.setMarkavge(agve);
	}
	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public ArrayList<Subject> getSubject() {
		return subject;
	}
	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}
	public float getMarkavge() {
		return markavge;
	}
	public void setMarkavge(float markavge) {
		this.markavge = markavge;
	}
	public void InputSubject()
	{
		Scanner sc = new Scanner(System.in);
		int kt = 1;
		while(kt!=0) 
		{
			System.out.print("Mon Hoc: ");
			String str = sc.next();
			System.out.print("Diem: ");
			float diem  = sc.nextFloat();
			subject.add(new Subject(str,diem));
			System.out.print("Ban co muon nhap them mon hoc khong..?\n(1)Co (0)Khong ");
			kt = sc.nextInt();
		}
	}
	public float DiemTB(ArrayList<Subject> n)
	{
		float s = 0;
		int dem = 0;
		for(Subject i : n)
		{
			s = s + i.getMark();
			dem = dem+1;
		}
		return s/dem;
	}
	public void InputStudent()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap StudentID: ");
		this.studentID = sc.nextInt();
		super.InputPerson();
		InputSubject();
		this.markavge = DiemTB(subject);
	}
	public void OutputStudent()
	{
		System.out.print("ID: "+this.studentID+"\t");
		super.OutputPerson();
		for (Subject i : subject) 
			{
				i.OutputSubject();
				System.out.print("Mark: "+ i.getMark()+"\t");
			}
		System.out.print("MarkAvge: "+this.markavge+"\n");
	}
}
