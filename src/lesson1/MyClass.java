package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) 
	{
		int x,y,answer;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Value for x : ");
		x = scan.nextInt();
		//Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Value for y : ");
		y = scan.nextInt();
	
		answer=x+y;
		//System.out.print(answer);
		System.out.println("Answer is : " + answer);
	}

}
