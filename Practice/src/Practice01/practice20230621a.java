package Practice01;

class Parent{
	String name;
	String color;
	int num1;
	int num2;
//	public Parent(String name,String color,int num1,int num2) {
//		this.name = name;
//		this.color = color;
//		this.num1 = num1;
//		this.num2 = num2;
//	}
	public void speedUp(int num1) {
		this.num1 += num1;
	}

	private String getname() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
public class practice20230621a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent pr = new Parent();
		pr.name = "name";
		pr.color = "color";
		pr.num1 = 1;
		pr.num2 = 2;
		
	}

}
