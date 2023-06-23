package test3;
abstract class Shape{
	public abstract void draw();
}
class Triangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw Triangle");
	}
	
}

class Circle extends Triangle{
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw Circle");
	}
}
public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
		
		
	}
	public void draw(Shape obj) {
		obj.draw();
	}

}
