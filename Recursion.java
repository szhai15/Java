package week_7;

public class Recursion {
	
	public static int factorial(int n)
	{
		if (n <= 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
	
	public static long fibonacci(long a)
	{
		if ((a == 0 || (a == 1)))
			return a;
		else
			return fibonacci(a - 1) + fibonacci(a - 2);
	}
	
	public static int sumDigits(int b, int sum)
	{
		if(b == 0)
			return sum;
		else
		{
			sum = sum + b % 10;
			b = b / 10;
			return sumDigits(b/10, sum);
		}
	}

	public static void main(String[] args) {
		System.out.println("The factorial of 5 is " + factorial(5) + "\n");
		
		for (int i = 0; i <= 7; i++)
		{
			System.out.printf("F%d = %d \n", i, fibonacci(i));
		}
		
		System.out.println("\nThe sum of digits of 2435313 is " + sumDigits(2435313, 0));
	}

}
