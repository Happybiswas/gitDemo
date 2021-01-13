package Mentoring;

public class MethodCreation1 {
	
	String studentName;
	int age;
	

	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		MethodCreation1.Address2();
		MethodCreation1 adt = new MethodCreation1();
		
		adt.Address();
		adt.Address1( " samir", 30);
		
		
		

	}
	
	
	
	// static method 
	
	public static void Address2() {
		
		 System.out.println(" This is my secondary address");
		
		
	}
	
	// I am going to call anon static method 
		public void Address() {
		
		System.out.println(" This is my current address" );
		
		
		}
		// return type of method 
		public String Address1(  String studentName, int age ) {
			System.out.println( "the student name is :"+ studentName  +  "  "+"  the student age is"  + age  )  ;
			
			 return studentName+ age ;
			
			
		}
	

}
