/**
 * 
 */
package challenge;

import java.util.Scanner;
import java.util.Random;

/**
 * @author Giang Vu
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static int rollDice()
	{
		Random rand = new Random();
		// Obtain a number between [0 - 5]
		int dice = rand.nextInt(6);
		// Add 1 to the result to get a number from the required range ([1 - 50])
		dice += 1;
		return dice;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create a dice roll program, where the user will be able to roll a dice, and the program will output the value of that die.
		//INPUT: User must input something in the console to role the dice
		//OUTPUT: The program prints out the outcome of 2 random rolls
		Scanner sc = new Scanner(System.in);
		String input;
		String roll = new String("ROLL");
		System.out.print("Roll the dice by enter 'ROLL': ");
		input = sc.nextLine();
		if (input.equals(roll))
		{
			System.out.printf("1st dice: %d\n", rollDice());
			System.out.printf("2nd dice: %d\n", rollDice());
		}
		else
		{
			System.out.println("Error in input!");
		}
	}

}
