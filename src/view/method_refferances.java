package view;

interface calculator{
	void add(int a1,int a2);
}

class Calci
{
	public static void addSomething(int num1,int num2)
	{
		System.out.println(num1+"and "+ num2);
		
	}
	public void letadd(int num1,int num2)
	{
		System.out.println(num1+"and "+ num2);

	}
}
public class method_refferances {
	public static void main(String args[])
	{
		
//		referring the addsomething method to the add method 
		
//		1 reference to a static method 
//		calculator cref=Calci::addSomething;
//		cref.add(12, 13);
//		2 referance to a non static method or instance method
		Calci calc =new Calci();
		calculator cref = calc::letadd;
		cref.add(12, 13);
	}
	
}
