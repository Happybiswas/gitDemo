package Mentoring;

public class JavaOpeartor {
	
	
	public static void main ( String[] args){
		// doing  arithmetic operators + - * / % 
	/* int a = 4;
		int b = 10;
		int c = 5;
		int total = a+b+c;
		
		
		System.out.println( "the total is : " +total);
	
		System.out.println( "The value is:"+(b-a));
		
		System.out.println( "The value is:" +(a*b));
		System.out.println( "The value is:" +(b/a));
		System.out.println( "The value is:" +(b % a)); */
		
		//System.out.println(" Hello World");
		
		//System.out.println("My name is Happy Biswas. I would like to become a IT  Professionam that's why I am taking this course");
		
		JavaOpeartor.Adress1();
		JavaOpeartor AD = new JavaOpeartor();
		AD.Adress2();
		
		
		JavaOpeartor info = new JavaOpeartor();
		
		info.informatin(" Happy", 25);
		
	}
		
		
		
		
	public static void Adress1() {
		
		System.out.println( " Gles mill PA is my first adress");
	}
		
		
		public void Adress2() {
		System.out.println( " Brooklyn New York is my secondary Adress");
		
		}	
		
		
		public String informatin( String Name, int age) {
			
			System.out.println(" my Student name is :" + Name +" "  +"and my age is: "+" "+age);
			return Name + age;
		}
		
		
	

	
}
