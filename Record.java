public class Record implements Rankable
{

   int wins; 
   int losses; 
   
   public Record()
   {
      wins = losses = 0; 
   }
   
   public int getWins()
   {
      return wins; 
   }
   
   public void setWins(int w)
   {
      wins = w; 
   }
   
   public void won()
   {
      wins++; 
   }
   
   public int getLosses()
   {
      return losses; 
   }
   
   public void setLosses(int l)
   {
      losses = l;
   }
   
   public void lost()
   {
      losses++;
   }
   
   public double getPercent()
   {
      return (double)wins / (wins + losses) * 100;
   } 
   
   public String toString()
   {
      return  wins + " wins, " + losses + " losses"; 
   }
   
   public boolean equals(Object other)
   {
      if (other instanceof Record)
      {
         Record r = (Record)other; 
         return wins == r.getWins() && losses == r.getLosses();
      }
      return false; 
   }
   
   public Record getRecord()
   {
      return this; 
   }
  
   public int isBetterThan(Rankable other)
   {  
      Record r = other.getRecord();
   
      double percent = getPercent();
      double opercent = r.getPercent();
      if ( Math.abs(percent - opercent ) < 0.01)
         return 0; 
      else if ( percent > opercent)
         return 1; 
      else 
         return -1; 

    } 
}
