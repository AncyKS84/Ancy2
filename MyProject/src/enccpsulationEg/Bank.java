package enccpsulationEg;

public class Bank 
{
	private float balance;
	private String name;
	public float getBalance() 
	{
		return balance;
	}
	public void setBalance(float balance) 
	{
		this.balance = balance;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void updateBalance()
	{
		float i = balance*2*.08f;
		balance+=i;
	}

}
