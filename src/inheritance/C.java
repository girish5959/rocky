package inheritance;

public class C extends A
	{
	public void m2()
	{
	System.out.println("m2--b");
	}
	public static void main(String[]args)
	{
		C a=new C();
		a.m1();
		
	}
}
