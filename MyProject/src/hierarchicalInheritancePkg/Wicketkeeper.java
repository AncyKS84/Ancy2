package hierarchicalInheritancePkg;

import java.util.Scanner;

public class Wicketkeeper extends CricketTeam
{
	String playerName;
	int playerId;
	public void getdata()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Wicket Keeper Name  :  ");
		playerName=sc.next();
		System.out.println("Enter Wicket Keeper Id :  ");
		playerId=sc.nextInt();
		sc.close();
	}
	public void printData()
	{
		System.out.println("    Printing Data!!!!!");
		System.out.println("Wicket Keeper Name  :  "+playerName);
		System.out.println("Wicket Keeper Id    :  "+playerId);
		System.out.println("Team Name           :  "+teamName);
		System.out.println("Enter Team Id       :  "+teamId);
	}
	
	
	public static void main(String[] args) 
	{
		Wicketkeeper wk =new Wicketkeeper();
		wk.getdata();
		wk.getTeamdetails();	
		wk.printData();
	}

}
