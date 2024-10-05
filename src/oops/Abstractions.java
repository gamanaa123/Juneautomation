package oops;
abstract class Car
{
	abstract public void acceleration();
	public void acceler()
	{
		
	}
}

class Kia extends Car
{

	@Override
	public void acceleration() 
	{
System.out.println("kia acceleration");		
	}
	
}

class Maruthi extends Car
{

	@Override
	public void acceleration() 
	{
	System.out.println("maruthi acceleration");
		
	}
	
}

public class Abstractions 
{

	public static void main(String[] args) 
	{
Maruthi mn=new Maruthi();
mn.acceleration();
mn.acceler();


	}

}
