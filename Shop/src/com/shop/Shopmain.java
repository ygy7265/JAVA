package com.shop;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Shopmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("--------------------------------");
		System.out.println("shopingmol welcome");
		System.out.println("--------------------------------");
		CustomerVO login = null;
		
		Scanner sc = new Scanner(System.in);
		CustomerDAO customerDAO = CustomerDAO.getInstance();
		OrderDAO orderDAO = OrderDAO.getInstance();
		ShopDAO prodDAO = ShopDAO.getInstace();
		int result;
		while(true) {
			if(login == null) {
				System.out.println("end:0, login:1,signup:2 ptlist:3, buy:4");
				System.out.print("choice:");	
			}else {
				System.out.println("end:0, logout:1 , ptlist:3, buy:4");
				System.out.print("choice:");	
			}
			
			
			int answer = sc.nextInt();
			
			if(answer == 0) {
				break;
			}
			if(answer == 1) {
				if(login == null) {
					System.out.print("ID = ");
					String custId = sc.next();
					login = CustomerDAO.getInstance().selectCustomer(custId);
					
					if(login != null) {
						System.out.println(login.getName() + "Wellcome");
					}else {
						System.out.println("Not select");
					}	
				}else {
					
				}
				
			}
			if(answer == 2) {
				CustomerVO vo = new CustomerVO();
				System.out.print("ID = ");				
				vo.setCustid(sc.next());
				System.out.print("name = ");
				vo.setName(sc.next());
				System.out.print("hp = ");
				vo.setHp(sc.next());;
				System.out.print("addr = ");
				vo.setAddr(sc.next());	
				
				try {
					result = customerDAO.insertCustomer(vo);
					if(result > 0) {
						System.out.println("sucess");
					}else {
						System.out.println("fali");
					}
						
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(answer == 3) {
				List<ShopVO> prodlist= prodDAO.selectsProd();
				ShopVO vo = new ShopVO();
				
				for(ShopVO vo1 : prodlist) {
					vo1.show();
				}
			}
			if(answer == 4) {
				if(login == null) {
					System.out.println("login plase..");
					continue;
				}else {
				System.out.println("order id insert : ");
				}				
				ShopVO vo = prodDAO.selectProd(sc.nextInt());
				
				vo.show();
				}
			}
		
		sc.close();
		System.out.println("BYE~");
	}

}
