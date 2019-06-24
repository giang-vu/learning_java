/**
 * 
 */
package functions;

import java.awt.Color;

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
		System.out.println("Hello World");
		System.out.println("Giang Vu");
		
		car giangCar = new car(25.5, "1B2C3D", Color.blue, true);
		car mikhailaCar = new car(13.9, "3D2OBN", Color.black, false);
		
		System.out.println("Giang's car license plate is: " + giangCar.licensePlate);
		System.out.println("Mikhaila's car license plate is: " + mikhailaCar.licensePlate);
		
		System.out.println("Giang's car paint color is: " + giangCar.paintColor);
		
		giangCar.changePaintColor(Color.red);
		
		System.out.println("Giang's car paint color now is: " + giangCar.paintColor);
		
		double giangCarSpeed = 50;
		giangCar.speedingUp1(giangCarSpeed);
		System.out.println(giangCarSpeed);
		
		giangCarSpeed = giangCar.speedingUp2(giangCarSpeed);
		System.out.println(giangCarSpeed);
	}
}
