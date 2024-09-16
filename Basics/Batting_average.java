import java.util.Scanner;

public class Batting_average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total runs of the batsman:");
        int runs = sc.nextInt();
        System.out.println("Enter how many times the batsman has been out:");
        int times = sc.nextInt();
        if (times == 0) {
            System.out.println("The batsman has never been out. Batting average is infinite.");
        } else {
            double average = (double) runs / times;
            System.out.printf("The batting average is: %.2f", average);
        }
    }
}

