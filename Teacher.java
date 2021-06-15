import java.io.*;
import java.util.Scanner;

class Person
{
 String name;
 String gender;
 String address;
 int age;
Person( )
{
 name=" ";
 gender=" ";
 address=" ";
 age=0;
}
void read()
 {
 Scanner sc=new Scanner(System.in);
 System.out.print("\nEnter the Name: ");
 name=sc.nextLine();
 System.out.print("Enter Gender: ");
 gender=sc.nextLine();
 System.out.print("\nEnter address: ");
 address=sc.nextLine();
 System.out.print("\nEnter Age: ");
 age=sc.nextInt();
 }
 void display()
{
 System.out.print("\nName of the Person :"+name);
 System.out.print("\nGender :"+gender);
 System.out.print("\nAddress :"+address);
 System.out.print("\nAge "+age);
}
}
class Employee extends Person
{
String Empid;
 String Company_name;
 String Qualification;
 int Salary;
 Employee()
 {
 Empid=" ";
 Company_name=" ";
 Qualification=" ";
 Salary =0;
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.print("\nEnter Empid:" );
 Empid=sc.nextLine();
 System.out.print("\nEnter Company Name:");
 Company_name=sc.nextLine();
 System.out.print("\nEnter Qualification:" );
 Qualification=sc.nextLine();
 System.out.print("\nEnter Salary:" );
 Salary=sc.nextInt();
 }
 void display()
 {
 super.display();
 System.out.print("\nEmpid " +Empid);
 System.out.print("\nCompany Name " +Company_name);
 System.out.print("\nQualification " +Qualification);
 System.out.print("\nSalary " +Salary);
 }
}


class Teacher extends Employee
{
 String Dpt;
 String Sub;
 String id;
 Teacher()
 {
 Dpt=" ";
 Sub =" ";
 id=" ";
 }
 void read()
 {
 super.read();
 Scanner sc=new Scanner(System.in);
 System.out.print("\nEnter Department Name:" );
 Dpt=sc.nextLine();
 System.out.print("\nEnter Subject:");
 Sub=sc.nextLine();
 System.out.print("\nTeacher Id:" );
 id=sc.nextLine();
 }
  void display() 
{
 super.display();
 System.out.print("\nDepartment " +Dpt);
 System.out.print("\nSubject " +Sub);
 System.out.print("\nTeacher id " +id);
 }
}

class DemoEmployee 
{
 public static void main(String args[]) 
{
 Scanner m = new Scanner(System.in);
 System.out.print("\nEnter the number of teacher details: ");
 int n = m.nextInt();
 Teacher t[] = new Teacher[n];
 for (int i = 0; i < n; i++) 
{
 t[i] = new Teacher();
 t[i].read();
 }
 for (int j = 0; j < n; j++) 
{
 t[j].display();
 }
 }
}
