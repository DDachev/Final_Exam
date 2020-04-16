package finalexam;

public class Fish extends Animal {

	private String typeOfFood;
	private boolean isItNeedAirPump;

	public Fish(String breed, int id, String typeOfFood, boolean isItNeedAirPump, int weight) {
		super(breed, id, weight);
		this.typeOfFood = typeOfFood;
		this.isItNeedAirPump = isItNeedAirPump;
	}

	@Override
	public boolean checkWeight(int weight) {
		if (weight > 10) {
			return false;
		}
		return true;
	}

	public String getTypeOfFood() {
		return typeOfFood;
	}

	public boolean isItNeedAirPump() {
		return isItNeedAirPump;
	}
}
