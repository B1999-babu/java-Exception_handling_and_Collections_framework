import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
	
	public static void main(String args[])  {
		
//		for(int i=0; i<=3; i++) {
//		Scanner input=new Scanner(System.in);
//		System.out.println("Enter the some text:");
//		String enterText=input.nextLine();
//		System.out.println(enterText);
//		}
		try {
		File file=new File("myFile.txt");
		Scanner input1;
		
			input1 = new Scanner(file);
		
		while(input1.hasNextLine()) {
		String line=input1.nextLine();
		System.out.println(line);
		}
		input1.close();
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
		myFileUtils util=new myFileUtils();
		
			System.out.println(util.subtract10FromLargeNumber(15));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
			e.printStackTrace();
		}
		
    }
	

}
