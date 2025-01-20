package interface_segregation_principle.bad_example;

public class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car is starting");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
	}

	@Override
	public void floating() {
		throw new UnsupportedOperationException("Car can't float");
	}

	@Override
	public void flying() {
		throw new UnsupportedOperationException("Car can't fly");
	}

}
