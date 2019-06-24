/**
 * 
 */
package lambda;

import java.awt.*;
import java.lang.Math;
import java.util.Random;

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
		Answerable phone = () -> {return "Hello";};
		System.out.println(phone.answer());
		
		Predicate isOdd = n -> n % 2 != 0;
		Predicate isEven = n -> n % 2 == 0;
		System.out.println(isOdd.test(2));
		System.out.println(isEven.test(2));
	}

}
