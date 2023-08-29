package controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

import dto.UserDTO;
import service.jboardservice;
@WebServlet("/user/login.do")
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String success = req.getParameter("success");
		int parsesuccess = 0;
		
		if(success != null) {
			parsesuccess = Integer.parseInt(success);
		}else {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/user/login.jsp");
			dispatcher.forward(req, resp);
		}
		
		
			if(parsesuccess == 100) {
				 resp.setContentType("text/html; charset=UTF-8");
				 PrintWriter out = resp.getWriter();
				 out.println("<script>alert('아이디를 확인해주세요.');history.go(-1);</script>");
				 out.flush();
				 resp.flushBuffer();
				 out.close();
				 
			}else if(parsesuccess == 200) {
				 resp.setContentType("text/html; charset=UTF-8");
				 PrintWriter out = resp.getWriter();
				 out.println("<script>alert('로그아웃완료.');location.href='/Jboard2/user/login.do';</script>");
				 out.flush();
				 resp.flushBuffer();
				 out.close();	 
		}
			
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		jboardservice service = new jboardservice();
		
		String uid = req.getParameter("uid");
		String pass = req.getParameter("pass");
		UserDTO dto = new UserDTO(); 
		dto =service.loginUser(uid, pass);
		HttpSession session = req.getSession();
		
		if(dto != null) {		
		session.setAttribute("sessUser", dto);
		resp.sendRedirect("/Jboard2/list.do");
		}
		else {
			resp.sendRedirect("/Jboard2/user/login.do?success=100");
		}
		
		
	}
}
