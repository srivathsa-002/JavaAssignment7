package Assignment7;

public class Part3 {
	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.baseClassMethod();
		derived.classMethod1(derived);
		derived.classMethod2(derived);
		derived.classMethod3(derived);
		derived.classMethod4(derived);
	}
}