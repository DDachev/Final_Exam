package finalexam;

public class Cat extends Animal {

	private boolean hasFur;
	private ColorOfFur colorOfFur;

	public Cat(String breed, int id, boolean hasFur, int weight, ColorOfFur colorOfFur) {
		super(breed, id, weight);
		this.hasFur = hasFur;
		this.colorOfFur = colorOfFur;
	}

	@Override
	public boolean checkWeight(int weight) {
		if (weight > 20) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		String output = String.format("Cat's ID is: %s%nBreed of Cat is: %s%nWeight is: %d kilos%nColor is: %s%n",
				super.getId(), super.getBreed(), super.getWeight(), this.colorOfFur);
		return output;
	}

	public boolean isHasFur() {
		return hasFur;
	}

	public void setHasFur(boolean hasFur) {
		this.hasFur = hasFur;
	}

	public ColorOfFur getColorOfFur() {
		return colorOfFur;
	}

	public void setColorOfFur(ColorOfFur colorOfFur) {
		this.colorOfFur = colorOfFur;
	}


}
