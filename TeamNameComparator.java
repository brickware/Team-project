import java.util.*; 

public class TeamNameComparator implements Comparator<Team> 
{
   public int compare(Team t1, Team t2) {
      return t1.getName().compareTo(t2.getName());  
        
   }
}
