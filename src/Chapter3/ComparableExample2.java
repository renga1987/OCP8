package Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Animal implements Comparable<Animal>{

	private int id;
	
	public Animal(int id) {
		super();
		this.id = id;
	}

	@Override
	public int compareTo(Animal o) {
		//return id - o.id; //ascending 
		return o.id - id; // descending
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}

public class ComparableExample2 {
	public static void main(String[] args) {		
		Animal a1 = new Animal(15);
		Animal a2 = new Animal(7);
		Animal a3 = new Animal(1);
		List<Animal> lstAnimal = new ArrayList<>();
		lstAnimal.add(a1);
		lstAnimal.add(a2);
		lstAnimal.add(a3);
		Collections.sort(lstAnimal);
		for(Animal animal : lstAnimal){
			System.out.println(animal.getId());
		}
		//System.out.println(a1.compareTo(a2));
		
	}

}


