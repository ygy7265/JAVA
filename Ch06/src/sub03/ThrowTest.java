package sub03;
/*
 * throw(예외발생시키기)실습
 */

class MinusException extends Exception{
	public MinusException(String msg) {
		super(msg);
	}
}
class OverException extends Exception{
	public OverException(String msg) {
		super(msg);
	}
}
class Score {
	public void cheak(int score) throws MinusException {
		if(score < 0) {
			//예외발생시키기
			throw new MinusException("점수는 음수를 입력할수 없습니다");
		}else {
			System.out.println("점수는 정상입니다");
		}
		if (score > 100) {
			throw new MinusException("점수는 100점을 초과할수 없습니다");
		}
	};
}
public class ThrowTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score min = new Score();
		try {
			min.cheak(120);
			min.cheak(-20);
			min.cheak(30);
		} catch (MinusException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
