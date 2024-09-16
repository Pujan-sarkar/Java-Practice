// Write a java programme which will add two decimal numbers show the summation of it.

import java.util.Scanner;

public class floatsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        float a = sc.nextFloat();
        System.out.println("Enter the second number: ");
        float b = sc.nextFloat();
        float c = a + b;
        System.out.println("The sum is: " + c);
    }
}
