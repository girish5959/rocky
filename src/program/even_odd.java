package program;

public class even_odd 
	{
	public static void main(String[]args)
	{
		int x;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("enter an integer:");
	x=sc.nextint();
	if(x%2==0)
	{
	System.out.println("Number is even");
	}
	else
	{
	System.out.println("number is odd");
	
	}
}
}