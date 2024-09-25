package hierarchicalInheritancePkg;

import java.util.Scanner;

public class Bowlers extends CricketTeam{

	String playerName;
	int playerId;
	public void getdata()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Bowler's Name  :  ");
		playerName=sc.next();
		System.out.println("Enter Bowler's Id :  ");
		playerId=sc.nextInt();
		sc.close();
	}
	public void printData()
	{
		System.out.println("    Printing Data!!!!!");
		System.out.println("Bowler's Name  :  "+playerName);
		System.out.println("Bowler's Id    :  "+playerId);
		System.out.println("Team Name           :  "+teamName);
		System.out.println("Enter Team Id       :  "+teamId);
	}
	
	
	public static void main(String[] args) 
	{
		Bowlers bw =new Bowlers();
		bw.getdata();
		bw.getTeamdetails();	
		bw.printData();
	}


}
