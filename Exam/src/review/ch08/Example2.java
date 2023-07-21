package review.ch08;
interface A1{
	public void method1();
}
class B1 implements A1{
	public void method1() {
		System.out.println("B-method1");
	}
}
class C1 implements A1{
	public void method1() {
		System.out.println("C - method1()");
	}
	public void method2() {
		System.out.println("C - method2()");
	}
}
public class Example2 {
	public static void action(A1 a) {
		a.method1();
		if(a instanceof C1 c) {
			c.method2();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		action(new B1());
		action(new C1());
	}

}
