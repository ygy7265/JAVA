package Practice01;

public class member {
	private String name;
	private String hp;
	private int age;
	
	
	public member(String name,String hp,int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	public void ageUp(int age) {
		this.age += age;
	}
	public void ageDown(int age) {
		this.age -= age;
	}
	public void show() {
		System.out.println(this.name);
		System.out.println(this.hp);
		System.out.println(this.age);	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
