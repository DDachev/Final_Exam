package finalexam;

import java.util.ArrayList;
import java.util.List;

public class ZooShop {

	private List<Animal> animals = new ArrayList<>();
	
	public void addAnimal(Animal animal) {
		if(animal != null) {
			animals.add(animal);
		}
	}

	public List<Animal> getAnimals() {
		return animals;
	}
}
