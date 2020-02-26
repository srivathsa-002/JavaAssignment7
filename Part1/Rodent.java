package Assignment7;

public abstract class Rodent {
	private String nativePlace;
	public abstract void tailType();
	public void setNative(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	public String getNative() {
		return this.nativePlace;
	}
}