class Strings
{
	public static void main(String[] args)
	{
		 String s1 = "My name";
		 String s2 = "is Atanu.";
		 String s3 = "Cybersecurity Professionals";
		 
		 String s4 = "SECURITY ANALYST     ";
		 String s5 = s4.substring(1);
		 //System.out.println(s1+s2);
		 //System.out.println(s1+ " " +s2 +" and I love " + s3);
		 /*System.out.println("Total length is - "+s2.length());
		 System.out.println("Name starts with "+s2.charAt(3));
		 System.out.println(s3.substring(5,13));
		 System.out.println(s3.substring(14));
		 
		 System.out.println(s3.toUpperCase());
		 System.out.println(s3.toLowerCase());
		 System.out.println(s3.replace("Professionals", "Analyst"));
		 System.out.println(s4.trim());
		 System.out.println(s4.charAt(0)+ s5.toLowerCase());*/
		 
	// Real life Example
		 String info = "your code is - 2356789";
		 System .out.println(s3.contains("security"));
		 System .out.println(s3.contains("secur1ty"));
		 String[] otp = info.split("-");
		 for(String o : otp)
			 System.out.println(o);

		 
		
	}
}