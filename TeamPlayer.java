/**
 * This class encapsulates a player on a sports team. 
 */
public class TeamPlayer extends Player 
{

   /** The primary position the player performs on the team. 
    *  This will be dependent on the sport played
    */
   private String playerPosition;
   
   /**
    *  Default constructor sets the player's full name to a blank string, 
    *  the availabilty to false, and the position to a blank string
    */   
   public TeamPlayer()
   {
      this("", false, ""); 
   }
   
   /**
    *  This constructor takes two parameter and sets the player's name and position to those parameters. 
    *  The default status is false
    *  @param name The name of the player. 
    *  @param The primary position the player performs on the team. 
    */
   public TeamPlayer(String name, String position)
   {
      this(name, false, position); 
   }
   
   /**
    *  This constructor takes three parameters: one for the player's name, one for the player's status
    *  and one for the position the player performs on the team.  
    *  It sets the three private variables to the parameters that are passed in
    *  @param name The name of the player. 
    *  @param status The current status of the player (available or not available)
    *  @param The primary position the player performs on the team. 
    */   
   public TeamPlayer(String name, boolean status, String position)
   {
      super(name, status); 
      setPosition(position); 
   }
   
  /**
    *  Sets the position of this player, overriding the previous position 
    *  @param position The position of the player. 
    */    
   public void setPosition(String position)
   {
      playerPosition = position;
   }

   /**
    *  Gets the position of this player object
    *  @return The position of the player object as a string
    */
   public String getPosition()
   {
      return playerPosition;
   }
   
  /**
    * Determines if two player objects are equivalent. Two players are equal only if their 
    * their names are identical, and their positions are equal. the status is ignored. 
    * @return true if they are equal, false if not
    */
   
   public boolean equals(Object other)
   {
      if (super.equals(other) && other instanceof TeamPlayer)
      {
         TeamPlayer p = (TeamPlayer)other; 
         return playerPosition.equals(p.getPosition());
      }
      return false; 
      
   }
   
   /**
    *  Returns a string representation of the player object. Helpful for printing out or debugging. 
    *  @return a string representation of the player object
    */
   public String toString()
   {
      return super.toString() + " Position: " + getPosition(); 
   }
   
   public int compareTo(Player other)
   {
      TeamPlayer p = (TeamPlayer)other; 
      if ( getPosition().compareTo(p.getPosition()) == 0)
         return getName().compareTo(p.getName()); 
      else 
         return 0;    
   }
   
   
}