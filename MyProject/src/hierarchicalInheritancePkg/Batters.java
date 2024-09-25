package hierarchicalInheritancePkg;

import java.util.Scanner;

public class Batters extends CricketTeam {

	String playerName;
	int playerId;
	public void getdata()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batter's Name  :  ");
		playerName=sc.next();
		System.out.println("Enter Batter's Id :  ");
		playerId=sc.nextInt();
		sc.close();
	}
	public void printData()
	{
		System.out.println("    Printing Data!!!!!");
		System.out.println("Batter's Name  :  "+playerName);
		System.out.println("Batter's Id    :  "+playerId);
		System.out.println("Team Name           :  "+teamName);
		System.out.println("Enter Team Id       :  "+teamId);
	}
	
	
	public static void main(String[] args) 
	{
		Batters bt =new Batters();
		bt.getdata();
		bt.getTeamdetails();	
		bt.printData();
	}

}
