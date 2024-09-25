package aggregation;

import java.util.Scanner;

public class StudentDetails 
{
	public static void main(String[] args) 
	{	Scanner sc = new Scanner(System.in);
		Address a = new Address();
		Student s= new Student();
		System.out.println("Enter Student Name : ");
		String name = sc.next();
		s.setSname(name);
		System.out.println("Enter Student Roll No : ");
		int n= sc.nextInt();
		s.setSrno(n);
		System.out.println("Enter House Name : ");
		String hname = sc.next();
		a.setHname(hname);
		System.out.println("Enter Place : ");
		String p = sc.next();
		a.setPlace(p);
		System.out.println("Enter PIN : ");
		int pin = sc.nextInt();
		a.setPin(pin);
		a.setS(s);
		a.printData();
		sc.close();
		
		
	}

}
