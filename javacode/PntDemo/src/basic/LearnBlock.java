package basic;

public class LearnBlock {
	// block start pint 
	
	{
		System.out.println("HelloWorld ");

	}
	
	int a ;
	int d ;
	int total; // non static variable can call only other method 
	// Block end point 
	int age; //declare data type with variable name 
	int pizzaPrice = 25; // declare and assign value
	
	static String stName ="Happy";// static global variable static lable variable can  call only inside the main method 
	
	static String stAddsress= "New york";//  static global variable 
	static String StFatherName;
	
	
	//Main method 
	public static void main(String[]args) {
		
		 int k = 25;
		HelloWorld hw = new HelloWorld();
		//hw.main(args);
		
		LearnBlock.stName ="Kevin";//reassign value
		
		
	
		System.out.println(LearnBlock.stName)	;
		System.out.println(LearnBlock.stAddsress)	;
		System.out.println(LearnBlock.StFatherName = "Tapan")	;
		System.out.println( " the k = " + k);
		// decleare object
		LearnBlock ad = new LearnBlock();
		//non void method prited here.
		System.out.println(ad.add(25,80));
		//to call the non static method you need to create object 
		
		//void type mehtod
		ad.add1();
		
		//for the static method object creation is not required.you need to call the method by the class name 
		LearnBlock.add2();
		LearnArray.main(args);
		
		
		
		
}
	
	//if the method type is not void you have to use return keyword to return the value, in that case you can use print statemen inside the main method
	public int add (int a, int d) {
		
		 //total = a + d;
		
		
		return a + d;
		
	}
	
	//if the the method is void type then you need to print the value inside the method
	public  void add1() {
		int c =4;
		int d = 5;
		
		int  total = c + d;
		 System.out.println("total =" + total );
	}
	
	public static void add2() {
		int c =8;
		int d = 5;
		
		int  total = c + d;
		 System.out.println("total =" + total );
	}
	
	
	

}
