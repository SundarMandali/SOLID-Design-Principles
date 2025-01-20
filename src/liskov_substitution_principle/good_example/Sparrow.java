package liskov_substitution_principle.good_example;

public class Sparrow implements Bird {

	@Override
	public void move() {
		System.out.println("Sparrow is flying");
	}

}
