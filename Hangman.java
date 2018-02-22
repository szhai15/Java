import java.util.ArrayList;
import java.util.Scanner;


public class Hangman {

	public static void main(String[] args) {
		String[] words = {"terminator", "banana", "computer", "friday", "rain", "stream" };
		String word = words[(int) (Math.random() * words.length)];;
		int life = 7;
		guess(word, life);

	}

	public static void guess(String word, int life)
	{
		char[] filler = new char[word.length()];
		int i = 0;
		while(i < word.length())
		{
			filler[i] = '_';
			if(word.charAt(i) == ' ')
			{
				filler[i] = ' ';
			}
			i++;
		}
		System.out.println("Start!");
		System.out.println("Guess any letter in the word.");
		System.out.print(filler);
		System.out.println("    >>>>>Life remaining = " + life);
		hangmanImageInitial();
		
		Scanner input = new Scanner(System.in);  //to read characters
		
		ArrayList<Character> GuessedLetterList= new ArrayList<Character>();
		
		
		while(life > 0)
		{
			char x = input.next().charAt(0);  //character input by user
			
			if(GuessedLetterList.contains(x))
			{
				System.out.println("Already entered.");
				continue;  //while loop continues
			}
			
			GuessedLetterList.add(x);
			
			if(word.contains(x + ""))
			{
				for(int y = 0; y < word.length(); y++)  //this loop will check all indexes for the input character 
				{
					if(word.charAt(y) == x)  //and replace the underscore by the input character
					{
						filler[y] = x;
						
					}
				}
			}
			else
			{
				life--;  //life decreases by 1
			}
			
			if(word.equals(String.valueOf(filler)))  //checking if filler equals word
			{
				String a = String.valueOf(filler);
				System.out.println("You won the game!");
				System.out.println("The word was: " + a);
				break;
			}
			
			System.out.print(filler);
			System.out.println("    >>>>>Life remaining = " + life);
			hangmanImage(life, word);
		}
		
		
	}
	
	public static void hangmanImage(int life, String word)
	{
		if(life == 7)
		{
			
			System.out.println("---------");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("|       |");
			System.out.println("---------");	
		}
		
		if(life == 6)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 5)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 4)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| |  |  |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 3)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| | /|  |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 2)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| | /|\\ |");
			System.out.println("| |     |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 1)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| | /|\\ |");
			System.out.println("| | /   |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
		}
		
		if(life == 0)
		{
			System.out.println("---------");
			System.out.println("| ----  |");
			System.out.println("| |  |  |");
			System.out.println("| |  O  |");
			System.out.println("| | /|\\ |");
			System.out.println("| | / \\ |");
			System.out.println("| |     |");
			System.out.println("|---    |");
			System.out.println("---------");	
			System.out.println("GAME OVER! The word was: " + word);
		}
		
	}
	
	public static void hangmanImageInitial()
	{
		System.out.println("---------");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("|       |");
		System.out.println("---------");	
	}
	
}
