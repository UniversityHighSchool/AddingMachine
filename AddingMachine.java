import java.util.Scanner;

public class AddingMachine {

	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What number should I count up to?");
		int answer = kb.nextInt();
		
		int counter = 0;
		int total = 0;
		
		do
		{
			total += counter++;
			
		} while( counter <= answer );
		
		System.out.println("The total was: " + total);
	}
}
