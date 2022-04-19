package function;

public class ifelse 
{
	public static void main(String[]args)
	{
		String a="Java";
		String b="java";
		String c="Java";
		String d="selenium";
	
		System.out.println(a.contains(b));
		System.out.println(b.contains(c));
		System.out.println(c.contains(a));
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(b.equalsIgnoreCase(c));
		System.out.println(c.equalsIgnoreCase(a));
		
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		System.out.println(c.equals(a));
		
	}
	
}
