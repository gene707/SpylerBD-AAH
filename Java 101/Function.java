import java.util.Scanner;

public class Function
{
	static int q()
	{
		//System.out.println("CyberSec is wild.");
		return 100+788;
	}
	
	static void p(String n, int m, String s)
	{
		System.out.println("I am "+ n + " I am " + m + " years old, I am from sec " + s);
		///return "Ola, amigos, asta la vista";
		//return "Ola, amigos, asta la vista" + ;
		//return null;
	}
	
	
	static void printarr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
		
	}
	
	
	
	
	public static void main(String[] args)
	{
		/*int a = q();
		System.out.println("Int val is : " + a);
		
		int sum = 100+a;
		int d = a-500;
		
		System.out.println(sum);
		System.out.println(d);
		System.out.println(p());
		
		
		String n = "Pranto";
		String s = "A.";
		
		int m = 18;
		p(n ,m ,s);*/
		
		Scanner take = new Scanner(System.in);
		System.out.print("Num Of Inp Bruv : "); //ek line pore nite chaile println, ar pasapasi nite chaile print 
		
		int num = take.nextInt();
		
		int[] a = new int[num];
		
		System.out.println("Enter the elements : ");
		for(int i = 0; i<num; i++)
		{
			System.out.println(String.format("Element %d: ", i+1)); // string Interpolation ---> GeeksForGeeks
			a[i] = take.nextInt();
			
		}
		System.out.println("List Of Elements : ");
		printarr(a);
		
		

	}
}