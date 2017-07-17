package lesson1;

public class MethodOverLoding
{
//This called Method Overloding
	public static void main(String[] args) 
	{
		System.out.println(Add(5,6));
		System.out.println(Add(5.5,4.5));
		System.out.println(Add("Hello","World"));

	}
	public static int Add(int a,int b)
	{
		return(a+b);
	}
	public static double Add(double a,double b)
	{
		return(a+b);
	}
	public static String Add(String a,String b)
	{
		return(a+b);
	}

}
