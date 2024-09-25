package abstractionEg;

import java.util.Scanner;

public class FullTimeEmployee extends Employee{
	static final int HRS=8;
	public  float calculateSalary()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment per hour");
		payment = sc.nextFloat();
		sc.close();
		return (payment*HRS);
		
		
	}
	public static void main(String[] args) 
	{
		FullTimeEmployee ft =new FullTimeEmployee();
		System.out.println("Salary is : "+ft.calculateSalary());

	}

}
