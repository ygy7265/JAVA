package test7;
interface Tv{
	public abstract void turnOn();
	public abstract void turnOff();
}
public class Test09 {
	public static void main(String[] args) {
		Tv tv = new Tv() {

			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("TV ON");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("TV OFF");
			}
			
		};
		tv.turnOn();
		tv.turnOff();
	}
}
