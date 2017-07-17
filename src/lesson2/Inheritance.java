package lesson2;

import java.util.Scanner;

public class Inheritance {

	public static void main(String[] args) 
	{
		//int ans;
		Rectangle rec = new Rectangle();
		Triangle tri = new Triangle();
		
		
		
		
		
		rec.Set_Value(10,20);
		tri.Set_Value(10, 20);
		System.out.println("Are of Rectangle :"+rec.area());
		System.out.println("Area of Triangle :"+tri.area());
		

	}

}
