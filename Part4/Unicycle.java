package Part4;

public class Unicycle implements Cycle {
	public Unicycle() {
		System.out.println("Cycle is created and it's details are:");
	}
	@Override
	public void cost(int cost) {
		System.out.println("It costs Rs. " + cost);
	}

	@Override
	public void wheelsCount() {
		System.out.println("It has one wheel");
	}
	
}
