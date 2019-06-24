/**
 * 
 */
package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
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
		int[] numbers1 = new int[5];
		numbers1[0] = 31;
		numbers1[1] = 45;
		numbers1[2] = 22;
		numbers1[3] = 98;
		numbers1[4] = 10;
		
		int[] numbers2 = {31, 45, 22, 98, 10};
		
		String[] myFavoriteCandyBars= {"Twix", "Hershey's", "Crunch"};
		System.out.println("Index 1: " + myFavoriteCandyBars[1]);
		myFavoriteCandyBars[2] = "Butterfinger";
		System.out.println("Index 2: " + myFavoriteCandyBars[2]);
		System.out.println("Length: " + myFavoriteCandyBars.length);
		
		System.out.println(Array.get(myFavoriteCandyBars, 2));
		
		Arrays.sort(numbers1);
		System.out.println(numbers1);
		System.out.println(Arrays.toString(numbers1));
	}
}
