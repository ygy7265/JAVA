package sub03;
/*
 * throw(���ܹ߻���Ű��)�ǽ�
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
			//���ܹ߻���Ű��
			throw new MinusException("������ ������ �Է��Ҽ� �����ϴ�");
		}else {
			System.out.println("������ �����Դϴ�");
		}
		if (score > 100) {
			throw new MinusException("������ 100���� �ʰ��Ҽ� �����ϴ�");
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
