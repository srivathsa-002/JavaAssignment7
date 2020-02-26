package Assignment7;

public class Derived extends Base implements IAll {

	@Override
	public void method1() {
		System.out.println("This is method 1");
	}

	@Override
	public void method2() {
		System.out.println("This is method 2");
	}

	@Override
	public void method3() {
		System.out.println("This is method 3");
	}

	@Override
	public void method4() {
		System.out.println("This is method 4");
	}

	@Override
	public void method5() {
		System.out.println("This is method 5");
	}

	@Override
	public void method6() {
		System.out.println("This is method 6");
	}

	@Override
	public void method7() {
		System.out.println("This is method 7");
	}
	
	public void classMethod1(I1 interface1) {
		System.out.println("This is method 1 in Derived Class");
		interface1.method1();
		interface1.method2();
	}
	
	public void classMethod2(I2 interface2) {
		System.out.println("This is method 2 in Derived Class");
		interface2.method3();
		interface2.method4();
	}
	
	public void classMethod3(I3 interface3) {
		System.out.println("This is method 3 in Derived Class");
		interface3.method5();
		interface3.method6();
	}
	
	public void classMethod4(IAll interfaceAll) {
		System.out.println("This is method 4 in Derived Class");
		interfaceAll.method1();
		interfaceAll.method2();
		interfaceAll.method3();
		interfaceAll.method4();
		interfaceAll.method5();
		interfaceAll.method6();
		interfaceAll.method7();
	}
}