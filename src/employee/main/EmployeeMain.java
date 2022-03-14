package employee.main;

import java.util.Scanner;

import com.employee.model.EmployeeModel;

import employee.service.EmployeeServices;

public class EmployeeMain {

	public static void main(String[] args) {
		String department;
		EmployeeModel em=new EmployeeModel();
		EmployeeServices es=new EmployeeServices();
		Scanner sc =new Scanner(System.in);
		
		//Enter your First Name
		System.out.println("Please enter your First name:");
		String FirstName=sc.nextLine();
		em.setFirstname(FirstName);
		
		//Enter your last Name
		System.out.println("Please enter your last name:");
		String lastName=sc.nextLine();
		em.setLastName(lastName);
		
		//Enter your department
		System.out.println("Please Enter the department:");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resources");
		System.out.println("4. Legal");
		int option= Integer.parseInt(sc.nextLine());
		
		switch (option) {
		case 1 : {
			department="tech";	
			//Calling the employeeServices to generate the credentials
			es.generateEmail(FirstName, lastName, department);
			es.generatePassword();
			es.showCredentials(em);	
		}
		break;
		case 2 : {
			department="admin";
			es.generateEmail(FirstName, lastName, department);
			es.generatePassword();
			es.showCredentials(em);	
		}
		break;
		case 3 : {
			department="hr";
			es.generateEmail(FirstName, lastName, department);
			es.generatePassword();
			es.showCredentials(em);
		}
		break;
		case 4 : {
			department="legal";
			es.generateEmail(FirstName, lastName, department);
			es.generatePassword();
			es.showCredentials(em);
		}
		break;
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + option);
		}
	}

}
