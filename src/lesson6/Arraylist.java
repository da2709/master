package lesson6;

import java.util.ArrayList;

//import java.util.List;


//In java Util Library has keyword  its called Arraylist and that Arraylist 
// is help to maintain and use to dyanamic Arraylist
//In this library you can easliy increase and decrease arraylist

public class Arraylist {

	public static void main(String[] args) {
		//int simple_array[]= new int[5];
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(40);
		myList.add(50);
		myList.add(60);
		 
		for(Integer x : myList)
			System.out.println(x);
			
			System.out.println(myList.size());
			
			System.out.println("------END------");
			myList.add(6, 70);
			for(Integer x : myList)
			System.out.println(x);			
			System.out.println(myList.size());
	}	

}
