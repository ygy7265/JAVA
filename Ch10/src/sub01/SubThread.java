package sub01;

public class SubThread extends Thread{
	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	public synchronized void run() {
		
		
		System.out.println(name+"end");
	}

	
}
