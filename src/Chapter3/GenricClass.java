package Chapter3;

//Type1
class Crate<T>{
	private T contents;
	public T emptyCrate(){
		return contents;
	}
	public void packCrate(T contents){
		this.contents=contents;
	}
	
	public static <T> Crate<T> ship(T t){
		return new Crate<T>();
	}
}

//Type2
class SizeLimitedCrate<T,U>{
	private T contents;
	private U sizeLimit;
	public SizeLimitedCrate(T contents,U sizeLimit){
		this.contents=contents;
		this.sizeLimit=sizeLimit;
	}
	public T getContents() {
		return contents;
	}
	public void setContents(T contents) {
		this.contents = contents;
	}
	public U getSizeLimit() {
		return sizeLimit;
	}
	public void setSizeLimit(U sizeLimit) {
		this.sizeLimit = sizeLimit;
	}
}

class Elephant{}
class Tiger{}

public class GenricClass {
	public static void main(String args[]){
		Elephant e = new Elephant();
		Crate<Elephant> createForElephant = new Crate<>();
		createForElephant.packCrate(e);
		System.out.println(createForElephant.emptyCrate());
		Integer pounds=10_000;
		SizeLimitedCrate<Elephant,Integer> slc = new SizeLimitedCrate<>(e,pounds);
		System.out.println(slc);
	}
	
}
