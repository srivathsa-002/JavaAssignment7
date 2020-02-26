package Part4;

public class TricycleFactory {
	public void buildTricycle() {
		Tricycle cycle1 = new Tricycle();
		cycle1.cost(900);
		cycle1.wheelsCount();
		
		Tricycle cycle2 = new Tricycle();
		cycle2.cost(1000);
		cycle2.wheelsCount();
	}
}