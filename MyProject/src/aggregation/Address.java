//Class 2- Address. Get the address of student Print Student name, roll number with address  
//There is no IS-A relationship

package aggregation;
public class Address 
{	private String hname, place;
	private int pin;
	Student s;
	public String getHname() 
	{
		return hname;
	}
	public void setHname(String hname)
	{
		this.hname = hname;
	}
	public String getPlace() 
	{
		return place;
	}
	public void setPlace(String place) 
	{
		this.place = place;
	}
	public int getPin() 
	{
		return pin;
	}
	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	public void setS(Student s) 
	{
		this.s = s;
	}
	
	public void printData()
	{
		System.out.println(" Student Name : "+s.getSname());
		System.out.println(" Student Roll No : "+s.getSrno());
		System.out.println(" Student House name : "+getHname());
		System.out.println(" Student Place : "+getPlace());
		System.out.println(" PIN : "+getPin());
	}

	
	

}
