package basic;

public class AcceesModifier {

	// Static variable
	private static int age = 24;
	
	static String studentName = "Happy Biswas";
	
	// Non static variable
	
	String companyName = "Bank Of America";
	
	// protected  static variable 
	
	protected static int salary = 4000;
	
	
// main method 
	public static void main(String[] args) {
		
		// static variable call by class name 
		
		System.out.println("My name is :"+ " "  +AcceesModifier.studentName);
		System.out.println("my age is: " + " "  + AcceesModifier.age);
		
		
		
		// non static variable call by object name 
		AcceesModifier emp = new AcceesModifier();
		 System.out.println( "My Company  name is :" + " "+ emp.companyName); 
		 
		 
		
		
		 
		 // protective variable also we call by class name  
		
		 System.out.println("My salary is :"+AcceesModifier.salary);
		 
	}

}

