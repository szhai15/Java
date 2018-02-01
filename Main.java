import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
//		initialization
		Scanner in = new Scanner(System.in);
		int balance = 0;
		
		while(true)
		{
//			read cash amount
			System.out.print("Please insert cash:");
			int amount = in.nextInt();
			balance = balance + amount;
			if (balance >= 10)
			{
//				print ticket
				System.out.println("-------------------"+
									"\n"+"| Special Railway |"+
									"\n"+"|Ticket Price: $10|"+
									"\n"+"-------------------");
//				calculate change
				System.out.println("Your change is:"+(balance-10)+"\n");
				balance = 0;
				
			}
		}
	}
}
