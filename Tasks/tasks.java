import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;


/*<dependency>
    <groupId>org.apache.commons</groupId>
    <artifactId>commons-lang3</artifactId>
    <version>3.12.0</version>
</dependency>*/


//Java Tasks

///Class -8(Strings)

public class StrManipulation
{
	public static void main(String[] args)
	{
		String n = "fooTBallEr";
		
		n = n.substring(0,1).toUpperCase() +  n.substring(1).toLowerCase();
		System.out.println("Value : %s", n);
		
		/*StringUtils.capitalize( "frEd frOM JupitEr" );
		System.out.println("Value : %s", n);*/
		
	}
	
}

///Class -9(Conditionals)
public class gradeSystem
{
	public static void main(String[] args)
	{
		Scanner numinp = new Scanner(System.in);
		Scanner nameinp = new Scanner(System.in);
		
		System.out.print("Your name : ");
		String urname = nameinp.nextLine();
		
		int m = ;
		
		if(m >100 || m < 0)
			System.out.println("Inavlid Input!!");
		
		if(m >= 80 || m <= 90)
			System.out.println("Obtained Grade : A+");
		else if(m >= 70 || m < 80)
			System.out.println("Obtained Grade : A");
		else if(m >= 600 || m < 70)
			System.out.println("Obtained Grade : A-");
		else if(m >= 50 || m < 60)
			System.out.println("Obtained Grade : B");
		else 
			System.out.println("Obtained Grade : F; Better Luck at next Exam.");
		
		
		
	}
	
}

///Class- 10(Loops)

public class guessGame
{
	public static void main(String[] args)
	{
		int i = 3;
		Scanner v = new Scanner(System.in);
		int inp;
		
		while(i>0)
		{
			System.out.println("Enter the value : ");
			inp = v.nextInt();
			
			if(inp == val) 
			{
				System.out.println("You Won !!!");
				break;
			}
			else
			{
				int p = i--;
				if(p == 0)
				{
					System.out.println("Limit Exceeded!! Better Luck nxt time.");
					break;
				}
				else
				{
					System.out.println("Boo Boo! You Have "+p +" tries remaining.");
				}
			}
		i--;
			
		}
		
	}
	
}

///Class 12(Functions)

public class loginSystem
{
	static boolean username(String n)
	{
		String u = "admin";
		if(n.equals(u)) return true;
		else return false;
	}
	static void password(String d)
	{
		String k = "admin1234"; 
		if(d.equals(k)) return true;
		else return false;
	}
	
	public static void main(String[] args)
	{
		Scanner userinp = new Scanner(System.in);
		Scanner passinp = new Scanner(System.in);
		
		System.out.println("Username Details :");
		System.out.print("Enter your username : ");
		String user = userinp.nextLine();
		
		
		System.out.println("Password Details :");
		System.out.print("Enter your password : ");
		String pass = passinp.nextLine();
		
		
		if(username(user) && password(pass))
			System.out.println("Login Successful.");
		else 
			System.out.println("Invalid Credintials!!!");
		
		
	}
	
}







