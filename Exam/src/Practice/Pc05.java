package Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Gset{
	private String num;
	private String name;
	private String hp;
	private int age;
	
	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getHp() {
		return hp;
	}
	public int getAge() {
		return age;
	}
	
	public void setNum(String num) {
		this.num = num;
	}
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
			
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void show() {
		System.out.printf("Num: %s, Name: %s, HP: %s, Age: %d%n", getNum(), getName(), getHp(),getAge());
	}
	
}
public class Pc05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "root";
		String use = sc.nextLine();
		String sql = "select * from " + use;
		String id,name,hp;
		int age;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(host,user,pass);
			PreparedStatement pst= conn.prepareStatement(sql);
			// pst.setString(1, "A101");
			 ResultSet rs = pst.executeQuery();
			 
			 Gset gs = new Gset();
			 List<Gset> list = new ArrayList<>();
			 while(rs.next()) {
				 
			   	gs =  new Gset();
				  gs.setNum(rs.getString(1));
				  gs.setName(rs.getString(2));
				  gs.setHp(rs.getString(3));
				  gs.setAge(rs.getInt(4));
				  
				  list.add(gs);
			 }
			 for(Gset g : list) {
					System.out.printf("%s,%s,%s,%d\n",g.getNum(),g.getName(),g.getHp(),g.getAge());
					
				}
			 gs = list.get(3);
			 gs.show();
			 
			 
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
