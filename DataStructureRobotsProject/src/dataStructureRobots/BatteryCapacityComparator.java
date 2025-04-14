package dataStructureRobots;

import java.util.Comparator;

public class BatteryCapacityComparator implements Comparator<Robot>
{
   @Override
   public int compare(Robot r1, Robot r2)
   {
	  return Integer.compare(r1.getBatteryCapacity(), r2.getBatteryCapacity());
   }
}