package Practice;


interface Zoo{
	public void tiger();
}
class Zoom implements Zoo{
	private String name;
	private int age;
	
	public Zoom(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void tiger() {
		System.out.println(this.name +","+ this.age);
	}

}
public class Pc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Zoom z1 = new Zoom("tiger",30);
		z1.tiger();
		
		Zoo z2 = new Zoo() {public void tiger() {
				System.out.println("gum");
			}
		};
		z2.tiger();
		
		Zoo z3 = () -> {System.out.println("dak");};
		z3.tiger();
	}

}
