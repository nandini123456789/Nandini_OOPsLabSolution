package employee.service;

import java.util.Random;

import com.employee.model.EmployeeModel;

public class EmployeeServices {
	EmployeeModel e=new EmployeeModel();
    String email;
    String password;
	public void generateEmail(String firstName, String lastName, String department) {
		this.email= firstName+lastName+"@"+department+".abc.com";
			
	}
    public void generatePassword() {
    	StringBuilder sb=new StringBuilder();
    	String lowerchars="abcdefghijklmnopqrstuvwxyz";
    	String upperChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String number="1234567890";
    	String special="!@#$%^&*";
    	String combineChars=lowerchars+upperChars+number+special;
    	Random random = new Random();
    	sb.append(upperChars.charAt(random.nextInt(upperChars.length())));
    	sb.append(lowerchars.charAt(random.nextInt(lowerchars.length())));
    	sb.append(number.charAt(random.nextInt(number.length())));
    	sb.append(special.charAt(random.nextInt(special.length())));
    	
    	for (int i=0;i<4;i++) {
    		sb.append(combineChars.charAt(random.nextInt(combineChars.length())));
    	}
        this.password=sb.toString();
     
		
	}
    public void showCredentials(EmployeeModel e) {
    	System.out.println("Dear "+ e.getFirstname() +" your generated credentials are as follows");
    	System.out.println("email -->" + this.email );
    	System.out.println("password -->" +this.password);
       
    }
}
