package sub01;
//<T>Generic 
public class FruitBox<T> {
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}
}
