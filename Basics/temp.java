import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit");
        double fahrenheit = input.nextDouble();
        double CelsiusTemp = (fahrenheit - 32) * 5 / 9;
        System.out.println("Celsius: " + CelsiusTemp);
        System.out.println("Enter a temperature in Celsius");
        double celsius = input.nextDouble();
        double FahrenheitTemp = ((double) 9 / 5) * celsius + 32;
        System.out.println("fahrenheit: " + FahrenheitTemp);
    }
}
