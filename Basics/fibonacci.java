import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        int c = 2;

        while (c <= n) {
            System.out.print(a + " ");
            int tmp = b;
            b = b+a;
            a = tmp;
            c++;
        }
        System.out.println(b);

    }
}
