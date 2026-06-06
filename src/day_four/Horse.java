package day_four;

public class Horse extends Pet implements Animal{
	
	 Horse(String n) {
		   super(n);
	   }
		public void makeASound() {
			System.out.println(name+" Neigh");	
		}
		public void play() {
			System.out.println(name+" is Reaching the hightest speed and it broke the record");
		}

}
