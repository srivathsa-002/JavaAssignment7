package Assignment7;

public class MainDemo {
	public static void main(String[] args) {
		Rodent mouse = new Mouse();
		mouse.setNative("WorldWide");
		Rodent gerbil = new Gerbil();
		gerbil.setNative("Africa");
		Rodent hamster = new Hamster();
		hamster.setNative("Europe");
		Rodent[] rodent = new Rodent[3];
		rodent[0] = mouse;
		rodent[1] = gerbil;
		rodent[2] = hamster;
		
		for(int i=0;i<rodent.length;i++) {
			System.out.println("I belong to " + rodent[i].getClass() + "..... And my details are:");
			rodent[i].tailType();
			System.out.println("My Native Place: " + rodent[i].getNative());
		}
	}
}