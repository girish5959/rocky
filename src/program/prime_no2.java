package program;

import java.util.Scanner;

public class prime_no2 
{
	public static void main(String[]args)
	{
	int i;
	int j=2;
	int ch=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("\n Enter a number");
	i=sc.nextInt();
	
	
		if(i<=1)
			ch=1;
		
		while (j<=i/2)
		{
			if(i%j==0)
			{
			ch=1;
			break;
			}
			else
			{
				j++;
			}
		}
		if(ch==0)
		{
			System.out.println(i+"is prime");
		}
		else
			System.out.print(i+"is not prime");
	}
}
