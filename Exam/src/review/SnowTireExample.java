package review;
class Tire{
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("nomal Tire");
	}
}

class SnowTire extends Tire{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("snowTire run...");
	}
}

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowtire = new SnowTire();
		Tire tire = snowtire;
		
		snowtire.run();
		tire.run();
	}

}
