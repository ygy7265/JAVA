package controller.user;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dto.UserDTO;
import service.jboardservice;

@WebServlet("/user/findPassChange.do")
public class FindPassChangController extends HttpServlet{
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String uid = (String)session.getAttribute("uid");
		logger.info("uid :"+uid);
		
		if(uid == null) {
		resp.sendRedirect("/Jboard2/user/findPass.do");
		}else {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user/findPassChange.jsp");
		dispatcher.forward(req, resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		String pass1 = req.getParameter("pass1");
		jboardservice service = new jboardservice();
		int result = service.updateUserPass(pass1,uid);
		logger.info("uid = "+uid);
		
		if(result == 1) {
			resp.sendRedirect("/Jboard2/user/login.do?success=102");
		}
		else {
			resp.sendRedirect("/Jboard2/user/login.do?success=103");
		}
		
	}
}
