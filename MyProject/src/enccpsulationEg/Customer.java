package enccpsulationEg;

public class Customer {

	public static void main(String[] args) {
		Bank b=new Bank();
		b.setName("ASD");
		b.setBalance(1000f);
		b.updateBalance();
		System.out.println("Name : "+b.getName());
		System.out.println("Balance : "+b.getBalance());
		
		

	}

}
