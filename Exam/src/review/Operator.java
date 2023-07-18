package review;

public class Operator {
	
	public static void main(String[] args) {
		System.out.println("----------------1--------------");
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		
		System.out.println(z);
		
		System.out.println("----------------2--------------");
		int score = 85;
		
		String result = (!(score>90)) ? "ga" : "na";
		System.out.println(result);
		System.out.println("----------------3--------------");
		int pencils = 534;
		int students = 30;
		
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % students;
		
		System.out.println(pencilsLeft);
		System.out.println("----------------4--------------");
		int value = 356;
		System.out.println(value - 56);
		System.out.println("----------------5--------------");
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengthTop + lengthBottom) * height / 2.0;
		System.out.println(area);
		System.out.println("----------------6--------------");
		int x1 = 10;
		int y1 = 5;
		System.out.println( (x1>7) && (y1<=5));
		System.out.println( (x1%3 == 2) || (y1%2 != 1));
		System.out.println("----------------7--------------");
		double xx = 5.0;
		double yy = 0.0;
		double zz = 5%yy;
		
		if(Double.isNaN(zz)) {
			System.out.println("0.0으로 못나눔");
		}else {
			double result2 = zz +10;
			System.out.println("result = " + result2);
		}
		
	}
}
