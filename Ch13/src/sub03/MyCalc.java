package sub03;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MyCalc extends JFrame {

	private JPanel contentPane;
	private JTextField txtDisp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalc frame = new MyCalc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	ArrayList<Double> numberList = new ArrayList<>(); // ���ڸ� �����ϴ� ����Ʈ
	ArrayList<String> arithList = new ArrayList<>(); // �����ڸ� �����ϴ� ����Ʈ
	static final Double ERROR_NUM = -99999.999; //���� �ѹ�;

	StringBuilder sb = new StringBuilder(); // �ԷµǴ� ������(����, ������)�� �����ϴ� ����
	char[] arithmetic = { '+', 'X', '-', '/' };
	
	//�Էµ� ������(����, ������)�� ���� ��� ���� ��ȯ�ϴ� �޼���
	public Double Cal() {
		if(!distinct()) return ERROR_NUM; // ����ϱ����� ������� �Էµ� �����͸� ���ڿ� �����ڸ� ������ �޼��带 ȣ���Ͽ� �и��Ѵ�.
		double result = 0; // ��� ��� ���� �����ϴ� ����

		// �켱���� 1��°�� 'X', '/'���꿡 ���� ��� ����
		int size = arithList.size();
		for (int i = 0; i < size; i++) {
			String s = arithList.get(i);
			if (s.contains("X") || s.contains("/")) {
				if (s.equals("X")) {
					result = numberList.get(i) * numberList.get(i + 1);
				} else if (s.equals("/")) {
					result = numberList.get(i) / numberList.get(i + 1);
				}
				arithList.remove(i); // ���꿡 ���� �����ڴ� ����
				numberList.set(i + 1, result); // ���� ������� ���� ������ ����
				numberList.remove(i); // 2���� ���� ��� �� �ϳ��� ���� �Ǳ⶧���� ����� ���� ������ ������ ���� �������ش�.
				i--;
				size--;
			}
		}

		// �켱���� 2��°�� '+', '-' ���꿡 ���� ��� ����
		size = arithList.size();
		for (int i = 0; i < size; i++) {
			String s = arithList.get(i);
			
			if (s.equals("+")) {
				result = numberList.get(i) + numberList.get(i + 1);
			} else if (s.equals("-")) {
				result = numberList.get(i) - numberList.get(i + 1);
			}
			
			arithList.remove(i); // ���꿡 ���� �����ڴ� ����
			numberList.set(i + 1, result); // ���� ������� ���� ������ ����
			numberList.remove(i); // 2���� ���� ��� �� �ϳ��� ���� �Ǳ⶧���� ����� ���� ������ ������ ���� �������ش�.
			i--;
			size--;
		}

		return numberList.get(0);
	}

	// ���ڿ� �����ڸ� ������ �����ϴ� �޼���
	public boolean distinct() {
		char[] cArr = sb.toString().toCharArray();
		StringBuilder temp = new StringBuilder();


		for (int i = 0; i < cArr.length; i++) {

			
			if (cArr[i] == '+' || cArr[i] == '-' || cArr[i] == '/' || cArr[i] == 'X') { //�ش� �ε����� ���� �������� ��� ����
				
				if(i == 0) { //ù��° ���� ��ȣ�� '+'�� '-'�� ���
					if(cArr[i] == '-' || cArr[i] == '+') {
						temp.append(cArr[i]);	
						continue;						
					} else if(cArr[i] == 'X' || cArr[i] == '/') { //ù��° ���� ��ȣ�� 'X'�� '/'�� ���� �߸��� �����̹Ƿ� ��� �����͸� �ʱ�ȭ ��Ű�� ���� �޽����� ǥ���Ѵ�.
						JOptionPane.showMessageDialog(null, "�߸��� �����Դϴ�.", "���", JOptionPane.INFORMATION_MESSAGE);
						reset();
						return false;
					}
				} 
				
				numberList.add(Double.parseDouble(temp.toString())); //�����ڰ� ������������ ����Ǿ��� ���� ���� numberList�� �����Ѵ�.
				arithList.add(String.valueOf(cArr[i])); // �����ڸ� arithList�� ����
				temp.delete(0, temp.length()); // ���� �����ѵڿ� �ٽ� ���ڸ� �ֱ����� �ʱ�ȭ
				
			} else if (i == cArr.length - 1) { // �����Ϳ� ����� ������ �ε����� ��� ������ ������ �Ŀ� ���ڸ� �����ؿ� temp������ ������ �ε��� ���� �ְ� numberList�� �����Ѵ�.
				temp.append(cArr[i]);
				numberList.add(Double.valueOf(temp.toString()));

			} else {
				temp.append(cArr[i]);
			}
			
		}
		return true;	
	}
	
	//��� �����͸� �ʱ�ȭ�ϴ� �޼���
	public void reset() { 
		sb.delete(0, sb.length());
		numberList.clear();
		arithList.clear();
		txtDisp.setText("0");
	}

	// ��ư�� ���������� �ؽ�Ʈ�� �ش� ��ư�� ���� �߰��ؼ� ���̵��� �ϴ� �޼���
	public void dataAppend(String btnText) {
		sb.append(btnText);
		txtDisp.setText(sb.toString());
	}

	// sb������ ����ִ��� Ȯ���ϴ� �޼���
	public boolean isEmpty() {
		return sb.length() == 0;
	}

	// sb ������ ������ ���ڿ� ���� ���������� Ȯ���ϴ� �޼���
	public boolean check() {
		if (isEmpty())
			return true;
		
		//'='�� �����ϰ� �ִ� ��� �ʱ�ȭ ��Ų��.
		if(sb.toString().contains("=")) {
			reset();
			return false;
		}

		char[] cArr = sb.toString().toCharArray();

		for (char ch : arithmetic) {
			if (cArr[cArr.length - 1] == ch) {
				changeArit();
				return true;
			}
		}

		return true;
	}

	// sb���� �������� �ִ� ���ڿ��� �����ϴ� �޼���
	public void changeArit() {

		char[] cArr = sb.toString().toCharArray();

		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());
	}

	/**
	 * Create the frame.
	 */
	public MyCalc() {
		setTitle("MyCalculator v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 313, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtDisp = new JTextField();
		txtDisp.setEditable(false);
		txtDisp.setFont(new Font("����", Font.BOLD, 22));
		txtDisp.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDisp.setText("0");
		txtDisp.setBounds(12, 10, 273, 58);
		contentPane.add(txtDisp);
		txtDisp.setColumns(10);

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn7.getText());
			}
		});
		btn7.setBounds(12, 78, 60, 60);
		contentPane.add(btn7);

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn8.getText());
			}
		});
		btn8.setBounds(82, 78, 60, 60);
		contentPane.add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn9.getText());
			}
		});
		btn9.setBounds(154, 78, 60, 60);
		contentPane.add(btn9);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnDiv.getText());
			}
		});
		btnDiv.setBounds(224, 78, 60, 60);
		contentPane.add(btnDiv);

		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn4.getText());
			}
		});
		btn4.setBounds(13, 148, 60, 60);
		contentPane.add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn5.getText());
			}
		});
		btn5.setBounds(83, 148, 60, 60);
		contentPane.add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn6.getText());
			}
		});
		btn6.setBounds(155, 148, 60, 60);
		contentPane.add(btn6);

		JButton btnMulti = new JButton("X");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMulti.getText());
			}
		});
		btnMulti.setBounds(225, 148, 60, 60);
		contentPane.add(btnMulti);

		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn1.getText());
			}
		});
		btn1.setBounds(13, 218, 60, 60);
		contentPane.add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn2.getText());
			}
		});
		btn2.setBounds(83, 218, 60, 60);
		contentPane.add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn3.getText());
			}
		});
		btn3.setBounds(155, 218, 60, 60);
		contentPane.add(btn3);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnMinus.getText());
			}
		});
		btnMinus.setBounds(225, 218, 60, 60);
		contentPane.add(btnMinus);

		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dataAppend(btn0.getText());
			}
		});
		btn0.setBounds(13, 288, 60, 60);
		contentPane.add(btn0);

		JButton btnCancel = new JButton("C");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sb.delete(0, sb.length());
				txtDisp.setText("0");
				numberList.clear();
				arithList.clear();
			}
		});
		btnCancel.setBounds(83, 288, 60, 60);
		contentPane.add(btnCancel);

		JButton btnEq = new JButton("=");
		btnEq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(check() == false) { //'='���� �̹� �ԷµǾ� �ִٸ� return�Ѵ�.
					return;
				}
				if(isEmpty()) { //�����Ͱ� ����ִ� ��� return �Ѵ�.
					return;
				}

				Double result = Cal();
				if(result == ERROR_NUM) return; //result ���� ���� ��ȣ�̸� return�Ѵ�.
				
				String formatResult = "";
				result = Double.parseDouble(String.format("%.1f", result)); //�Ҽ� ù°�ڸ����� ǥ�� 
				
				if(String.valueOf(result).length() > 8) { //������� ����(�Ҽ��� ����)�� 8�̻��� ��� ����ǥ������ ���
					DecimalFormat df = new DecimalFormat("#.####E0");
					formatResult = df.format(result);
				} else {
					formatResult = String.valueOf(result);					
				}
				dataAppend(btnEq.getText());
				dataAppend(formatResult);
				numberList.clear();
				arithList.clear();
			}
		});
		btnEq.setBounds(155, 288, 60, 60);
		contentPane.add(btnEq);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check();
				dataAppend(btnPlus.getText());
			}
		});
		btnPlus.setBounds(225, 288, 60, 60);
		contentPane.add(btnPlus);
	}
}