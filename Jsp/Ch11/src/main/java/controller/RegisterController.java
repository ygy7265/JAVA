package controller;

import java.io.IOException;
import java.lang.System.Logger;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dto.memberDTO;
import service.memberservice;

@WebServlet("/register.do")
public class RegisterController extends HttpServlet{

	private static final long serialVersionUID = 1L;
	private memberservice memservice = memberservice.INSTANCE;
	@Override
	public void init() throws ServletException {
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * List<memberDTO> members = memberservice.selects();
		 * req.setAttribute("members", members);
		 */
		RequestDispatcher dispatcher = req.getRequestDispatcher("/register.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uid = req.getParameter("uid");
		String name = req.getParameter("name");
		String hp = req.getParameter("hp");
		String pos = req.getParameter("pos");
		String dep = req.getParameter("dep");
		
		memberDTO dto = new memberDTO();
		dto.setUid(uid);
		dto.setName(name);
		dto.setHp(hp);
		dto.setPos(pos);
		dto.setDep(dep);
		
		memservice.insert(dto);
		
		resp.sendRedirect("/Ch11/list.do");
	}
	
}
