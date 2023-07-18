package review;

public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("------------------1-----------------");
		String grade = "B";
		
		int score = switch(grade) {
		case "A" -> 100; 
		case "B" -> {int result = 100-20; yield result;}
		default -> 60;
		};
		System.out.println(score);
		System.out.println("------------------2-----------------");
		
		System.out.println("------------------3-----------------");
		System.out.println("------------------4-----------------");
		System.out.println("------------------5-----------------");
		System.out.println("------------------6-----------------");
		System.out.println("------------------7-----------------");
	}

}
