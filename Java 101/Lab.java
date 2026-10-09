import java.util.Scanner;

public class Lab
{
	public static void main()
	{
		Scanner uinput = new Scanner(System.in);
		int age = uinput.nextInt();
		
		if(age >= 18) 
			System.out.println("You are an adult.");
		else 
			System.out.println("You are still a child.");
	}
}