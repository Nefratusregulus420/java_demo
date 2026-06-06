package day_three;
import java.util.Scanner;
public class StringArrayTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friend = {"Anil","Rohith","Tinesh"};
        String[] DOB = {"13/5/2006","29/8/2006","29/1/2005"};

        System.out.print("Enter a name to print the person's DOB: ");
        String name = sc.next();

        boolean found = false; // flag to check if name exists

        // Loop through the array
        for (int i = 0; i < friend.length; i++) {
            if (name.equals(friend[i])) {
                System.out.println("The DOB of " + name + " is " + DOB[i]);
                found = true;
                break; // stop loop once match is found
            }
        }
        if (!found) {
            System.out.println("Enter a valid name");
        }

        sc.close();
    }
}
