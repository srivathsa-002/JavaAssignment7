package Part5;

public class SecondClass {
	public SecondClass() {
		System.out.println("This is my Second Outer Class");
	}
	public class SecondInnerClass extends FirstClass.FirstInnerClass {
		public SecondInnerClass() {
			new FirstClass().super("This is my First Inner Class");
			System.out.println("This is my Second Inner Class!!");
		}
		
	}
}