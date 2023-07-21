package test08;
interface NumericLamda{
	boolean test(int n);
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumericLamda isEven = n -> n % 2 == 0;
		if(isEven.test(2)) {
			System.out.println("2 = even");
		}
		
		if(isEven.test(3)) {
			System.out.println("3 = No even");
		}
		NumericLamda isNonNeg = n -> n > 0;
		if(isNonNeg.test(1)) {
			System.out.println("1 = neg");
		}
		
		if(isNonNeg.test(-1)) {
			System.out.println("-1 = nonneg");
		}
	}

}
