package liskov_substitution_principle.bad_example;

public class Main {

	public static void main(String[] args) {
		Bird sparrow=new Sparrow();
		sparrow.fly();
		
		Bird penguin=new Penguin();
		penguin.fly();
	}
}
/* According to Liskov-substitution principle:
 ==>Sub-class should extend the capability of parent class but not narrow it down.
 ==>In above example you can see that Sparrow is able to extend the capability of parent class.
 ==>But Penguin is unable to extend the capability of parent class instead it thrown unsupported 
 exception which mean it narrow downing the capability of parent class which is a violation for
 Liskov substitution principle.
 */
