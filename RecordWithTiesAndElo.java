public class RecordWithTiesAndElo extends RecordWithTies
{
   private double eloRating; 
      
   public RecordWithTiesAndElo()
   {
      super(); 
      eloRating = 0; 
   }
   
   public double getEloRating()
   {
      return eloRating; 
   }
      
      
   public void setEloRating(double rating)
   {
      eloRating = rating; 
   }

   public void updateElo(RecordWithTiesAndElo other, double outcome)
   {
      double change = EloChangeCalculator.getRatingChange(eloRating, other.eloRating, outcome); // outcome is based off this vs the other 
      //other.eloRating -= change;
      eloRating += change; 
   }

   /** 
    * @param outcome is 1 if r1 has won, 0 if r1 has lost, and .5 if they tie. 
    */
   public static void updateElo(RecordWithTiesAndElo r1,
                                 RecordWithTiesAndElo r2, double outcome)
   {
      // check if outcome is either 1, 0, .5
      double change = EloChangeCalculator.getRatingChange(r1.eloRating, r2.eloRating, outcome); // outcome is based off this vs the other 
      r2.eloRating -= change;
      r1.eloRating += change; 
   }                               
                                 
                                 
                                 
//    public static void updateElo(RecordWithTiesAndElo r1, RecordWithTiesAndElo r2, double outcome)  // outcome is based off r1 vs r1. r1 wins over r2 means 1.0
//    {
//       double change = EloChangeCalculator.getRatingChange(r1.eloRating, r2.eloRating, outcome);
//       r2.eloRating -= change;
//       r1.eloRating += change; 
//    }
   
   public String toString()
   {
      return  super.toString() + ", " + (int)Math.round(eloRating) + " Elo rating"; 
   }
   
   public boolean equals(Object other)
   {
      if ( super.equals(other) && other instanceof RecordWithTiesAndElo)
      {
         RecordWithTiesAndElo r = (RecordWithTiesAndElo)other; 
         return eloRating == r.getEloRating();
      }
      return false; 
   }
  
   public int isBetterThan(Rankable other)
   {  
      if ( other instanceof RecordWithTiesAndElo )
      {
         RecordWithTiesAndElo r = (RecordWithTiesAndElo)other;
         if ( Math.abs(eloRating - r.eloRating) < 0.01 )
            return 0; 
         else if ( eloRating > r.eloRating )
            return 1; 
         else 
            return -1; 
      }
      else 
         return super.isBetterThan(other); 

   }



}