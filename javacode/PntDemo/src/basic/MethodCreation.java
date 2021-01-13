package basic;

public class MethodCreation {

	
	public static void main(String[] args) {
		// static method only call by class name
		MethodCreation.Address2();

		// non static method call by creating object

		MethodCreation mct = new MethodCreation();
		mct.Address();

		// calling return type method
		mct.Address1("Happy", 25);

	}

	
	// this is static method
	public static void Address2() {

		System.out.println("this is my secondary address ");
	}

	
	// this is non static method
	public void Address() {

		System.out.println("this is my primary address ");
	}

	
	// return type method
	
	public String Address1(String studentName, int age) {

		// String adr = studentName + age;
		System.out.println(" The studeent name is  :" + studentName + ".  student age is :" + age);

		return studentName + age;
	}
	

}
