package interface_segregation_principle.good_example;

public class Main {
	public static void main(String[] args) {
		Aeroplane aeroplane=new Aeroplane();
		aeroplane.start();
		aeroplane.stop();
		aeroplane.fly();
		
		Car car=new Car();
		car.start();
		car.stop();
		
		Boat boat=new Boat();
		boat.start();
		boat.stop();
		boat.floating();
	}
}
/*
 ==>ISP ensures that classes only depend on the methods that are relevant to them.
 ==>Instead of one fat interface that force unnecessary methods on every class, smaller and
 more focused interfaces allow each class to implement just what it needs. 
 */
