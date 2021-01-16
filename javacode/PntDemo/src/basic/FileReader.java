package basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		 
			      File myObj = new File("filename.txt");
			      Scanner myReader = new Scanner(myObj);  
			      while (myReader.hasNextLine()) {
			        String data = myReader.nextLine();
			        System.out.println(data);
			      
			      myReader.close();

	}

}
	
	
}
