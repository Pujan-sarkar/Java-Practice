import java.util.Scanner;

public class  typecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chu = sc.next().trim().charAt(0);

        if (chu >= 'A' && chu <= 'Z') {
            System.out.println("Uppercase Alphabet");

        }
        else if (chu >= 'a' && chu <= 'z') {
            System.out.println("Lowercase Alphabet");
        }
    }
}
