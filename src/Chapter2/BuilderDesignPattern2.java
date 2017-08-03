package Chapter2;

class Toy{
	
	private int weight;
	private int height;
	private String shape;
	
	public Toy(int weight, int height, String shape) {
		super();
		this.weight = weight;
		this.height = height;
		this.shape = shape;
	}
	
	public static class ToyBuilder{
		
		private int weight;
		private int height;
		private String shape;
		
		public ToyBuilder setWeight(int weight){
			this.weight=weight;
			return this;
		}
		
		public ToyBuilder setHeight(int height){
			this.height=height;
			return this;
		}
		
		public ToyBuilder setShape(String shape){
			this.shape=shape;
			return this;
		}
		
		public Toy build(){
			return new Toy(weight,height,shape);
		}
		
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

}

public class BuilderDesignPattern2 {
	public static void main(String args[]){
		final Toy.ToyBuilder tb = new Toy.ToyBuilder().setHeight(10).setShape("Rect").setWeight(20);
		Toy toy = tb.build();
		System.out.println(toy.getHeight());
		System.out.println(toy.getWeight());
		System.out.println(toy.getShape());
	}
}
