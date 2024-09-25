package hierarchicalInheritancePkg;
import java.util.*;

public class CricketTeam
{
	int teamId;
	String teamName;
	public void getTeamdetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name  :  ");
		teamName=sc.next();
		System.out.println("Enter Team Id  :  ");
		teamId = sc.nextInt();
		sc.close();
	}

}
