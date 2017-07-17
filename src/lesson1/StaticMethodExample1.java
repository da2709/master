package lesson1;

public class StaticMethodExample1 
{
	String name;
	int age;
	static int NoOfMember = 0;
	
	StaticMethodExample1()//Constructor
	{
		NoOfMember++;
	}
	public static int  getStaticMethodExample() 
	{
		return NoOfMember;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
