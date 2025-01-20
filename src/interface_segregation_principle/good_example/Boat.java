package interface_segregation_principle.good_example;

public class Boat implements WaterVehicle,LandVehicle{

	@Override
	public void floating() {
		System.out.println("Boat is floating");	
	}
	
	@Override
	public void start() {
		System.out.println("Boat is starting");
	}

	@Override
	public void stop() {
		System.out.println("Boat is stopping");
	}
}
