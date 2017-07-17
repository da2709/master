package lesson1;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) 
	{
		int no;
			System.out.println("Enter No : ");
			Scanner scan= new Scanner(System.in);
			no= scan.nextInt();	
		
		while(no<=10)
		{
			System.out.println(no);
			no++;
			
		}
		System.out.println("-----------------");
		int no1;
		System.out.println("Enter No1 : ");
		Scanner scan1= new Scanner(System.in);
		no1= scan1.nextInt();
		do
		{
			System.out.println(no1);
			no1++;
		}while(no1<=-1);
			

	}

}
