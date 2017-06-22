import java.util.*;
public class Company {
	
	String name;
	String userName;
	String password;
	int numOfInterns;
	int numOfCurrentInterns;
	ArrayList<Intern> interns = new ArrayList<Intern>();
	ArrayList<Intern> currentInterns = new ArrayList<Intern>();
	
	public Company(){		
	}
	
	public Company(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getNumOfInterns() {
		return numOfInterns;
	}
	public void setNumOfInterns(int numOfInterns) {
		this.numOfInterns = numOfInterns;
	}
	
	public void addIntern(Intern x){
		interns.add(x);
		currentInterns.add(x);
		numOfInterns++;
		numOfCurrentInterns++;
	}
	public void printInterns()
	{
		for (int i = 0; i<getNumOfInterns(); i++)
		{
			System.out.println((i+1) + ". " + interns.get(i).getName() + " " + interns.get(i).getSurname());
		}
	}
	
	
	

}
