import java.util.*;
public class Internship {
	
	Intern intern;
	Company company;
	Date startDate;
	Date endDate;
	int workDayWeekly;
	int workDayTotal;
	double salary;
	boolean resigned;
	boolean delayed;
	String comment;
	
	public Internship(){}
	
	
	public Internship(Intern intern, Company company, Date startDate, int workDayWeekly, int workDayTotal, double salary) {
		
		super();
		this.intern = intern;
		this.company = company;
		this.startDate = startDate;
		this.workDayWeekly = workDayWeekly;
		this.workDayTotal = workDayTotal;
		this.salary = salary;
		this.endDate = this.findEndDate();
	}
	
	
	public Intern getIntern() {
		return intern;
	}
	public void setIntern(Intern intern) {
		this.intern = intern;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public int getWorkDayWeekly() {
		return workDayWeekly;
	}
	public void setWorkDayWeekly(int workDayWeekly) {
		this.workDayWeekly = workDayWeekly;
	}
	public boolean isResigned() {
		return resigned;
	}
	public void setResigned(boolean resigned) {
		this.resigned = resigned;
	}
	public boolean isDelayed() {
		return delayed;
	}
	public void setDelayed(boolean delayed) {
		this.delayed = delayed;
	}
	public Date findEndDate(){
		Calendar cal = Calendar.getInstance();
		cal.setTime(startDate);
		for(int i = 0; i < workDayTotal; i++) {
			cal.add(Calendar.DATE, 1);
			if(workDayWeekly == 5){
				if(cal.get(Calendar.DAY_OF_WEEK) == 6) 
					i--;			
			}
			if(cal.get(Calendar.DAY_OF_WEEK) == 7) 
				i--;
		}
		cal.add(Calendar.DATE, -1);
		endDate = cal.getTime();			   	
		return endDate;		
	}
	

}
