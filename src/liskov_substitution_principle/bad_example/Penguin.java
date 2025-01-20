package liskov_substitution_principle.bad_example;

public class Penguin implements Bird{

	@Override
	public void fly() {
		throw new UnsupportedOperationException("Penguins cant fly");
	}
	
}
