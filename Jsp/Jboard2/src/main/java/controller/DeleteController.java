package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import service.jboardservice;
@WebServlet("/delete.do")
public class DeleteController extends HttpServlet{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		jboardservice service = new jboardservice();
		
		String no = req.getParameter("no");
		logger.info("no : " + no);
		service.deleteArticle(no);
		
		resp.sendRedirect("/Jboard2/list.do");
	}
}
