package MethodOverloading;

public class CarMain 
{
	public static void main(String[] args) 
	{
		Car c1 = new Car();
		c1.move(464646.464);
		c1.move("800");
		c1.move("suzuki samurai", 465464);
		c1.move("Lambo ",500,"Steel+Fibre");
	}
}
