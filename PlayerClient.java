public class PlayerClient
{


   public static void main(String[] args)
   {
      //testPlayers();
      //testIndividualPlayers(); 
      // testRecords();      
      
      Player p = new TeamPlayer("Marla", "goalie"); //,  true); 
      TeamPlayer oops = (TeamPlayer)p; 
      System.out.println(oops.getPosition());      

   }
   
   /** Method to test the Player class
    *
    */
   public static void testPlayers()
   {
      // Create a blank Player, 
      // then set the name and status using mutator methods.
      // Print out the result. 
      // Player footballPlayer = new Player(); 
//       footballPlayer.setName("Russell Wilson"); 
//       footballPlayer.setStatus(false); 
//       System.out.println(footballPlayer); 
      
      // Create a new Player with the one parameter constructor
      // do not set the status
      // print the result. 
      Player ultimatePlayer = new Player("Khalif El-salaam"); 
      System.out.println(ultimatePlayer);       
            
      // Create a new Player with the one parameter constructor
      // set the status to true. 
      // print the result. 
      Player soccerPlayer = new Player("Lionel Messi"); 
      soccerPlayer.setStatus(true); 
      System.out.println(soccerPlayer); 
      
      // Create a new Player with the two parameter constructor
      // print the result. 
      Player baseballPlayer = new Player("Edgar Martinez", false); 
      System.out.println(baseballPlayer); 
      
      // Create a new Player using the accessor methods to get the name and status from another Player. 
      // Print whether two objects are identical. 
      Player testPlayer = new Player(baseballPlayer.getName(), baseballPlayer.getStatus()); 
      System.out.print(testPlayer + " is"); 
      if ( !testPlayer.equals(baseballPlayer) )
         System.out.print(" not"); 
      System.out.println(" equal to " + baseballPlayer); 
      
      
   }    
      
   /** Method to test the Player class
    *
    */
   public static void testIndividualPlayers()
   {
      IndividualPlayer ip = new IndividualPlayer("Serena Williams", true); 
      Record r = new Record(); 
      r.setWins(50);
      r.setLosses(2); 
      ip.setRecord(r); 
      System.out.println(ip); 
   }

}