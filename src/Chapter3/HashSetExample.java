package Chapter3;

import java.util.*;

public class HashSetExample {

	public static void main(String args[]){
		Set<Integer> set = new HashSet<>();
		System.out.println(set.add(55));
		System.out.println(set.add(45));
		System.out.println(set.add(45));
		for(Integer i:set)
			System.out.println(i);
	}
}
