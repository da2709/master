package lesson5;

public class Recursion {
	
	public static int add(int a,int b) {
		return(a+b);
	}

	public static void main(String[] args) {
		//in this example you can see there is add method 
		// we called that method inside the method its called Resursion
		int sum=add(23,27);
		System.out.println(sum);
	}

}
