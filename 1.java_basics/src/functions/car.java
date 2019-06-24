package functions;

import java.awt.*;

public class car {
	double averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTailLightsWorking;
	
	public car(double inputAverageMilesPerGallon,
			String inputLicensePlate,
			Color inputPaintColor,
			boolean inputAreTailLightsWorking) {
		this.averageMilesPerGallon = inputAverageMilesPerGallon;
		this.licensePlate = inputLicensePlate;
		this.paintColor = inputPaintColor;
		this.areTailLightsWorking = inputAreTailLightsWorking;
	}	
	public void changePaintColor(Color newPaintColor) {
		this.paintColor = newPaintColor;
	}
	
	public void speedingUp1(double currentSpeed) {
		currentSpeed += 100;
	}
	
	public double speedingUp2(double currentSpeed) {
		currentSpeed += 100;
		return currentSpeed;
	}
}
