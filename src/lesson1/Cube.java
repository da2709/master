package lesson1;

public class Cube 
{
	int length;
	int width;
	int bredth;
	
	// Make new Method GetCubeVolume() It will return Integer value
	
	public int getCubeVolume()
	{
		return(bredth*width*length);		
	}
	// Constructor name is same as class name 
	Cube() // It can take Parameter or value // but it will not return any value
	{
		System.out.println("Hello World");
		length = 10;
		width =20;
		bredth =30;
	}
	Cube(int l,int w,int b)// This called Constructor called overloding.
	{
		
		length = l;
		width =w;
		bredth =b;
		
	}
	

}
