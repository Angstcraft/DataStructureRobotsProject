package dataStructureRobots;

import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator; // Import for Comparator

public class Factory
{
   private Set<Robot> robots;

   public Factory()
   {
	  this.robots = new TreeSet<>(new IdComparator());
   }

   public void addRobot(Robot robot)
   {
	  robots.add(robot);
   }

   public void removeRobot(Robot robot)
   {
	  robots.remove(robot);
   }

   public Set<Robot> getRobots()
   {
	  return robots;
   }

   // Comparator for sorting by ID
   class IdComparator implements Comparator<Robot>
   {
	  @Override
	  public int compare(Robot r1, Robot r2)
	  {
		 return Integer.compare(r1.getId(), r2.getId());
	  }
   }
}