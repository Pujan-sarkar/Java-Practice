import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount : ");
        double p = input.nextDouble();
        System.out.print("Enter a rate:");
        double r = input.nextDouble();
        System.out.print("Enter time:");
        int t = input.nextInt();
        double  Simple = ((p*r*t)/100);
        System.out.printf("%.2f",Simple);
    }
}
