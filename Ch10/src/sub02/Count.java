package sub02;

public class Count {
	private int num;
	
	public int getNum() {
		return num;
		
	}
	//����ȭ �� : �����尣�� ������ ���� ���������� ����
	public synchronized void setNum() {
		this.num++;
	}
}