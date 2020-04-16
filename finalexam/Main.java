package finalexam;

public class Main {

	public static void main(String[] args) {
		ZooShop shop = new ZooShop();
		
		shop.addAnimal(new Cat("Siamese", 1, true, 2, ColorOfFur.BROWN));
		shop.addAnimal(new Dog("Bulldog", 1, 50, ColorOfFur.BLACK));
		shop.addAnimal(new Fish("Discus", 1, "BloodWorm", true, 1));
		
		shop.addAnimal(new Cat("Bengali", 2, true, 8, ColorOfFur.WHITE));
		shop.addAnimal(new Dog("Rothwailer", 2, 45, ColorOfFur.BROWN));
		shop.addAnimal(new Fish("Betha", 2, "Arthemia", false, 1));
		
		shop.addAnimal(new Cat("Ragdohl", 3, true, 3, ColorOfFur.WHITE));
		shop.addAnimal(new Dog("Sheppard", 3, 35, ColorOfFur.ORANGE));
		shop.addAnimal(new Fish("Heler", 1, "Daphnia", true, 1));
		
		for(Animal a : shop.getAnimals()) {
			if(getCatWithWeightLessFiveKilo(a) != null) {
				System.out.println(getCatWithWeightLessFiveKilo(a).toString());
			}
		}
	}
	
	private static Animal getCatWithWeightLessFiveKilo(Animal animal) {
		if(animal instanceof Cat) { 
			if(animal.getWeight() < 5) {
				return animal;
			}
		}
		return null;
	}
}
