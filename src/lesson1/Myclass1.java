package lesson1;

public class Myclass1 {

	public static void main(String[] args) 
	{
		Cube cube= new Cube();// Cube() this called Constructor of Cube class..
		//Most basic Property of Constructor is even if u dont define Constructor
		//Java will create default Constructor when ever you create class.
		
		System.out.println(cube.getCubeVolume());
		Cube cube1= new Cube(20,20,20);// This called Constructor called overloding.
		System.out.println(cube1.getCubeVolume());// This called Constructor called overloding.

	}

}
