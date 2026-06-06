package day_four;

public class Cat extends Pet implements Animal{
	
	 Cat(String n) {
		   super(n);
	   }
		public void makeASound() {
			System.out.println(name+" Meow");	
		}
		public void play() {
			System.out.println(name+" Stretching it's legs from playing too much");
		}

}
