public class IndividualPlayer extends Player implements Rankable
{
   Record playerRecord;
   
   public IndividualPlayer()
   {
      super();
   }
   
   public IndividualPlayer(String name)
   {
      super(name);
      playerRecord = new Record(); 
   }
      
   
   
   public IndividualPlayer(String name, boolean status)
   {
      super(name, status);
      playerRecord = new Record(); 
   }
      
   
   public Record getRecord()
   { 
      return playerRecord; 
   }
   
   public void setRecord(Record r)
   {
      playerRecord = r; 
   }
   
   public boolean equals(Object other)
   {
        return false; 
      
   }
   
   public String toString()
   {
      return super.toString() + ", Record: " + playerRecord ; 
   }
   
   public int isBetterThan(Rankable other)
   {
      if ( other instanceof IndividualPlayer )
      {
         IndividualPlayer ip = (IndividualPlayer)other; 
         return playerRecord.isBetterThan(ip.playerRecord);
      }
      else return 0; 

   }
}   