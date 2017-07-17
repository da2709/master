package lesson1;



public class StaticMethod {

	public static void main(String[] args) 
	{
		//Using static Method 
		System.out.println(StaticMethod1.Somthing(11, 20));
		//Using Non-Static Method
		
		//In non-Static Method you have to use instance Method 
		StaticMethod1 NonStatic = new StaticMethod1();
		System.out.println(NonStatic.SomthingElse(11, 11));
	}

}
