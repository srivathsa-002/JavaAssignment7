package Part4;

public class Part4 {
	public static void main(String[] args) {
		System.out.println("Unicycle Factory......");
		UnicycleFactory uniFactory = new UnicycleFactory();
		uniFactory.buildUnicycle();
		System.out.println("Bicycle Factory......");
		BicycleFactory biFactory = new BicycleFactory();
		biFactory.buildBicycle();
		System.out.println("Tricycle Factory......");
		TricycleFactory triFactory = new TricycleFactory();
		triFactory.buildTricycle();
	}
}
