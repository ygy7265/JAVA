package test7;
class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected void Hello() {
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
}

class Student extends Person{
	
	private int studentId;
	
	public Student(String name, int age,int studentId) {
		super(name, age);
		this.studentId = studentId;
		// TODO Auto-generated constructor stub
	}
	protected void Hello() {
		super.Hello();
		System.out.println("학번 = " + studentId);
	}
}

class Worker extends Person{
	private int workerId;
	public Worker(String name, int age,int workerId) {
		super(name, age);
		this.workerId = workerId;
		// TODO Auto-generated constructor stub
	}
	
	public void Hello() {
		super.Hello();
		System.out.println("사번 = " + workerId);
	}

	
}
public class Test04 {
	public static void main(String[] args) {
		Student kim = new Student("kimyousin", 21, 20201234);
		Worker lee = new Worker("leesunsin", 35, 20211201);
		
		kim.Hello();
		lee.Hello();
	}
}
