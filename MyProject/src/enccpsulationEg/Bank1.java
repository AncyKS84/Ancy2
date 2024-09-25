//Program to withdraw amount from an ATM 
//Class 1- Bank One method to set pin from „User‟ class and
//validate Pin in another method [Valid pins – 1001, 1234, 1212] 
//Pin number should declared as private 
//Class 2 – User Get the pin from User
package enccpsulationEg;

public class Bank1 
{
	private int pin;

	public int getPin() 
	{
		return pin;
	}

	public void setPin(int pin) 
	{
		this.pin = pin;
	}
	public boolean validdatePin(int pin)
	{
		if(pin==1001 ||pin==1234||pin==1212)
			return true;
		return false;
	}

}
