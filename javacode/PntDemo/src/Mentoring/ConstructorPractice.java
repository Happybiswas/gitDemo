package Mentoring;

public class ConstructorPractice {
	// writing two variable 
	String name;
	int age;
	String address;
	String carName;
	String model;
	String Colour;
	
	// now i am creating a empty constructor withoutout passing any variable  
	
	public ConstructorPractice() {
		
		System.out.println(" this is a empty constructor ");
	} 
	
	
	// constructor with parameter you can give any name inside the parentheses with data type 
	public ConstructorPractice(String stname, int stAge, String staddress ) {
		
		this.name = stname;
		this.age = stAge; 
		this.address= staddress;
		
		System.out.println ( " The student name is :" +stname+ " The student age is "+ stAge +"\n The address is :" + staddress);
		
		
	}
	
	public ConstructorPractice( String stcarname,String stmodel,String stcolour) {
		this.carName = stcarname;
		this.model =stmodel;
		this.Colour = stcolour;
		
		
		System.out.println( " The car name is :"+this.carName + " \n The car model is :"+this.model+ "\nThe car colour is :"+this.Colour);
		
	}
	
	
	
	

	public static void main(String[] args) {
		// this is empty constructor object
		ConstructorPractice cons = new ConstructorPractice();
		
		
		ConstructorPractice customer1 = new ConstructorPractice(" Happy Biswas", 25,"408 Elton farm circle, glens mills ,PA");
	
		ConstructorPractice customer2 = new ConstructorPractice("Tapan Das", 45, "408 Elton farm circle, glens mills ,PA") ;
		
		ConstructorPractice carinfo = new ConstructorPractice("Nissan", "rougue", "White");
				
		 
		

	}

}
