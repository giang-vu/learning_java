/**
 * 
 */
package interfaces;

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
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		if (cat instanceof Pet)
		{
			cat.play();
		}
		
		if (dog instanceof Pet)
		{
			dog.play();
		}
		
		Pet pet;
		Random random = new Random();
		int n = random.nextInt(2);
		
		if (n == 0)
		{
			pet = new Dog();
		}
		else
		{
			pet = new Cat();
		}
		
		pet.play();
	}

}
