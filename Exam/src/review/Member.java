package review;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
class Accounts{
	private String id;
	private String name;
	private int money;
	
	public Accounts() {
		
	}	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "ID: " + id + ", Name: " + name + ", Money: " + money;
	}
	
}
class AccountFactory{
	private ArrayList<Accounts> accountList;
	
	public AccountFactory() {
		accountList = new ArrayList<>();
	}
	
	public Accounts createAccount(String id, String name,int money) {
		Accounts account = new Accounts();
		account.setId(id);
		account.setName(name);
		account.setMoney(money);
		accountList.add(account);
		return account;
		
	}
	public ArrayList<Accounts> getAccountsList(){
		return accountList;
	}
}
class Account{
	private static Account instance;
	private int balence;
	private Account() {
		
	}
	public static Account getinstance() {
		if(instance == null) {
			instance = new Account();
		}
		return instance;
	}
	public void setBalence(int balence) {
		if(0 < balence && balence <= 1000000) {
		 this.balence = balence;
		}
	}
	public int getBalence() {
		return this.balence;
	}
	
	
}

class Shop{
	private static Shop instance = new Shop();
	private Shop() {
		
	}
	public static Shop getinstance(){
		return instance;
	}
}
class Printer{
	private int num;
	private boolean num1;
	private double num2;
	private String num3;
	public void printer (int num){
		this.num = num;
	}
	public void printer (boolean num){
		this.num1 = num;
	}
	public void printer (double num){
		this.num2 = num;
	}
	public void printer (String num){
		this.num3 = num;
	}
	
}
class Memberinfo{
	private String name;
	private String id;
	private String password;
	private int age;
	
	public Memberinfo(String name,String id,String password,int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	public String login(String id,String password) {
		this.id = id;
		this.password = password;
		return id + password;
	}
	public void show() {
		System.out.println("name = " + name + " id = " + id + " password = " + password + "age =  " + age);
	}
	
}
public class Member {
	public static void main(String[] args) {
		System.out.println("---------------------1-----------------------");
		Memberinfo memberinfo = new Memberinfo("bogo", "a101", "a102", 30);
		memberinfo.show();
		
		System.out.println("----------------------2----------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("id + password add = ");
		String result = memberinfo.login(sc.next(),sc.next());
		String result1 = "hong1234";
		
		if(result.equals(result1)) {
			System.out.println("login");
		}
		else {
			System.out.println("id or password wrong");
		}
		System.out.println("-----------------------3---------------------");
		Printer printer = new Printer();
		
		printer.printer(10);
		printer.printer(true);
		printer.printer(32.1);
		printer.printer("hongglidong");
		
		System.out.println("----------------------4-------------------");
		Shop shop = Shop.getinstance();
		Shop shop2 = Shop.getinstance();
		
		if(shop == shop2) {
			System.out.println("same object");
		}else {
			System.out.println("not same object");
		}
		
		System.out.println("----------------------5-------------------");
		Account account = Account.getinstance();
		account.setBalence(10000);
		System.out.println("now balence =" + account.getBalence());
		account.setBalence(-100);
		System.out.println("now balence =" + account.getBalence());
		account.setBalence(2000000);
		System.out.println("now balence =" + account.getBalence());
		account.setBalence(30000);
		System.out.println("now balence =" + account.getBalence());
		
		
		Accounts acc[] = new Accounts[100];
		AccountFactory factory = new AccountFactory();
		while(true) {
			System.out.println("----------------------6-------------------");
			System.out.println("1.Account create | 2.Account list | 3.balence add | 4. balence mi | exit");
			System.out.println("----------------------6-------------------");
			int choice = sc.nextInt();
			
			if(choice ==1) {

				System.out.print("accid = " );
				String id = sc.next();
				System.out.print("name = ");
				String name = sc.next();
				System.out.print("money = ");
				int money = sc.nextInt();
				System.out.println("Account create sucess");
				
				factory.createAccount(id, name, money);			
			}
			else if(choice ==2) {
				ArrayList<Accounts> accountList = factory.getAccountsList();
				
				for(Accounts ac : accountList) {
					System.out.println(ac);
				}
				
			}
			else if(choice ==3) {
				
			}
			else if(choice ==4) {
				
			}
		}
		
		
	}
}
