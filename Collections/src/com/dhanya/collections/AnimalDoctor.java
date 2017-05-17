package com.dhanya.collections;

public class AnimalDoctor {

	
	public static void main(String[] args) {
		Dog1[] dogs = {new Dog1(),new Dog1()};
		Cat[] cats = { new Cat(), new Cat()};
		Bird[] birds = { new Bird(), new Bird() };
		
		AnimalDoctor doc = new AnimalDoctor();
		doc.checkAnimals(dogs);
		doc.checkAnimals(cats);
		doc.checkAnimals(birds);
	}

	public void checkAnimals(Animal[] animals) {
		for(Animal a : animals){
			a.checkup();
		}
		
		
	}

}
