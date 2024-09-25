package abstractionEg;
import java.util.*;
public class Contractor extends Employee
{
	
	public  float calculateSalary()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter payment per hour");
		payment = sc.nextFloat();
		System.out.println("Enter No. of Hours worked");
		workingHrs = sc.nextFloat();
		sc.close();
		return (payment*workingHrs);
		
		
	}
	public static void main(String[] args) 
	{
		Contractor c =new Contractor();
		System.out.println("Salary is : "+c.calculateSalary());

	}

}
