public class RecordWithTies extends Record 
{

   int ties = 0; 
   
   public RecordWithTies()
   {
      super();
      ties = 0; 
   }
   
   public int getTies()
   {
      return wins; 
   }
   
   public void setTies(int t)
   {
      ties = t; 
   }
   
   public void tied()
   {
      ties++; 
   }
   
   public double getPercent()
   {
      return (double)wins / (wins + losses + ties) * 100;
   } 
      
   public String toString()
   {
      return super.toString() +  ", " + ties + " ties"; 
   }
   
   public boolean equals(Object other)
   {
      if ( super.equals(other) && other instanceof RecordWithTies )
      {
         RecordWithTies r = (RecordWithTies)other; 
         return ties == r.getTies();
      }
      return false; 
   }
  
 
}