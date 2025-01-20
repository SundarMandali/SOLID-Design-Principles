package liskov_substitution_principle.good_example;

public class Penguin implements Bird {

	@Override
	public void move() {
		System.out.println("Penguin is swimming");
	}

}
