package enccpsulationEg;
import java.util.*;
public class User {
	public void readPin()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the PIN : ");
		int pin =sc.nextInt();
		Bank1  b= new Bank1();
		b.setPin(pin);
		if(b.validdatePin(b.getPin()))
			System.out.println("PIN is Valid");
		else
			System.out.println("PIN is Invalid");
		sc.close();
	}

	public static void main(String[] args) {
		User u =new User();
		u.readPin();
		
		
	}

}
