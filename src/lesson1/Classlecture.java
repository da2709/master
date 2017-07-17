package lesson1;

public class Classlecture {

	public static void main(String[] args) 
	{
		Student da = new Student(); // da is object or instance 
		da.id = 1;
		da.name= "Dhrumil";
		da.age =  27;
		System.out.println("DA id "+da.id);
		System.out.println("DA age "+da.age);
		
		Student sp = new Student(); // sp is object or instance 
		da.id = 2;
		da.name= "Swara";
		da.age =  23;
		System.out.println("sp id "+da.id);
		System.out.println("sp age "+da.age);
		
		/*
		 * Using getter and setter mehtod is more secure  then useage of direct 
		 * input. More preffer this method 
		 */
		
		Student dhruv = new Student(); // dhruv is object or instance
		dhruv.setId(3); //using getter and setter method 
		dhruv.setName("dhruv"); //using getter and setter method
		dhruv.setAge(25); //using getter and setter method
		System.out.println("dhruv id "+dhruv.getId()); //using getter and setter method
		System.out.println("dhruv age "+dhruv.getAge()); //using getter and setter method
	}

}
