import java.util.*; 

public class TeamRecordComparator implements Comparator<Team> 
{
   public int compare(Team t1, Team t2) {
      int per1 = (int)(t1.getRecord().getPercent() * 100); 
      int per2 = (int)(t2.getRecord().getPercent() * 100); 
      return  per1 - per2; 
        
   }
}
