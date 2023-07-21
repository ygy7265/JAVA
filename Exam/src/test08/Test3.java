package test08;



class Member{
	private String name;
	private String hp;
	private int age;
	
	public Member(String name, String hp,int age) {
		this.name = name;
		this.hp = hp;
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name +","+ hp +","+ age;
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member("kimyousin", "010-1234-1001", 25);
		Member m2 = new Member("kimchunchu", "010-1234-1002", 23);
		
		System.out.println(m1);
		System.out.println(m2);
		
	}

}
