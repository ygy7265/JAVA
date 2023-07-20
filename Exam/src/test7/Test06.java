package test7;
class _Person{
	private String name;
	private int age;
	
	public _Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void Hello() {
		System.out.println("---------------");
		System.out.println("name = " + name);
		System.out.println("age = " + age);
	}
}
class _Student extends _Person{

	private String school;
	private String major;
	
	
	public _Student(String name,int age,String school,String major) {
		super(name,age);
		this.school = school;
		this.major = major;
		
	}
	public void Hello() {
		super.Hello();
		
		System.out.println("major = " + major);
	}
}
class _SalaryStudent extends _Student {
	private String company;
	public _SalaryStudent(String name,int age,String school,String major,String company) {
		super(name,age,school,major);
		this.company = company;
	}
	public void Hello() {
		super.Hello();
		System.out.println("company = " + company);
	}
}
public class Test06 {
	public static void main(String[] args) {
		_Person kim  = new _Person("kimyousin", 24);
		_Student jang = new _Student("jangbogo", 26, "bogyeong", "engilsh");
		_SalaryStudent lee = new _SalaryStudent("leesunsin", 27,"busan", "Economy", "samsung");
		
		kim.Hello();
		jang.Hello();
		lee.Hello();
	}
}
