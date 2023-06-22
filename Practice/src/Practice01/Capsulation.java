package Practice01;

public class Capsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		member mb = new member("°­°¨Âù","010-8870-7265",20);
		mb.setAge(30);
		mb.getAge();
		
		
		mb.ageUp(10);
		System.out.println(mb.getAge());
		mb.show();
	}

}
