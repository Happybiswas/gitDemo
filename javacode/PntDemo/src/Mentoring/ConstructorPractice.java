package Mentoring;

public class ConstructorPractice {
	// writing two variable 
	String name;
	int age;
	// now i am creating a empty constructor withoutout passing any variable  
	
	public ConstructorPractice() {
		
		System.out.println(" this is a empty constructor ");
	} 
	
	
	// constructor with parameter
	public ConstructorPractice(String stname, int stage ) {
		
		this.name = stname;
		this.age = stage; 
		
		System.out.println ( " The student name is :" +stname+ " The student age is "+ stage  );
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		
		ConstructorPractice cons = new ConstructorPractice();
		ConstructorPractice cons1 = new ConstructorPractice(" Happy Biswas", 25);
		
		 
		

	}

}
