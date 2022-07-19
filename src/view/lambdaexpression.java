package view;
// Lambda expressions basically express instances of functional interfaces (An interface with single abstract method is called functional interface.

@FunctionalInterface // this ensures this is functional interface
interface Cab{ // wen an interface is having will have exactly 1 abstract method we can say it as a functional interface
	int bookCab(String source,String destination); // by default public abstract void bookCab()
}

//class UberX implements Cab{
//	public void bookCab() {
//		System.out.println("uberx booked");
//	};
//}
public class lambdaexpression {
	int instancevar =1000;
	public static void main(String args[])
	{
		
//		Cab cab =new UberX();
//		cab.bookCab();
		
//		Anonyms class
//		Cab cab2 =new Cab()
//				{
//			public void bookCab()
//			{
//				System.out.println("uberx booked");
//	
//			}
//				};
//				
//		cab2.bookCab();
//		Cab cab =()->{
//			System.out.println("uberx");
//		};
//		
//		cab.bookCab();
		
//		zero parameter
//		one parameter
//		multiple parameter
//		Cab cab =(Source,destination)->{
//			System.out.println("uberx"+Source+"to"+destination);
//		};
//		
//		cab.bookCab("india","usa");
//		return statement
//		Cab cab =(Source,destination)->{
//			
//			System.out.println("uberx"+Source+"to"+destination);
//			return 87;
//		};
//		
//		int q=cab.bookCab("india","usa");
//		System.out.println(q);
//		
	}
	
	Cab cab =(Source,destination)->{
		int localvar=1000;
		System.out.println("uberx"+Source+"to"+destination);
		System.out.println("localvar is "+localvar);
		System.out.println("instancevar is :"+instancevar);
		System.out.println("static variable is :"+lambdaexpression.svar);		
		return 87;
	};
	
	int q=cab.bookCab("india","usa");
	System.out.println(q);
}
