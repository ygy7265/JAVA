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
			req.setAttribute("success", success);
			RequestDispatcher dispatcher = req.getRequestDispatcher("/user/login.jsp");
			dispatcher.forward(req, resp);
			
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
