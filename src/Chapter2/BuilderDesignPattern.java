package Chapter2;

import java.util.Arrays;
import java.util.List;

class AnimalBuilder{
	private String species;
	private int age;
	private List<String> favoriteFoods;
	
	public AnimalBuilder setSpecies(String species){
		this.species=species;
		return this;
	}
	
	public AnimalBuilder setAge(int age){
		this.age=age;
		return this;
	}
	
	public AnimalBuilder setFavoriteFoods(List<String> ff){
		this.favoriteFoods=ff;
		return this;
	}
	
	public Animal build(){
		return new Animal(species,age,favoriteFoods);
	}

}

public class BuilderDesignPattern {

	public static void main(String args[]){
		Animal animal = new AnimalBuilder().setAge(10).setSpecies("Hay").setFavoriteFoods(Arrays.asList("hay","Fish")).build();
		System.out.println(animal);
	}
}
