package Chapter2;

abstract class Food{
	private int quantity;
	public Food(int qty){
		this.quantity=qty;
	}
	public int getQuantity() {
		return quantity;
	}
	public abstract void consumed();
}

class Hay extends Food{
	public Hay(int qty){
		super(qty);
	}

	@Override
	public void consumed() {
		System.out.println("hay eaten:"+getQuantity());
	}
}

class pallets extends Food{

	public pallets(int qty) {
		super(qty);
	}

	@Override
	public void consumed() {
		System.out.println("pallets eaten:"+getQuantity());
	}
	
}

class Fish extends Food{

	public Fish(int qty) {
		super(qty);
	}
	
	public void consumed() {
		System.out.println("Fish eaten: "+getQuantity());
	}
}

//Factory Class
class FoodFactory{
	public static Food getFood(String animalName){
		switch(animalName){
			case "zebra":
				return new Hay(100);
			case "rabbit":
				return new pallets(5);
			case "polar bear":
				return new Fish(10);
			default:
				return null;
		}
	}
}

public class FactoryPattern {
	public static void main(String args[]){
		final Food food = FoodFactory.getFood("polar bear");
		food.consumed();
	}
}
