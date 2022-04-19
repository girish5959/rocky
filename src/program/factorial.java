package program;

public class factorial 
	{
	public static void main(String[]args)
	{
	int n,fact=1;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the number:");
	n=sc.nextint();
	
	for(int i=1;1<=n;i++)
	{
		fact=fact*i;
	}
	System.out.print("Factorial of "+n+"is"+fact);
	
	}
}
