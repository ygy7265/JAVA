package sub02;

public class CountThread  extends Thread{
	private Count count;
	
	public CountThread(Count count) {
		this.count = count;	
	}
	public void run() {
		for(int i=0; i<=100; i++) {
			count.setNum();
		}
	}
}
