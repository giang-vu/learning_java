/**
 * 
 */
package strings;

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
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String userInput = sc.next();
		String uppercased = userInput.toUpperCase();
		System.out.println(userInput);
		System.out.println(uppercased);
		
		char firstCharacter = userInput.charAt(0);
		System.out.println(firstCharacter);
		
		System.out.println("Contain: " + userInput.contains("enter"));
		System.out.println("Contain: " + userInput.contains("Enter"));
		System.out.println("Contain: " + userInput.contains("Enter".toLowerCase()));
	}
}
