import java.util.Scanner;

class Std
{
	String name;
	int age;
	//DecimalFormat f = new DecimalFormat("#.##");
	float f;
	
	void info()
	{
		System.out.println("Student's name is "+ name+" and age is "+age+" and currently has tk"+f);
	}
	
}


class Account
{
	int balance;
	Account(int b)
	{
		this.balance = b;
	}
	public void deposit(int amount)
	{
		balance += amount;
	}
	
	public int newBalance()
	{
		return balance;
	}
	
}

/*class oop{
	public static void main(String[] args)
	{
		/*Student s1 = new Student();
		s1.name = "Sadman";
		s1.age = 23;
		s1.f = 34.56f;
		
		s1.info();
		
		Account acc = new Account(2300);
		
		acc.deposit(700);
		//acc.newBalance();
		
		System.out.println("Current Balance : "+acc.newBalance());
		
	}
}*/


/// Class -14
class Person
{
	String name;
	int age;
	
	void showperson()
	{
		System.out.printf("Name : %s\n", name);
		System.out.printf("Age : %d\n", age);
		
	}	
}
class Student extends Person
{
	int roll;
	float cgpa;
	
	void showstudent()
	{
		showperson(); // Inherited attributes,
		System.out.printf("Roll : %d\n", roll);
		System.out.printf("cGPA : %.2f\n", cgpa);
		
	}
}

class Animal /// private classs ke parent class hisebe extend kora jai na 
{
	//private void sound()
	protected void sound()
	{
		System.out.println("Animal sounds");
	}
}
class Dog extends Animal
{
	@Override
	protected void sound()
	{
		System.out.println("Dog barks!!");
	}
	void legs()
	{
		System.out.println("Dog has 4 legs.");
	}
}

public class oop
{
	public static void main(String[] args)
	{
		/*Student s1 = new Student();
		s1.name = "Rakib";
		s1.age = 21;
		s1.roll = 2103049;
		s1.cgpa = 3.29f;
		
		//s1.showperson();
		s1.showstudent();*/
		//Animal a1 = new Animal();
		//a1.sound();
		
		Animal d1 = new Dog(); 
		d1.sound();
		//d1.legs(); ///Polymorphism er karone animal er under ja ase sob print hobe,but dog , Animal er child class howai shudhu override part ta chara baki jegulo animal class e nai, seta print hobe na nad error dekhabe.
	}
}
