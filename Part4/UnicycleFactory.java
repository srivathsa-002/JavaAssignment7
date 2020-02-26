package Part4;

public class UnicycleFactory {
	public void buildUnicycle() {
		Unicycle cycle1 = new Unicycle();
		cycle1.cost(1500);
		cycle1.wheelsCount();
		
		Unicycle cycle2 = new Unicycle();
		cycle2.cost(1300);
		cycle2.wheelsCount();
	}
}