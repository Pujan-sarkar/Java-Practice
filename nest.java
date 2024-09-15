import java.util.Scanner;

public class nest
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int a = sc.nextInt();
		if (a > 0)
		{
			if (a % 2 == 0)
			{
				System.out.println("Your number is positive and even");
			}else
			{
				System.out.println("Your number is positive and odd");	
			}
		 }else{
			System.out.println("your number is Negative");
		      }
		
		}
		
	}
