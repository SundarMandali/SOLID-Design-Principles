package liskov_substitution_principle.good_example;

public class Main {
	public static void main(String[] args) {
		Bird sparrow=new Sparrow();
		sparrow.move();
		
		Bird penguin=new Penguin();
		penguin.move();
	}
}
/*
=>Now subclasses can extend parent class's capabilities seamlessly. 
*/