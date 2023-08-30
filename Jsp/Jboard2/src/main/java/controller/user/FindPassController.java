package controller.user;

import java.io.IOException;

import javax.mail.Session;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dto.UserDTO;
import service.jboardservice;
@WebServlet("/user/findPass.do")
public class FindPassController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user/findPass.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		jboardservice service = new jboardservice();
		UserDTO dto = service.selectUserUid(uid);
		HttpSession session  = req.getSession();
		session.setAttribute("uid", uid);
		
		resp.sendRedirect("/Jboard2/user/findPassChange.do");
	}
}
