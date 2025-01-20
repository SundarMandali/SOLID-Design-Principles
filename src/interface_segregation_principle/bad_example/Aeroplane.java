package interface_segregation_principle.bad_example;

public class Aeroplane implements Vehicle{

	@Override
	public void start() {
		System.out.println("Aeroplane is starting");
	}

	@Override
	public void stop() {
		System.out.println("Aeroplane is stopping");
	}

	@Override
	public void floating() {
		throw new UnsupportedOperationException("Aeroplane can't float");
	}

	@Override
	public void flying() {
		System.out.println("Aeroplane is flying");
	}

}
