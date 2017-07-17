package lesson1;

public class String1 {

	public static void main(String[] args) 
	{
		String mystring="Hello world"; // String Define
		
		
		int mystringlength = mystring.length();
		System.out.println("String Length :"+mystringlength);
		//Define//String myString = new String();
		System.out.println(mystring);
		String mystringlowercase = mystring.toLowerCase();
		System.out.println("String Lower Case                 : "+mystringlowercase);
		String replacemystring = mystring.replace('o','0');
		System.out.println("String Replace                    : "+replacemystring);
		System.out.println("String Uppercase                  : "+mystring.toUpperCase());
		System.out.println("String In Bytecode                : "+mystring.getBytes());
		System.out.println("String In Unicode Value           : "+mystring.codePointAt(8));
		System.out.println("String Before Unicode Value       : "+mystring.codePointBefore(9));
		System.out.println("String Unicode Difference         : "+mystring.codePointCount(5, 10));
		System.out.println("String Char index                 : " +mystring.charAt(6));
		System.out.println("String SubString                  : "+mystring.substring(3, 7));
		System.out.println("String Comare to different String : "+mystring.compareToIgnoreCase(mystringlowercase));
		System.out.println("String Concate two string         : "+mystring.concat(mystringlowercase));
		System.out.println("String Trim                       : "+mystring.trim());
		StringBuffer sb = new StringBuffer(mystring);
		String reverse=sb.reverse().toString();
		System.out.println("String Reverse                    : "+reverse);
			
		}
	//}

}
