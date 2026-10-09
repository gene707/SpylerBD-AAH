class Age_Chk
{
	int age;
	Age_Chk(int age)
	{
		this.age = age;
	}
	
	void chkAge()
	{
		if(age >= 18) System.out.println("You are an adult.");
		else System.out.println("You are still a child.");
	}
	
}

public class Lab1
{
	public static void main(String[] args)
	{
		Age_Chk p = new Age_Chk(19);
		p.chkAge();
		
			
	}
}