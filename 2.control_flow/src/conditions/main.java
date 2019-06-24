/**
 * 
 */
package conditions;

import java.util.Scanner;

/**
 * @author Giang Vu
 *
 */
public class main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter an age: ");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		
		if (age >= 0 && age <= 5)
		{
			System.out.println("Baby");
		}
		else if (age >= 6 && age <= 11)
		{
			System.out.println("Kid");
		}
		else if (age >= 12 && age <= 17)
		{
			System.out.println("Teen");
		}
		else if (age >= 8)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Invalid!");
		}
		System.out.println("Thank for using this program!");
	}
}
