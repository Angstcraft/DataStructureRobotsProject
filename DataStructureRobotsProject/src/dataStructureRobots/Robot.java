package dataStructureRobots;

public class Robot
{
   private int id;
   private int batteryCapacity;

   /**
    * 
    * @param pId
    * @param pBatteryCapacity
    */
   public Robot(int pId, int pBatteryCapacity)
   {
	  this.id = pId;
	  this.batteryCapacity = pBatteryCapacity;
   }

   public int getId()
   {
	  return id;
   }

   public int getBatteryCapacity()
   {
	  return batteryCapacity;
   }

   @Override
   public String toString()
   {
	  return "Robot{id=" + id + ", batteryCapacity=" + batteryCapacity + "}";
   }
}