package lesson1;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) 
	{
		int score;
		System.out.println("Enter Score : ");
		Scanner scan= new Scanner(System.in);
		score= scan.nextInt();		
		switch(score)
		{
		case 90 :
			System.out.println("very Good");
			break;
		case 60 :
			System.out.println("Good");
			break;
		case 40 :
			System.out.println("Low");
			break;
		default :
			System.out.println("Score is not define");
			break;
		}
		

	}

}
