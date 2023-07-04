package sub04;

public class SubThread extends Thread{
	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("SubThread start");
		}
			
		
	}
}
