package sub01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JEditorPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.*;
import javax.swing.*;

public class ComponentsTest {

	private JFrame frame;
	private JTextField txtUid;
	private JTextField txtName;
	private JTextField txtHp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.CYAN);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Recorvery\\Desktop\\Workspace\\Html\\Ch02\\Images\\ball.png"));
		frame.setBounds(100, 100, 608, 431);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ComponentTest");
		lblNewLabel.setFont(new Font("Gulim", Font.BOLD, 16));
		lblNewLabel.setBounds(22, 10, 125, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btn1 = new JButton(" ");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn1");
				
			}
		});
		btn1.setIcon(new ImageIcon("C:\\Users\\Recorvery\\Desktop\\Workspace\\Html\\Ch02\\Images\\ball.png"));
		btn1.setBackground(Color.GREEN);
		btn1.setFont(new Font("Gulim", Font.BOLD | Font.ITALIC, 87));
		btn1.setBounds(0, 51, 172, 34);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("btn2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"btn2");
			}
		});
		btn2.setFont(new Font("Gulim", Font.BOLD | Font.ITALIC, 55));
		btn2.setBackground(Color.GREEN);
		btn2.setBounds(0, 95, 172, 34);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("bth3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null,"btn2","확인",JOptionPane.YES_NO_OPTION);
				if(answer == 0) {
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
			}
		});
		btn3.setFont(new Font("Gulim", Font.BOLD | Font.ITALIC, 37));
		btn3.setBackground(Color.GREEN);
		btn3.setBounds(0, 139, 172, 34);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_1 = new JLabel("Textfield Test");
		lblNewLabel_1.setFont(new Font("Gulim", Font.BOLD, 24));
		lblNewLabel_1.setBounds(286, 51, 172, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtUid = new JTextField();
		txtUid.setBounds(258, 102, 96, 21);
		frame.getContentPane().add(txtUid);
		txtUid.setColumns(10);
		
		txtName = new JTextField();
		txtName.setColumns(10);
		txtName.setBounds(258, 144, 96, 21);
		frame.getContentPane().add(txtName);
		
		txtHp = new JTextField();
		txtHp.setColumns(10);
		txtHp.setBounds(258, 191, 96, 21);
		frame.getContentPane().add(txtHp);
		
		JLabel lbId = new JLabel("result :");
		lbId.setHorizontalAlignment(SwingConstants.LEFT);
		lbId.setFont(new Font("Gulim", Font.BOLD, 16));
		lbId.setBounds(464, 104, 118, 15);
		frame.getContentPane().add(lbId);
		
		JLabel lbName = new JLabel("result :");
		lbName.setHorizontalAlignment(SwingConstants.LEFT);
		lbName.setFont(new Font("Gulim", Font.BOLD, 16));
		lbName.setBounds(464, 146, 118, 15);
		frame.getContentPane().add(lbName);
		
		JLabel lbHp = new JLabel("result :");
		lbHp.setHorizontalAlignment(SwingConstants.LEFT);
		lbHp.setFont(new Font("Gulim", Font.BOLD, 16));
		lbHp.setBounds(464, 193, 118, 15);
		frame.getContentPane().add(lbHp);
		
		JButton btnUid = new JButton("\uD655\uC778");
		btnUid.setFont(new Font("Gulim", Font.BOLD, 16));
		btnUid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String uid = txtUid.getText();
			lbId.setText("result = " + uid);
			}
		});
		btnUid.setBounds(367, 101, 91, 23);
		frame.getContentPane().add(btnUid);
		
		JButton btnName = new JButton("\uD655\uC778");
		btnName.setFont(new Font("Gulim", Font.BOLD, 16));
		btnName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String Name = txtName.getText();
			lbName.setText("result = " + Name);
			}
		});
		btnName.setBounds(366, 144, 91, 23);
		frame.getContentPane().add(btnName);
		
		JButton btnHp = new JButton("\uD655\uC778");
		btnHp.setFont(new Font("Gulim", Font.BOLD, 16));
		btnHp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String uHp = txtHp.getText();
			lbHp.setText("result = " + uHp);
			}
		});
		btnHp.setBounds(367, 190, 91, 23);
		frame.getContentPane().add(btnHp);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Gulim", Font.BOLD, 16));
		lblNewLabel_2.setBounds(201, 104, 50, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Gulim", Font.BOLD, 16));
		lblNewLabel_2_1.setBounds(201, 147, 50, 15);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("HP");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Gulim", Font.BOLD, 16));
		lblNewLabel_2_2.setBounds(201, 194, 50, 15);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JCheckBox chk1 = new JCheckBox("\uC0AC\uACFC");
		chk1.setBounds(216, 235, 55, 23);
		frame.getContentPane().add(chk1);
		
		JCheckBox chk2 = new JCheckBox("\uB538\uAE30");
		chk2.setBounds(286, 235, 55, 23);
		frame.getContentPane().add(chk2);
		
		JCheckBox chk3 = new JCheckBox("\uD3EC\uB3C4");
		chk3.setBounds(350, 235, 55, 23);
		frame.getContentPane().add(chk3);
		
		JCheckBox chk4 = new JCheckBox("\uC218\uBC15");
		chk4.setBounds(409, 236, 55, 23);
		frame.getContentPane().add(chk4);
		
		JCheckBox chk5 = new JCheckBox("\uCC38\uC678");
		chk5.setBounds(476, 235, 55, 23);
		frame.getContentPane().add(chk5);

		JLabel lbChkFruit = new JLabel("\uC120\uD0DD = ");
		lbChkFruit.setBounds(201, 273, 257, 19);
		frame.getContentPane().add(lbChkFruit);
		
		
		JButton btnChkFruit = new JButton("\uD655\uC778");
		btnChkFruit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<String> fruits = new ArrayList<>();
				
				if(chk1.isSelected()) {
					fruits.add(chk1.getText()); 
				}
				if(chk2.isSelected()) {
					fruits.add(chk2.getText());
				}
				if(chk3.isSelected()) {
					fruits.add(chk3.getText());
				}
				if(chk4.isSelected()) {
					fruits.add(chk4.getText());
				}
				if(chk5.isSelected()) {
					fruits.add(chk5.getText());
				}
				lbChkFruit.setText("선택한과일" + fruits);
				
			}
		});
		btnChkFruit.setBounds(486, 269, 91, 23);
		frame.getContentPane().add(btnChkFruit);
		
		JRadioButton rdMale = new JRadioButton("\"\uB0A8\uC790\"");
		rdMale.setBounds(8, 256, 60, 23);
		frame.getContentPane().add(rdMale);
		
		JRadioButton rdFemale = new JRadioButton("\"\uC5EC\uC790\"");
		rdFemale.setBounds(8, 296, 60, 23);
		frame.getContentPane().add(rdFemale);
		
		
		JLabel lbgender = new JLabel("");
		lbgender.setBounds(76, 256, 96, 63);
		frame.getContentPane().add(lbgender);
		
		
		JButton btngender = new JButton("\uD655\uC778");
		btngender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonGroup bg = new ButtonGroup();
				bg.add(rdMale);
				bg.add(rdFemale);
				
				if(rdMale.isSelected()) {
					lbgender.setText(rdMale.getText());
				}else {
					lbgender.setText(rdFemale.getText());
				}
			}
		});
		btngender.setBounds(0, 325, 121, 29);
		frame.getContentPane().add(btngender);
	
	
	}
}
