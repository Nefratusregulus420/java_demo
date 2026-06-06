package first;

import java.util.Scanner;

public class SwapDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int num = sc.nextInt();

        int tens = num / 10;  
        int ones = num % 10;   

        int swapped = ones * 10 + tens; 
        System.out.println("Swapped number: " + swapped);
        sc.close();
    }
}

