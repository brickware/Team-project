public abstract class Team implements Rankable
{
   protected Player[] roster; 
   protected int MAX_ROSTER_SIZE; 
   protected int MIN_PLAYING_SIZE; 
   private int currentSize; 
   
   protected Record teamRecord; 
   
   
   public Team(int max, int min)
   {
   
    
      if ( min <= 0 || max <= 0)
      {
         throw new IllegalArgumentException();
      }
      MAX_ROSTER_SIZE = max; 
      MIN_PLAYING_SIZE = min; 
      roster = new Player[MAX_ROSTER_SIZE]; 
      currentSize = 0; 
   }
   
   

   public String toString()
   {
      String output = ""; 
      for (Player p : roster)
      {
         output += p + "\n"; 
      }
      return output; 
   }
   
   public void addPlayer(Player p)
   {
      if (currentSize == MAX_ROSTER_SIZE)
         throw new IllegalArgumentException(); 
         
      for (int ii = 0; ii < roster.length; ii++)
      {
         if ( roster[ii] == null )
         {
            roster[ii] = p; 
            currentSize++; 
            break; 
         }
      }
   }
   
   public void removePlayer(String name) 
   {
      for (int ii = 0; ii < roster.length; ii++)
      {
         if (roster[ii] != null && name.equals(roster[ii].getName()))
         {
            roster[ii] = null; 
            currentSize--; 
            break;
         }  
      }    
   }
   
   public void updatePlayerStatus(String name, boolean newStatus)
   {
      Player p = findPlayer(name); 
      if ( p != null )
         p.setStatus(newStatus); 
   }
   
   public Player findPlayer(String name)
   {
      if ( name != null )
      {
         for (int ii = 0; ii < roster.length; ii++)
         {
            if (roster[ii] != null && name.equals(roster[ii].getName()))
            {
               return roster[ii];  
            }  
         }    
      }
      return null; 
   
   }
   
   public int getRosterSize()
   {
      return currentSize;
   }
   
   public Player[] getRoster()
   {
      return roster; 
   }
   
   public boolean canFieldATeam()
   {
      if ( currentSize >= MIN_PLAYING_SIZE && currentSize <= MAX_ROSTER_SIZE)
      {
         int count = 0; 
         for ( Player p : roster )
         {
            if ( p != null && p.getStatus() )
               count++; 
         }
            return count >= MIN_PLAYING_SIZE; 
      }
      return false; 
   }
   
   
   public abstract boolean shouldFieldATeam(); 
   
   public int isBetterThan(Rankable other)
   {
     //  if ( !( other instanceof Team) )
//          throw new IllegalArgumentException(); 
// 
//       Team t = (Team) other; 
//       return t.teamRecord.isBetterThan(t.teamRecord); 
      
      Record r = other.getRecord();
      return teamRecord.isBetterThan(r); 
   
   }
   
   public Record getRecord()
   {
      return teamRecord;
   }
   
   public void setRecord(Record r)
   {
      teamRecord = r; 
   }
}