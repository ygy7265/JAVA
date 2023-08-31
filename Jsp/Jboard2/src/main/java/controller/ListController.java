package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.ArticleDAO;
import dto.ArticleDTO;
import dto.UserDTO;

@WebServlet("/list.do")
public class ListController extends HttpServlet{
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	String success = req.getParameter("success");
	String pg = req.getParameter("pg");
	req.setAttribute("success", success);
	HttpSession session = req.getSession();
	UserDTO sessUser = (UserDTO)session.getAttribute("sessUser");
	
	/*
	 * if(sessUser != null) { RequestDispatcher dispatcher =
	 * req.getRequestDispatcher("list.jsp"); dispatcher.forward(req, resp);
	 * 
	 * }else { resp.sendRedirect("/Jboard2/user/login.do?seccess=101"); }
	 */
		ArticleDAO dao = new ArticleDAO();
		
		//Page
		int start = 0;
		int pageStartNum = 0;
		int currentPage = 1;
		int total = 0;
		int lastPageNum = 0;
		int pageGroupCurrent = 1;
		int pageGroupStart = 1;
		int pageGroupEnd = 0;
		
		//Page
		if(pg != null){
			currentPage = Integer.parseInt(pg);
		}
		
		//Start 
		start = (currentPage - 1) * 10; 
		//2가들어오면 1*10 = 10부터 10개 = 10~20,3이들어오면 20부터 10개 = 20~30
		
		//PageNum
		total = dao.selectCountTotal();		
		if(total % 10 == 0){
			lastPageNum = (total / 10);	
		}else{
			lastPageNum = (total / 10) + 1;
		}
		

		//Page Group
		pageGroupCurrent = (int)Math.ceil(currentPage / 10.0); //현재 페이지그룹의번호 
		pageGroupStart = (pageGroupCurrent - 1) * 10 + 1; 
		//페이지그룹의 첫번째,1~10,11~20 이니까 +1을해준다
		pageGroupEnd = pageGroupCurrent * 10;//페이지그룹의 마지막
		
		
		if(pageGroupEnd > lastPageNum){ //마지막페이지보다 페이지그룹의 마지막이클경우 마지막페이지만큼만 생성됨
			pageGroupEnd = lastPageNum;
		}
		
		// num 
		pageStartNum = total - start;
		// 163개의 데이터가 있다고가정 
		//163-0  = 163-- 1페이지의넘버 
		//163-10 = 153-- 2페이지의넘버 
		//select
		List<ArticleDTO> list = dao.selectAticles(start);
		logger.info("list = "+list);
		logger.info("currentpage = "+currentPage);
		req.setAttribute("list", list);
		req.setAttribute("pageStartNum", pageStartNum);
		req.setAttribute("pageGroupStart", pageGroupStart);
		req.setAttribute("pageGroupEnd", pageGroupEnd);
		req.setAttribute("lastPageNum", lastPageNum);
		req.setAttribute("currentPage", currentPage);
		req.setAttribute("pg", pg);
		RequestDispatcher dispatcher = req.getRequestDispatcher("list.jsp");
		dispatcher.forward(req, resp);
	
	}
}
