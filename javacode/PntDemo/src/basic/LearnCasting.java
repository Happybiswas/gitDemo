package basic;

public class LearnCasting {

	// class name is Scanner
	// how to create an object of Scanner class

	// casting : casting mean converting(change) data type its mean change
	// the data type to int to string
	public static void main(String[] args) {

		double price = 35.99;
		int disCountPrice = (int) price;
		System.out.println(disCountPrice);

		int price1 = 35;
		double disCountPrice1 = (double) price1;
		System.out.println(disCountPrice1);
		int num1 = 60;
		int num2 = 80;
		int num3 = num1;
		int num4 = num2 + num3;
		System.out.println(" The total num is :" + " " + num4);

		int number = 56;
		byte total = (byte) number;
		System.out.println("To convert int to byte the number is :" + total);

	}

}
