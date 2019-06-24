package challenge;

public class dog {
	String name;
	String species;
	double height;
	boolean isMale;
	
	public dog(String nameInput, String speciesInput, double heightInput, boolean isMaleInput) {
		this.name = nameInput;
		this.species = speciesInput;
		this.height = heightInput;
		this.isMale = isMaleInput;
	}
	
	public void growUp(double moreHeight) {
		this.height += moreHeight;
	}
	
	public String changeName(String newName) {
		this.name = newName;
		return this.name;
	}
	
	public String barkSound(String barkInput) {
		return barkInput;
	}
}
