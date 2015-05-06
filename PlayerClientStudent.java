public class PlayerClient
{


   public static void main(String[] args)
   {
      //testPlayers();
      
      
      TeamPlayer superstar = new TeamPlayer();
      superstar.setName("Marshawn Lynch"); 
      superstar.setPosition("runningback");
      superstar.setStatus(true);
      System.out.println(superstar);
      
      TeamPlayer meh = new TeamPlayer("Chone Figgins", true, "third baseman"); 
      System.out.println(meh);
      
   
      // Open a file that contains player information
      // Read in that file into a array of player objects
      // Print some information about the player objects
         // if individual players: print them in ranked order. 
         // if a team player, just list them alphabetically (?)
   }
   
   public static void testPlayers()
   {
   
      Player tp1 = new TeamPlayer("Tom Butler", "forward"); 
      Player tp2 = new TeamPlayer("Antonio Hopson", "keeper"); 
      Player p1 = new Player("Lauren Bricker"); 
      IndividualPlayer ip1 = new IndividualPlayer("Siva Sankrithi");
      
      
   }    
      
      

}