import java.util.*;
class StringManipulation
{
  public static void main(String args[])
     {
	    Scanner sm=new Scanner(System.in);
		System.out.print("enter string1: ");
		String s1=sm.next();
		System.out.print("enter string2: ");
		String s2=sm.next();

		System.out.print("\n\nSTRING LENGTH");
		System.out.print("\nLength of string 1 "+s1.length());
		System.out.print("\nLength of string 2 "+s2.length());

		System.out.print("\n\nSTRING CONCATENATION");
		String s3=s1+s2;
		System.out.print("\nString after concatenation : "+s3);

		System.out.print("\n\nUPPERCASE AND LOWERCASE");
		System.out.print("\nEnter a string: ");
		String lower=s1. toLowerCase();
		System.out.print("\nString in lowercase"+lower);
		String upper=s2. toUpperCase();
		System.out.print("\nString in uppercase"+upper);

		System.out.print("\n\nSTRING CHARACTER EXTRACTION");
		System.out.print("\nEnter character position: ");
		int n=sm.nextInt();
		char ch=s1.charAt(n-1);
		System.out.print("\n Character: "+ch);

		System.out.print("\n\nSTRING COMPARISON");
		System.out.print("\n"+s1.equals(s2));
		
		
	 }
}