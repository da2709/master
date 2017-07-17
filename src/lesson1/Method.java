package lesson1;

public class Method {

	public static void main(String[] args)
	{
		myfirstmethod(" John");
		Add(100,200);
		int sum = Add1(100,300);
		System.out.println(sum);
		

	}
	public static void  myfirstmethod(String name) 
	{
		System.out.println("Hello World");
		System.out.println("Hello"+ name);
	}
	public static void  Add(int a,int b)
	{
		System.out.println(a+b);
	}
	public static int Add1(int c,int d)
	{
		//System.out.println(c+d);
		return(c+d);
	}
}
