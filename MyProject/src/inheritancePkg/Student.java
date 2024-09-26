package inheritancePkg;
import java.util.*;

public class Student 
{
		String name;
		int adno;
		public void getdata()
		{	
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter Student Name : ");
			name = sc.next();
			System.out.println("Enter Student Admission No.: ");
			adno = sc.nextInt();
			sc.close();
		}

}
