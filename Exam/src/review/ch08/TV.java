package review.ch08;
interface Remocon{
	public void powerOn();
}
public class TV implements Remocon{
	
	public void powerOn() {
		System.out.println("TV On...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Remocon r= new TV();
		r.powerOn();
	}

}
