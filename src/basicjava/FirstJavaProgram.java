package basicjava;

 public class FirstJavaProgram 
{
	int a = 20;  //global variable
	
	String name = "Santosh";
	int age = 40;
	
	 public void firstmethod()
	{
		final int a = 30;  //local variable  //constant
		//a=40;
		
		float b = 20.5f;
		char c = 'X';
		String d = "Java";
		boolean e = false;
		
		System.out.println(a);  //30
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}
	
	 void meth2()
	{
		System.out.println(a);
	}
	
	public static void main(String[] args) 
	{
		FirstJavaProgram abc = new FirstJavaProgram();
		
		abc.firstmethod();
		
	}
	
	
	
	
}
