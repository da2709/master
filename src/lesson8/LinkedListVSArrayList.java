package lesson8;
import java.util.LinkedList;
//import java.awt.image.AreaAveragingScaleFilter;
//import java.lang.reflect.Array;
import java.util.ArrayList;


public class LinkedListVSArrayList {
	
		public static void main(String[] args) 
	{
			long n= (long)10000000;
			ArrayList<Integer> arraylist = new ArrayList<Integer>();
			long milis =System.currentTimeMillis();
			for(int i=0;i<n;i++)
			{
				arraylist.add(i);
			}		
			System.out.println("Insertation Arraylist take "+(System.currentTimeMillis()-milis)+" ms");
			
			LinkedList linkedlist = new LinkedList();
			long milis1 = System.currentTimeMillis();
			for(int i=0;i<n;i++)
			{
				linkedlist.add(i);
			}
			System.out.println("Insertation for LinkedList "+(System.currentTimeMillis()-milis1)+" ms");
			
			milis=System.currentTimeMillis();
			arraylist.remove((long)10000000);
			System.out.println("Delete for arraylist "+(System.currentTimeMillis()-milis)+" ms");
			
			milis1=System.currentTimeMillis();
			linkedlist.remove((long)10000000);
			System.out.println("Delete for LinkedList "+(System.currentTimeMillis()-milis1)+" ms");
			
			milis=System.currentTimeMillis();
			arraylist.get(100000);
			System.out.println("Search for array List "+(System.currentTimeMillis()-milis)+" ms");
			
			milis1=System.currentTimeMillis();
			linkedlist.get(100000);
			System.out.println("Search For LinkedList "+(System.currentTimeMillis()-milis1)+" Ms");
	}

}
