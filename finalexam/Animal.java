package finalexam;

public abstract class Animal {

	private String breed;
	private int id;
	private int weight;

	public Animal(String breed, int id, int weight) {
		super();
		this.breed = breed;
		this.id = id;
		if (checkWeight(weight)) {
			this.weight = weight;
		}
	}

	public abstract boolean checkWeight(int weight);

	public int getWeight() {
		return weight;
	}

	public String getBreed() {
		return breed;
	}

	public int getId() {
		return id;
	}
}
