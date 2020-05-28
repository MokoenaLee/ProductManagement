import java.util.Scanner;

public class Validator {
	
	public static String getString(Scanner sc, String prompt) 
	{
		System.out.print(prompt);
		String s = sc.next();//read user entry
		sc.nextLine();//disregard any other data entered on the line
		return s;
		
	}
	
	public static int getInt(Scanner sc, String prompt) 
	{
		int i = 0;
		boolean isValid = false;
		while(isValid == false) {
			System.out.println(prompt);
			if(sc.hasNextInt())
			{
				i = sc.nextInt();
				isValid = true;
			}else
			{
				System.out.println("Error! Invalid integer value. Try again");
			}
			sc.hasNextLine();//disregard any other data entered on the line
		}
		return i;
	}
	
	public static double getDouble(Scanner sc, String prompt) 
	{
		double d = 0;
		boolean isValid = false;
		while(isValid == false) {
			if(sc.hasNextDouble())
			{
				d = sc.nextDouble();
				isValid = true;
			}else
			{
				System.out.println("Error! Invalid decimal value.Try again");
			}
			sc.hasNextLine();
		}
		return d;
	}



	

}
