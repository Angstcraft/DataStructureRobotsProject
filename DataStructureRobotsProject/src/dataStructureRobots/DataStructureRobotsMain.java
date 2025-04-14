package dataStructureRobots;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataStructureRobotsMain 
{
   public static void main(String[] args)
   {
	  // Create robots
	  Robot robot1 = new Robot(1, 100);
	  Robot robot2 = new Robot(2, 200);
	  Robot robot3 = new Robot(3, 150);

	  // Using an array
	  Robot[] robotArray = new Robot[3];
	  robotArray[0] = robot1;
	  robotArray[1] = null; // empty position
	  robotArray[2] = robot1; // adding same robot again

	  // Using a list
	  List<Robot> robotList = new ArrayList<>();
	  robotList.add(robot2);
	  robotList.add(robot3);
	  robotList.add(robot2); // Adding the same robot twice

	  // Using a set (automatically sorted by battery capacity)
	  Set<Robot> robotSet = new TreeSet<>(new BatteryCapacityComparator());
	  robotSet.add(robot1);
	  robotSet.add(robot2);
	  robotSet.add(robot1); // Adding the same robot twice

	  // Print DS contents
	  System.out.println("Robot Array: ");
	  for (Robot robot : robotArray)
	  {
		 System.out.println(robot);
	  }

	  System.out.println("\nRobot List: ");
	  for (Robot robot : robotList)
	  {
		 System.out.println(robot);
	  }

	  System.out.println("\nRobot Set: ");
	  for (Robot robot : robotSet)
	  {
		 System.out.println(robot);
	  }

	  // Create a Factory and add robots to it
	  Factory factory = new Factory();
	  factory.addRobot(robot1);
	  factory.addRobot(robot2);
	  factory.addRobot(robot3);
	  factory.addRobot(robot1); // Adding robot1 a second time to the factory

	  // Print factory robots
	  System.out.println("\nFactory Robots: ");
	  for (Robot robot : factory.getRobots())
	  {
		 System.out.println(robot);
	  }
   }
}