package Part5;

public class FirstClass {
	public FirstClass() {
		System.out.println("This is my First Outer Class");
	}
	public class FirstInnerClass {
		public FirstInnerClass(String info) {
			System.out.println(info);
		}
	}
}
