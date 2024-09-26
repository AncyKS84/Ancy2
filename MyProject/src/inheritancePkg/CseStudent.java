package inheritancePkg;

import java.util.Scanner;

public class CseStudent extends Student{
	int rollno;
	int m1,m2,m3;
	CseStudent(int rollno)
	{
		this.rollno=rollno;
		
	}
	public void getmark()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Mark 1 out 0f 100 : ");
		m1 = sc.nextInt();
		System.out.println("Enter Mark 2 out 0f 100 : ");
		m2 = sc.nextInt();
		System.out.println("Enter Mark 3 out 0f 100 : ");
		m3 = sc.nextInt();
		sc.close();
		
	}
	public void printreport()
	{
		System.out.println("Name          :    "+name);
		System.out.println("Admission No. :    "+adno);
		System.out.println("Roll No.      :    "+rollno);
		System.out.println("Mark 1        :    "+m1);
		System.out.println("Mark 2        :    "+m2);
		System.out.println("Mark 3        :    "+m3);
		int t =m1+m2+m3;
		System.out.println("Total         :    "+t);
		float p = ((float)t/300 )*100;
		System.out.println("Prcentage     :    "+p);
		
	}

	public static void main(String[] args)
	{
		System.out.println("Enter Roll No. of CSE Student:  ");
		Scanner sc =new Scanner(System.in);
		int r= sc.nextInt();
		CseStudent s1= new CseStudent(r);
		s1.getdata();
		s1.getmark();
		s1.printreport();
		sc.close();

	}

}
