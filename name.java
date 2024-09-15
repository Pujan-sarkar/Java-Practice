//Write a java programme to display your name and roll number.
import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your name : ");
        String name = sc.nextLine();
        System.out.println("Enter Your roll no ");
        int roll = sc.nextInt();
        System.out.println("This is your name : "+name);
        System.out.println("This is your roll no : "+roll);
    }
}
