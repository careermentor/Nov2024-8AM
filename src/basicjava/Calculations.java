package basicjava;

public class Calculations 
{

	public Calculations()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("sum of a&b from Const: " + c);
		
	}
	
	
	public Calculations(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		
	}
	
	public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of a&b: " + c);
		return c;
	}

	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		
		System.out.println("sum of a&b from method: " + c);
		return b;
	}
	
	
	
	public static void main(String[] args) 
	{
		Calculations cal = new Calculations(40,50);  //constructor will be automatically called
		Calculations cal1 = new Calculations();
		//cal.sum();  //calling a method
		//cal.addition(30, 40);
		
	}
	
}
