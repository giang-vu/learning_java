/**
 * 
 */
package challenge;

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
		dog d = new dog("Jack", "Alaska", 0.9, false);
		
		String bark = d.barkSound("Bark!");
		System.out.println("Dog barks: " + bark);
		
		d.growUp(0.5);
		System.out.println("Dog's height now is: " + d.height);
		
		System.out.println("Previously, dog's name was: " + d.name + ", but now it is changed to: " + d.changeName("Shew"));
	}
}
