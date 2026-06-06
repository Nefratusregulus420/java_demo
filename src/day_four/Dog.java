package day_four;

public class Dog extends Pet implements Animal{
   
    Dog(String n) {
	   super(n);
   }
	public void makeASound() {
		System.out.println(name+" barks");	
	}
	
	public void play() {
		System.out.println(name+" Running to catch the ball");
	}
	

}
