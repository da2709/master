package lesson3;

//import javax.swing.plaf.synth.SynthSeparatorUI;

public class Polymorphism {

	public static void main(String[] args) 
	{
		PolymorphismMain bank = new PolymorphismMain_ABC();
		PolymorphismMain bank1 = new PolymorphismMain_DEF();
		
		System.out.println(bank.bankintrestrate());
		System.out.println(bank1.bankintrestrate());
	}

}
