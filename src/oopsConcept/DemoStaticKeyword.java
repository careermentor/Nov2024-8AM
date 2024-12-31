package oopsConcept;

public class DemoStaticKeyword 
{

	static int x = 100;
	
	public static void meth1()
	{
		
		System.out.println(x);
	}
	
	public void meth2()
	{
		System.out.println("this is simple method");
	}
	
	public static void main(String[] args)
	{
		DemoStaticKeyword dsk = new DemoStaticKeyword();
		//dsk.meth1();
		dsk.meth2();
		
		meth1();
		
	}
	
}
