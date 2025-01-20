package interface_segregation_principle.bad_example;

public class Main{
	public static void main(String[] args) {
		Vehicle car=new Car();
		car.start();
		car.stop();
		car.floating();
		car.flying();
		
		Vehicle boat=new Car();
		boat.start();
		boat.stop();
		boat.floating();
		boat.flying();
		
		Vehicle aeroplane=new Car();
		aeroplane.start();
		aeroplane.stop();
		aeroplane.floating();
		aeroplane.flying();
		
	}
}
/*
 ==>Here Car is forced to implements methods like flying(),floating() which car doesn't use
 ==>Similarly Boat need to implement flying() and Aeroplane needs to implement floating() which they 
 doesn't use
 ==>These are forced to implement methods which they doesn't use and violate Interface segregation 
 principle.
*/