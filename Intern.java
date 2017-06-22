import java.util.*;
public class Intern {
	
	String name;
	String surname;
	String userName;
	String password;
	String school;
	int age;
	int year;
	double gpa;
	ArrayList<Internship> past = new ArrayList<Internship>();
	
	public Intern(){}
	
	
	public Intern(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void addPast(Internship in)
	{
		past.add(in);
	}
	
}
