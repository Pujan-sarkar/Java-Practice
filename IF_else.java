// wap in java to show if-else selection structure.
import java.util.Scanner;

public class IF_else 
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		if (a % 2 == 0)
		{
			System.out.println("Your number is even");
		}else
		{
			System.out.println("Your number is odd");	
		}
		
	}
}
