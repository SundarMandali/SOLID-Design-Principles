package interface_segregation_principle.good_example;

public class Car implements LandVehicle{

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}
	
}
