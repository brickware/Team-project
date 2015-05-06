import java.io.*; 
import java.util.*; 

public class BicycleTeamClient
{

   public static void main(String[] args) throws FileNotFoundException
   {
      //Team t = new Team(35, 30); 
      
      File f = new File("cyclingteam.txt");
      Scanner input = new Scanner(f); 
      BicycleTeam bt = new BicycleTeam("Garmin", 30, 25); // from http://cyclingtips.com.au/2009/02/pro-team-structure-what-does-it-all-mean/
      String[] names = new String[30];
      loadFile(input, bt, names); 
      printTeam("Original", bt); 
      setRandomAvailable(bt, .95, names);  // change 90% of them to available
      printTeam("After Available", bt); 
      setRandomPlayerPosition(bt, .75, names);  // change 50% of the player positions
      printTeam("After Position Changes", bt); 
            
   
   
   }
   
   public static void loadFile(Scanner input, BicycleTeam bt, String[] names)
   {
      int count = 0; 
      while ( input.hasNextLine() )
      {
         String name = input.nextLine().trim(); 
         if ( !input.hasNextLine())
         {
            System.out.println("Error in file!"); 
            break; 
         }
         names[count++] = name; 
         String temp = input.nextLine(); 
         Scanner lineScan = new Scanner(temp); 
         if (!lineScan.hasNextBoolean())
         {
            System.out.println("Error in file!"); 
            break; 
         }
         boolean available = lineScan.nextBoolean(); 
         String position = input.nextLine(); 
         if ( !input.hasNextLine())
         {
            System.out.println("Error in file!"); 
            break; 
         } 
                
         TeamPlayer p = new TeamPlayer(name, available, position); 
         //System.out.println("Adding " + name); 
         bt.addPlayer(p); 
      }
   }


   public static void setRandomAvailable(BicycleTeam bt, double percent, String[] names)
   {
      for (int ii = 0; ii < names.length; ii++ )
      {
         if (Math.random() < percent)
         {
            bt.updatePlayerStatus(names[ii], true); 
         }
      }
         
            
   }
   
   public static void setRandomPlayerPosition(BicycleTeam bt, double perc, String[] names)
   {
   
      for (int ii = 0; ii < names.length; ii++ )
      {
         if (Math.random() < perc)
         {
            bt.updatePlayerPosition(names[ii], "CHANGED"); 
         }
      }
         
   }
   
   public static void printTeam(String what, BicycleTeam bt)
   {
      System.out.println("\n" + what); 
      System.out.println(bt); 
      System.out.println("This team could field a team? " + bt.canFieldATeam()); 
      System.out.println("This team should field a team? " + bt.shouldFieldATeam()); 
      System.out.println(); 
   }   
      
}          