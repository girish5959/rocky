package program;

import java.util.Scanner;

public class prime_no1 
{

	public static void main(String[]args)
	{
	int n;
	int count=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number");
	n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(n+"is Not a prime number");
		
	}
	}
}
