//Write a program to get the details of a Student  Class 1 - Student. 
//Get the student name and roll number  
//Class 2- Address. Get the address of student Print Student name, roll number with address  
//There is no IS-A relationship

package aggregation;

public class Student 
{
	private String sname;
	private int srno;
	public String getSname() 
	{
		return sname;
	}
	public void setSname(String sname) 
	{
		this.sname = sname;
	}
	public int getSrno() 
	{
		return srno;
	}
	public void setSrno(int srno) 
	{
		this.srno = srno;
	}
}
