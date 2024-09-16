import java.util.Scanner;

public class largest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number");
        int num2 = sc.nextInt();
        System.out.println("Enter the 3rd number");
        int num3 = sc.nextInt();
        int maxi = num1;
        if (num2 > maxi) {
            maxi = num2;
        }
        if (num3 > maxi) {
            maxi = num3;
        }
        System.out.println("The largest number is " + maxi);


    }
}
