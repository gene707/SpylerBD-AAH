import java.util.Scanner;

public class Conditionals{
	public static void main(String[] args)
	{
		int marks = 79;
		
		/*if(marks>=70 && marks < 98)
			System.out.println("A+");
		
		else if(marks >= 70)
			System.out.println("A");

		else 
			System.out.println("A-");*/
		
		String name = "Atanu";
		String name1 = "Pranto";
		 // For taking input values, 1st delare a new obj using Scanner cls
		Scanner uinput = new Scanner(System.in);
		System.out.println("Enter ur Name : ");

		String ur_nam = uinput.nextLine(); // taking input,
		System.out.println("Name : "+ur_nam);
		
		//if(ur_nam.equals(name) | ur_nam.equals(name1))
		if(ur_nam.equalsIgnoreCase(name) | ur_nam.equalsIgnoreCase(name1))
			System.out.println("U can enter");
		else 
		{
			System.out.println("403-Forbidden!!!");
			if(ur_nam.length() > 24)
			{
				System.out.println("Grty l0st agi3n!!");
			}
		}
		
		
	}
	
	
}