import java.util.*; 

public  class BicycleTeam extends Team implements Rankable 
{
  
   public BicycleTeam(String n, int min, int max) 
   {
      super(min, max);
      setName(n); 
      setRecord(new Record());  
   }
   
   public void addPlayer(Player p )
   {
      if ( !(p instanceof TeamPlayer) )
         throw new IllegalArgumentException(); 
      super.addPlayer(p); 
   }
   
   public void updatePlayerPosition(String name, String newPosition)
   {
      TeamPlayer p = (TeamPlayer)findPlayer(name); 
      if ( p != null )
         p.setPosition(newPosition);
   }
      
   public boolean shouldFieldATeam()
   {
     
      if ( !canFieldATeam())
         return false; 
         
      String types[] = {"domestique", "sprinter", "climber", "puncheur", "time trialist", "all-rounder"}; 
      int counts[] = new int[types.length]; 
      
      List<Player> roseter = getRoster(); 
      for (int ii = 0; ii < roster.size(); ii++)
      { 
         // have a TeamPlayer that's available
         if ( roster.get(ii) != null && roster.get(ii)instanceof TeamPlayer && roster.get(ii).getStatus() )  
         {
            String look = ((TeamPlayer)roster.get(ii)).getPosition().trim().toLowerCase(); 
            for (int jj = 0; jj < types.length; jj++)
            {
               if ( look.equals(types[jj]) )
                  counts[jj]++; 
            }
         }
      }
      //System.out.println(Arrays.toString(counts)); 
   
      // now count up each type
      int oneEach = 0; 
      for (int ii = 0; ii < counts.length - 1; ii++) // count except all-rounders
      {
         if (counts[ii] > 0)
            oneEach++;
      }
      
      // This will be true if there is at least one of each type OR enough 
      // all rounders to fill in the gaps. 
      return counts[counts.length - 1] + oneEach > counts.length; 
      
      
   }





}
