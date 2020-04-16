package finalexam;

public class Dog extends Animal{

	private ColorOfFur colorOfFur;

	public Dog(String breed, int id, int weight, ColorOfFur colorOfFur) {
		super(breed, id, weight);
		this.colorOfFur = colorOfFur;
	}

	@Override
	public boolean checkWeight(int weight) {
		if (weight > 100) {
			return false;
		}
		return true;
	}

	public ColorOfFur getColorOfFur() {
		return colorOfFur;
	}
}
