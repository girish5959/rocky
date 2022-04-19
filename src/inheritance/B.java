package inheritance;

public class B extends A 
	{
	public void m2()
	{
	System.out.println("m2--b");
	}
	public static void main(String[]args)
	{
		B a=new B();
		a.m1();
		
	}
}
