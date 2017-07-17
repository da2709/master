package lesson7;

import java.util.LinkedList;
public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList<String> StudentName = new LinkedList<String>();
		StudentName.add("Tom");
		StudentName.add("Jack");
		StudentName.addFirst("DA");
		StudentName.addLast("RD");
		for(String x:StudentName)
		System.out.println(x);

	}

}
