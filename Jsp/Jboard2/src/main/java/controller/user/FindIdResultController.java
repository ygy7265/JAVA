package controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.jboardservice;


@WebServlet("/user/findIdResult.do")
public class FindIdResultController extends HttpServlet{

	private static final long serialVersionUID = 2358986268197044020L;
	private jboardservice service = new jboardservice();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		service.selectUserByNameAndEmail(name, email);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user/findIdResult.jsp");
		dispatcher.forward(req, resp);
	}
}
