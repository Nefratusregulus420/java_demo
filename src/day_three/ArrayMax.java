package day_three;

public class ArrayMax {

	public static void main(String[] args) {
		 int[] marks = {10, 40, 20, 60};
	     System.out.println("The length of an array : " + marks.length);
	     int max=0;
	     for(int mark : marks) {
	    	 if(mark>max) {
	    		 max=mark;
	    	 }
	        }
	     System.out.println("The max value in the Array is : "+max);
	}

}
