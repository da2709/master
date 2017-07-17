package lesson4;

public class MethodOverRiding {

	public static void main(String[] args)
	{
		Bank intrest = new Bank_ABC();
		Bank intrest1= new Bank_DEF();
		
		System.out.println(intrest.getintrestrate());
		System.out.println(intrest1.getintrestrate());
		

	}

}
