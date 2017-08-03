package Chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Duck implements Comparable<Duck>{

	private String name;
	
	public Duck(String name){
		this.name=name;
	}
	
	public String toString(){
		return name;
	}
	
	@Override
	public int compareTo(Duck o) {
		return name.compareTo(o.name);
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Duck> ducks = new ArrayList<>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);
		System.out.println(ducks);
	}

}
