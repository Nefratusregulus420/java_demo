package day_three;

public class IntroArray {
    public static void main(String[] args) {
        int[] marks = {10, 40, 20, 60};
        System.out.println("The length of an array : " + marks.length);

        // Index-based loop
        for(int i = 0; i <= marks.length-1; i++) {
            System.out.println(marks[i]);
        }

        // Enhanced for loop
        for(int mark : marks) {
            System.out.print(mark + " ");
        }
    }
}
