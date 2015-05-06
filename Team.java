import java.util.*;

public abstract class Team implements Rankable
{
   protected String name; 
   protected List<Player> roster; 
   protected int MAX_ROSTER_SIZE; 
   protected int MIN_PLAYING_SIZE; 
   protected Record teamRecord; 
   
   
   // Shoud add name to team. 
   public Team(/*String n,*/ int max, int min)
   {
      if ( min <= 0 || max <= 0)
      {
         throw new IllegalArgumentException();
      }
      name = ""; 
      MAX_ROSTER_SIZE = max; 
      MIN_PLAYING_SIZE = min; 
      roster = new LinkedList<Player>(); 
   }
   
   public void setName(String n)
   {
      name = n; 
   }
   
   public String getName()
   {
      return name; 
   }

   public String toString()
   {
      return "Team: " + name + " Record: " + teamRecord; 
      // String output = ""; 
//       for (Player p : roster)
//       {
//          output += p + "\n"; 
//       }
//       return output; 
   }
   
   public void addPlayer(Player p)
   {
      if (roster.size() == MAX_ROSTER_SIZE)
         throw new IllegalArgumentException(); 
         
      roster.add(p); 
   }
   
   public void removePlayer(String name) 
   {
      Player p = findPlayer(name); 
      if (p != null)
      {
         roster.remove(p);
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
         for (int ii = 0; ii < roster.size(); ii++)
         {
            if (roster.get(ii) != null && name.equals(roster.get(ii).getName()))
            {
               return roster.get(ii);  
            }  
         }    
      }
      return null; 
   
   }
   
   public int getRosterSize()
   {
      return roster.size();
   }
   
   public List<Player> getRoster()
   {
      return roster; 
   }
   
   public boolean canFieldATeam()
   {
      if (  roster.size() >= MIN_PLAYING_SIZE && roster.size() <= MAX_ROSTER_SIZE)
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
   
   public void sort()
   {
      Collections.sort(roster); 
   }
}