package Part5;

public class MainDemo {
	public static void main(String[] args) {
		SecondClass second = new SecondClass();
		SecondClass.SecondInnerClass innerSecond = second.new SecondInnerClass();
	}
}

/*
 * I first created an outer class.
 * Then I created an inner class in the first outer class which has a parameterised constructor.
 * Next, I created a second outer class.
 * Then i created an inner class in the second outer class which inherits the first outer class's inner class.
 * In the second inner class's constructor I called the super class constructor by passing a message.
 * The print statements demonstrate how and in which order each class is constructed.
 */