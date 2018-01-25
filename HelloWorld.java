import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		print a string
		System.out.println("Hello world!");
		
		
//		read some input 
		System.out.println("Say something:");
		Scanner in = new Scanner(System.in);
//		the input will be returned by .nextline()
		System.out.println("echo:" + in.nextLine());
		
//		some practice with math operations
		System.out.println("2+3="+2+3);  //+2+3 doesn't work
		System.out.println("2+3="+(2+3));  //+(2+3) works
		System.out.println(2+3+"=2+3="+(2+3));  //put 2+3 in the front works
		
		
//		a simple change system to practice math operation and if statement
		int price = 0;
		int amount = 0;
		System.out.println("Enter the amount of money you gave:");
		amount = in.nextInt();
		System.out.println("Enter the price of a ticket:");
		price = in.nextInt();
		if (amount > price) {
			System.out.println("Your change is: $"+(amount-price));
		}
		else {
			System.out.println("Your money is not enough for this ticket.");
		}
		
		
//		practice switch statement 
		int days = 0;
		System.out.print("Enter the month number: ");
		int month = in.nextInt();
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days = 31;
			break;
		case 4: case 6: case 9: case 11:
			days = 30;
			break;
		case 2:
			System.out.println("Please enter which year is it: ");
			int year = in.nextInt();
			if (((year % 4 == 0)&(year % 100 != 0))|(year/400 == 0)) {
				days = 29;
			}
			else {
				days = 28;
			}
			break;
		default:
			System.out.println("Invalid month.");
			break;
		}
		System.out.println("The number of days = " + days);
		
		
		
	}

}
