package sub1;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;

public class Account {
	private String bank;
	private String id;
	private String name;
	private int balence;
	
	public Account(String bank,String id, String name, int balence) {
		this.bank = bank;
		this.id = id;
		this.name = name;
		this.balence = balence;
	}
	
	public void deposit(int money) {
		this.balence += money;
	}
	public void withdraw(int money) {
		this.balence -= money;
	}
	public void show(JspWriter out) throws IOException {
		out.println("<p>");
		out.println("bank name = " + bank + "<br>");
		out.println("Account number = " + id + "<br>");
		out.println("add name  = " + name + "<br>");
		out.println("balence = " + balence + "<br>");
		out.println("</p>");
	}
}
