package MethodOverloading;

public class Car
{
	public void move(String CarName,int i)
	{
		System.out.println(CarName+" moving with a speed of "+i);
	}
	
	//method overloading 
	public void move(String CarName)
	{
		System.out.println("Car name : "+CarName);
	}
	
	//method overloading 
	public void move(double CarCost)
	{
		System.out.println("Car cost : "+CarCost);
	}

	//method overloading 
	public void move(String CarName, int i,String MadeOf)
	{
		System.out.println(CarName+"moving with a speed of "+i+" and it is made of "+MadeOf);
	}
}
