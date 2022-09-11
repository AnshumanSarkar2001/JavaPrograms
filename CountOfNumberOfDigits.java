import java.util.*;

/**
 * 
 * @author AnshumanSarkar2001 Count of digits using two methods:
 *  -without using recursion 
 *  -using recursion 
 *  -using number as a string
 */

public class CountOfNumberOfDigits {
	private static void CountOfDigitWithoutUsingRecurrsion(int number) {
		int countusingfor = 0;
		int countusingwhile = 0;
		int countusingdowhile = 0;
		int m = number;
		// using for loop:
		for (; number > 0; number /= 10)
			countusingfor += 1;
		System.out.println("Counting Using for loop: " + countusingfor);// Counting Using for loop: 5
		// using while:
		number = m;
		while (number > 0) {
			countusingwhile += 1;
			number /= 10;
		}
		System.out.println("Counting Using while loop: " + countusingwhile);// Counting Using while loop: 5
		// using do while:
		number = m;
		do {
			countusingdowhile += 1;
			number /= 10;
		} while (number > 0);
		System.out.println("Counting Using do while loop: " + countusingdowhile);// Counting Using do while loop: 5
	}

	private static int CountOfDigitUsingRecursion(int number) {
		if (number == 0)
			return 0;
		return CountOfDigitUsingRecursion(number / 10) + 1;
	}

	private static void CountOfDigitUsingString(int number) {
		String string = Integer.toString(number);
		System.out.println("Counting Using string: " + string.length());// Counting Using string: 5
	}

	public static void main(String[] args) // main function and important function as this handles
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();// Example 12345
		number = Math.abs(number);
		System.out.println("Counting Using recursion: " + CountOfDigitUsingRecursion(number));// Counting Using recursion: 5
		CountOfDigitWithoutUsingRecurrsion(number);
		CountOfDigitUsingString(number);
		scanner.close();
	}
}
