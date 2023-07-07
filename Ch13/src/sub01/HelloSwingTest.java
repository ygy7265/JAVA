package sub01;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/*
 * GUI프로그래밍
 * -사용자가 편리하게 프로그램을 사용할 수 있게 윈도우를 지원하는 프로그래밍
 * - JAVA는 GUI개발을 위해 SWING라이버러리지원
 * - 편리한 GUI개발을 위해 WindowBulider 설치
 */
public class HelloSwingTest {

	public static void main(String[] args) {
		
		//기본창(윈도우)생성
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("HelloSwing");
		frame.setPreferredSize(new Dimension(300,200));
		frame.pack();
		frame.setVisible(true);
		
		//컨테이너 배치
		Container pane = frame.getContentPane();
		
		//컴포넌트 배치
		JLabel label = new JLabel("HelloSwing");
		pane.add(label);
		
		JButton button = new JButton("ok");
		pane.add(button);
		
		
	}

}
