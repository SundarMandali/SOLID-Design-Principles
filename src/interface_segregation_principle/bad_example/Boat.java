package interface_segregation_principle.bad_example;

public class Boat implements Vehicle {

	@Override
	public void start() {
		System.out.println("Boat is starting");
	}

	@Override
	public void stop() {
		System.out.println("Boat is stopping");
	}

	@Override
	public void floating() {
		System.out.println("Boat is floating");
	}

	@Override
	public void flying() {
		throw new UnsupportedOperationException("Boat can't fly");
	}
	
}
