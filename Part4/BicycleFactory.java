package Part4;

public class BicycleFactory {
	public void buildBicycle() {
		Bicycle cycle1 = new Bicycle();
		cycle1.cost(2500);
		cycle1.wheelsCount();
		
		Bicycle cycle2 = new Bicycle();
		cycle2.cost(3000);
		cycle2.wheelsCount();
	}
}
