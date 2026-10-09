import java.util.Scanner;


public class Loops
{
	public static void main(String[] args)
	{
		/*for(int i = 0; i <= 10; i++)
		{
			System.out.println(i);
		}*/
		
		int t = 2500;
		
		Scanner v = new Scanner(System.in);
		int inp;
		int i = 0;
		while(i<3)
		{
			//if(i%2 == 1) System.out.println(i);
			System.out.println("Enter the value : ");
			inp = v.nextInt();
			if(inp == t)
			{
				System.out.println("U are Correct");
				
				break;
			}
			else 
			{
				if(i == 2)
				{
					System.out.println("Limit Exceed!!!");
					break;
				}
				else System.out.println("Keyword InCorrect");
				
			}
			i++;
			
		}
		
		
		
		
	}
	
}

///Make a guessing game with 3 tries,i wrong it shows how many chnces left,