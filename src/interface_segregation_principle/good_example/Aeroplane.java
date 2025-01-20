package interface_segregation_principle.good_example;

public class Aeroplane implements LandVehicle,AirVehicle {

	@Override
	public void fly() {
		System.out.println("Aeroplane is flying");
	}

	@Override
	public void start() {
		System.out.println("Aeroplane is starting");
	}

	@Override
	public void stop() {
		System.out.println("Aeroplane is stopping");
	}
	
}
