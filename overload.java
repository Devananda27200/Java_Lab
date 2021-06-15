import java.io.*;
import java.util.Scanner;
class overloadfunctions
{
 void calculate(int n,char ch)
 {
  if(ch=='s')
    System.out.print("\n The square of given number is: "+(n*n));
  else
    System.out.print("\n The cube of given number is: "+(n*n*n));
   
 }
 void calculate(int n,int m,char ch)
 {
  if(ch=='p')
    System.out.print("\n The Product of given number is: "+(n*m));
  else
    System.out.print("\n The sum of given number is: "+(n+m));
 }
 void calculate(String str1, String str2)
 {
  if(str1.equals(str2) == true)
       
         System.out.println("The Strings are equal");
	else
         System.out.println("The Strings are not equal");
	
 }

}

class overload
{
 public static void main(String args[])
 {
 overloadfunctions over =new overloadfunctions();
 Scanner sc =new Scanner(System.in);
 System.out.print("\nEnter a Number: ");
 int n =sc.nextInt();
 System.out.print("\nEnter s to find square or any other character to find the cube: ");
 char s=sc.next().charAt(0);
 over.calculate(n,s);
 
 System.out.print("\n\nEnter first Number: ");
 int n1 =sc.nextInt();
  System.out.print("\n Enter Second Number: ");
 int n2 =sc.nextInt();
  System.out.print("\n Enter p to find the product or any other character to find the sum: ");
 char s2=sc.next().charAt(0);
 over.calculate(n1,n2,s2);

 System.out.print("\n\nEnter the first string:");
 String str1=sc.next();
 System.out.print("\nEnter the second string:");
 String str2=sc.next();
 over.calculate(str1,str2);

 } 
}