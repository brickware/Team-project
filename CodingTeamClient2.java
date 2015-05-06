//Tom Butler, CS III, 3/1/15
//Client to test Team hierarchy
//Creats and tests a BasketballTeam

import java.util.*;

/**
 *Create and test a CodingTeam object
 */
public class CodingTeamClient2
{
   public static int ROSTER_SIZE = 6;
   public static int NUM_IN_CONTEST = 3;
   
   //Create the CodingTeams and call various methods
   public static void main(String[] args)
   {
      //Create CodingTeams
      CodingTeam team8AM = createCodingTeamFromFirstPeriod();
      team8AM.setWins(5);
      team8AM.setLosses(6);

      CodingTeam teamAlexRyan = createCodingTeamFromThirdPeriod(); 
      teamAlexRyan.setWins(7);
      teamAlexRyan.setLosses(9);

      CodingTeam nonSeniors = createCodingTeamFromFourthPeriod(); 
      nonSeniors.setWins(4);
      nonSeniors.setLosses(4); 

      CodingTeam booleans = createCodingTeamFromFifthPeriod(); 
      booleans.setWins(7); 
      booleans.setLosses(3); 

      Team[] teams = {team8AM, booleans, teamAlexRyan, nonSeniors}; 
      // Code will be added here: 
      System.out.println("\nTesting comparators before sort"); 
      System.out.println(Arrays.toString(teams)); 
      
      System.out.println("Testing comparators sorted by name"); 
      // Add code to sort by Name!
      Arrays.sort(teams, new TeamNameComparator());
      System.out.println(Arrays.toString(teams)); 
      
      System.out.println("Testing comparators sorted by record"); 
      // Add code to sort by Record!
      
      Arrays.sort(teams, new TeamRecordComparator());
      System.out.println(Arrays.toString(teams)); 

      
      
   }
   
   /**
    *Create a CodingTeam with some students from first period
    *@return The CodingTeam
    */
   public static CodingTeam createCodingTeamFromFirstPeriod()
   {
      CodingTeam theTeam = new CodingTeam("team8AM", ROSTER_SIZE, NUM_IN_CONTEST);
      theTeam.addPlayer( new TeamPlayer("Rohit", true, "coder") );
      theTeam.addPlayer( new TeamPlayer("Marla", false, "designer") );
      theTeam.addPlayer( new TeamPlayer("Claire", true, "kibbitzer") );
      theTeam.addPlayer( new TeamPlayer("Carter", true, "designer") );
      theTeam.addPlayer( new TeamPlayer("Patty", false, "kibbitzer") );
      return theTeam;
   }
   
   /**
    *Create a CodingTeam with some students from third period
    *@return The CodingTeam
    */
   public static CodingTeam createCodingTeamFromThirdPeriod()
   {
      CodingTeam theTeam = new CodingTeam("teamAlexRyan", ROSTER_SIZE, NUM_IN_CONTEST);
      theTeam.addPlayer( new TeamPlayer("Ryan", true, "coder") );
      theTeam.addPlayer( new TeamPlayer("Other Ryan", false, "coder") );
      theTeam.addPlayer( new TeamPlayer("Alex C.", true, "designer") );
      theTeam.addPlayer( new TeamPlayer("Alex M.", true, "designer") );
      return theTeam;
   }
   
   /**
    *Create a CodingTeam with some students from fourth period
    *@return The CodingTeam
    */
   public static CodingTeam createCodingTeamFromFourthPeriod()
   {
      CodingTeam theTeam = new CodingTeam("nonSeniors", ROSTER_SIZE, NUM_IN_CONTEST);
      theTeam.addPlayer( new TeamPlayer("Mihir", true, "coder") );
      theTeam.addPlayer( new TeamPlayer("David", false, "coder") );
      theTeam.addPlayer( new TeamPlayer("Karsten", true, "coder") );
      theTeam.addPlayer( new TeamPlayer("Sadie", true, "designer") );
      theTeam.addPlayer( new TeamPlayer("Aidan", true, "designer") );
      theTeam.addPlayer( new TeamPlayer("Caroline", true, "designer") );
      return theTeam;
   }

   /**
    *Create a CodingTeam with some students from fifth period
    *@return The CodingTeam
    */
   public static CodingTeam createCodingTeamFromFifthPeriod()
   {
      CodingTeam theTeam = new CodingTeam("booleans", ROSTER_SIZE, NUM_IN_CONTEST);
      theTeam.addPlayer( new TeamPlayer("Sarah", true, "coder") );
      theTeam.addPlayer( new TeamPlayer("Amy", false, "coder") );
      theTeam.addPlayer( new TeamPlayer("Anna", true, "designer") );
      theTeam.addPlayer( new TeamPlayer("Krisy", true, "designer") );
      return theTeam;
   }

}