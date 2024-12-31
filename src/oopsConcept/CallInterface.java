package oopsConcept;

public class CallInterface implements DemoInterface
{

	
	public void meth3() {
		
		System.out.println("this is interface method3");
	}

	
	public void meth4() {
		System.out.println("this is interface method4");
		
	}

	public void meth5() {
		System.out.println("this is interface method5");
		
	}

	public static void main(String[] args) {
		CallInterface ci = new CallInterface();
		ci.meth3();
		ci.meth4();
		ci.meth5();
	}
	
}
