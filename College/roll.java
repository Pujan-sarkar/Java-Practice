// Write a java programme which will add last 4 digits of the roll number and show the summation of it.

public class roll
{
    public static void main(String[] args)
    {
        int roll= 20221011;
        int sum = 0;
        int rem,reminder;
        rem = roll % 10000;
        while (rem != 0)
        {
            reminder = rem % 10;
            sum = sum + reminder;
            rem = rem / 10;
        }
        System.out.println("The sum of last 4 digit of roll " + sum);
    }
}
