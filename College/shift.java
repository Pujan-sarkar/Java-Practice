public class shift
{
	public static void main (String []args)
	{
		int number = 10;
		System.out.println("original number is: " + number);
		int left = number << 1;
		System.out.println("after left shift number is: " + left);
		int right = number >> 1;
		System.out.println("After right shift number is: " + right);
	}
}