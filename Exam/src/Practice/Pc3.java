package Practice;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Color{
	public void color();
}
class Red implements Color{
	public void color(){
		System.out.println("red");
	}
}
public class Pc3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Red red = new Red();
		red.color();
		
		Color blue= new Color() {
			public void color() {
				System.out.println("blue");
			}
		};
		blue.color();
	
		Color green = () -> {System.out.println("green");};
		green.color();
		
		
		List<Integer> num1  = new ArrayList<>();
		List<Integer> num5 = Arrays.asList(1,2,3,3,5,6);
		num1.add(1);
		num1.add(2);
		
		num1.stream().filter(num2 -> num2 >= 2).forEach(num3 -> System.out.print(num3));
	}

}
