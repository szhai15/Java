import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = (int)(Math.random()*100+1); // create a random number in range[1, 100]
		int a;
		int count = 0;
		do
		{
			System.out.println("Please enter the number you guess in range[1,100]:");
			a = in.nextInt();
			count += 1;
			if (a > number)
			{
				System.out.println("Too big.");
			}
			else if (a < number)
			{
				System.out.println("Too small.");
			}
		} while (a != number);
		System.out.println("Congratulations! You are right. You have tried "+count+" times.");

	}

}
