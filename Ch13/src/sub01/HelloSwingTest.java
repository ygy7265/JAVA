package sub01;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * GUI���α׷���
 * -����ڰ� ���ϰ� ���α׷��� ����� �� �ְ� �����츦 �����ϴ� ���α׷���
 * - JAVA�� GUI������ ���� SWING���̹���������
 * - ���� GUI������ ���� WindowBulider ��ġ
 */
public class HelloSwingTest {

	public static void main(String[] args) {
		
		//�⺻â(������)����
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("HelloSwing");
		frame.setPreferredSize(new Dimension(300,200));
		frame.pack();
		frame.setVisible(true);
		
		//�����̳� ��ġ
		Container pane = frame.getContentPane();
		
		//������Ʈ ��ġ
		JLabel label = new JLabel("HelloSwing");
		pane.add(label);
		
		JButton button = new JButton("ok");
		pane.add(button);
		
		
	}

}
