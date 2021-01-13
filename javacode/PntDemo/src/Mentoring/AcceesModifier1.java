package Mentoring;

public class AcceesModifier1 {
	
	// static variable 
	private static int age = 24;
	
	static String studentName = " Happy Biswas";
	
	// by creating object we all the non static variable 
		String  companyName = " Bank of America";

	// decleare a protected variable
		protected static int salary = 4000;
	
	
	

	public static void main(String[] args) {
	// static variable i call by class name 	
	System.out.println(" My name is : " + " " +AcceesModifier1.studentName );
	System.out.println(" my age is : "+ ""+ AcceesModifier1.age);
	
	// this is the non static variable i call by object
	
	AcceesModifier1 ace = new  AcceesModifier1();
	System.out.println (" My company name is :" + ""+ace.companyName );
	
	// protected also we call by class name 
	
	System.out.println( " my salary is :" + " " +AcceesModifier1.salary );		
		
			
			
		
		
	}

}
