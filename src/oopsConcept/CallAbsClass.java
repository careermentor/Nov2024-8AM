package oopsConcept;

public class CallAbsClass extends AbsClassDemo
{


	public void meth2()
	{
		System.out.println("this is the password");
		
	}

	public static void main(String[] args) 
	{
		AbsClassDemo abs = new CallAbsClass();
		abs.meth1();
		abs.meth2();
		
	}
	
}
