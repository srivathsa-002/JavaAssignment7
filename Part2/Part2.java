package Assignment7;

public class Part2 {
	public static void main(String[] args) {
		Unicycle uni = new Unicycle();
		Bicycle bi = new Bicycle();
		Tricycle tri = new Tricycle();
		
		Cycle[] cycle = new Cycle[3];
		cycle[0] = (Cycle) uni;
		cycle[1] = (Cycle) bi;
		cycle[2] = (Cycle) tri;
		
		for(int i=0;i<cycle.length;i++)
			System.out.println(cycle[i].getWheelsCount());
		/*for(int i=0;i<cycle.length;i++)
			cycle[i].balance();*/
		/*
		 * The above piece of code results in an error because the class Cycle doesn't contain the method balance().
		 */
		
		/*
		 * Now I'll try downcasting and observe the results
		 */
		
		Cycle cycle1 = new Unicycle();
		Cycle cycle2 = new Bicycle();
		Cycle cycle3 = new Tricycle();
		
		Unicycle uni1 = (Unicycle) cycle1;
		Bicycle bi1 = (Bicycle) cycle2;
		Tricycle tri1 = (Tricycle) cycle3;
		System.out.println("After Downcasting.......... ");
		System.out.println("Unicycle class......");
		System.out.println(uni1.getWheelsCount());
		uni1.balance();
		System.out.println("Bicycle class......");
		System.out.println(bi1.getWheelsCount());
		bi1.balance();
		System.out.println("Tricycle class......");
		System.out.println(tri1.getWheelsCount());
		//tri1.balance();
		
		/*
		 * While downcasting since the balance() method exists in both Unicycle and Bicycle classes, those results get printed.
		 * Calling balance() method using Tricycle object results in error because the class Tricycle doesn't contain the method balance().
		 */
		
	}
}