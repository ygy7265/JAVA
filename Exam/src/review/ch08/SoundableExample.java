package review.ch08;

interface Soundable{
	public String sound();
}

class Cat implements Soundable{

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "야옹";
	}
	
}
class Dog implements Soundable{
	
	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
}
public class SoundableExample {
	public static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSound(new Cat());
		printSound(new Dog());
	}

}
