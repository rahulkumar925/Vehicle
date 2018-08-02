
public class Vehicle {

	int currentSpeed;
	int currentDirection;
	String owner;
	static int highestVIN;
    int VIN;
	 public static void main(String args[]){
			Vehicle vehicle = new Vehicle();
			vehicle.VIN= highestVIN++;
			vehicle.owner="Rahul";
			
			Vehicle vehicle2 = new Vehicle();
			vehicle2.VIN= highestVIN++;
			vehicle2.owner="Shyam";
			
			 System.out.println("VIN: " + vehicle.VIN + " belongs to " + vehicle.owner); 

			 System.out.println("VIN: " + vehicle2.VIN + " belongs to " + vehicle2.owner); 
		}
}
