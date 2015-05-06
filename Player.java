/**
 * This class encapsulates a player of some kind of sport
 */
public class Player implements Comparable<Player>
{
   /** The player's full name. */
   private String playerName; 
   
   /* A boolean which represents whether the player is available or not */
   private boolean playerStatus; 
   
   /**
    *  Default constructor sets the player's full name to a blank string and the availabilty to false
    */   
    public Player()
   {
      this("", false);
    }
   
   /**
    *  This constructor takes one parameter and sets the player's name to that parameter. The default status is false
    *  @param name The name of the player. 
    */
   public Player(String playerName)
   {
      this(playerName, false);
   }
   
   /**
    *  This constructor takes two parameters: one for the player's name and one for the player's status. 
    *  It sets the two private variables to the parameters that are passed in
    *  @param name The name of the player. 
    *  @param status The current status of the player (available or not available)
    */
   public Player(String name, boolean status)
   {
      setName(name); 
      setStatus(status); 
   }
   
   /**
    *  Sets the name of this player, overriding the previous name 
    *  @param name The name of the player. 
    */ 
   public void setName(String name)
   {  
      playerName = name; 
   }

   /**
    *  Gets the name of this player object
    *  @return The name of the player object as a string
    */
   public String getName()
   {
      return playerName; 
   }

   /**
    *  Sets the status of the player to available (true) or not available (false)
    *  @param status Set to true if the player is available, false if not. 
    */   
   public void setStatus(boolean status)
   {
      playerStatus = status; 
   
   }
   
   
   /**
    *  Gets the status of the player as available (true) or not available (false)
    *  @return The value true if the player is available, false if not. 
    */   
   public boolean getStatus()
   {
      return playerStatus; 
   }
   

   /**
    *  Gets the status of the player as a string 
    *  @return The String "is available" or "is not available"
 
    */   
   public String getStatusString()
   {
      if (playerStatus)
         return " is available"; 
      else 
         return " is not available";
   }
   
   
   /**
    * Determines if two player objects are equivalent. Two players are equal only if their 
    * their names are identical, the status is ignored. 
    * @return true if they are equal, false if not
    */
   public boolean equals(Object other)
   {
      if ( other instanceof Player)
      {
         Player p = (Player)other; 
         return playerName.equals(p.getName());  // not checking status. 
      }
      return false; 
   }


   /**
    *  Returns a string representation of the player object. Helpful for printing out or debugging. 
    *  @return a string representation of the player object
    */
   public String toString()
   {
      return "Name: " + playerName + ", Availability: " + playerStatus;
   }
   
   public int compareTo(Player other)
   {
      return getName().compareTo(other.getName()); 
   
   }
   
}