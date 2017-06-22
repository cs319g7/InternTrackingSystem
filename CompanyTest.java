import java.util.*;
public class CompanyTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Company company1 = new Company ("Efes Pilsen");
		Intern intern1 = new Intern ("Ahmet", "Şahin");
		@SuppressWarnings("deprecation")
		Date startDate = new Date(2017, 7, 1);
		Internship in1 = new Internship(intern1, company1, startDate, 6, 30, 1000);
		//in1.setEndDate(in1.findEndDate());
		int x;
		int y;
		String name, surname;
		System.out.println(in1.getEndDate().toString());
		
		do{
			
			System.out.println("1.Add Intern\n2.Show Interns\n3.Fire Intern\n4.LogOut");
			x = scan.nextInt();
			if(x==1)
			{
				System.out.println("Intern Name:");
				name = scan.next();
				System.out.println("Intern Surname:");
				surname = scan.next();
				Intern i1 = new Intern(name,surname);
				company1.addIntern(i1);
				System.out.println("Intern Added");
				
			}
			else if (x==2){
				company1.printInterns();
			}
			else if(x==3){
				company1.printInterns();
				System.out.println("Select row of Intern to fire");
				y = scan.nextInt();
				company1.interns.remove(y-1);
				company1.setNumOfInterns(company1.getNumOfInterns()-1);
			}
			else if(x==4)
			{
				System.exit(0);
			}
	}
		while(x != 4);
			
		

	}

}