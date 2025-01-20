package liskov_substitution_principle.bad_example;

public class Sparrow implements Bird {
	@Override
	public void fly() {
		System.out.println("Sparrow is flying");
	}
}
