package review;

class Parent2 {
	public String nation;
	
	public Parent2() {
		this("korea");
		System.out.println("Parent() call");
	}
	
	public Parent2(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

class Child2 extends Parent2{
	public String name;
	
	public Child2() {
		this("hong");
		System.out.println("Child() call");
	}
	
	public Child2(String name) {
		this.name = name;
		System.out.println("Child(String name ) call");
		
	}
}

public class ChildExample{
	public static void main(String[] args) {
			Child2 child2 = new Child2();
	}
}
