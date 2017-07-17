package lesson9;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorMain {
		
		//There are 4 ListIterator
		//(1) public boolean hasNext();
		//(2) public object Next();
		//(3) public boolean hasPrevoius();
		//(4) public object Previous();
		
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Dhrumil");
		list.add("DA");
		list.add("AD");
		list.add("JD");
		list.add("SD");
		
		
		ListIterator<String> name = list.listIterator();
		while(name.hasNext())
		{
			System.out.println(name.next());
			
		}
		System.out.println("--------------------------");
		while(name.hasPrevious())
		{
			
			System.out.println(name.previous());
		}

	}

}
