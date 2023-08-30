package controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

import service.jboardservice;
@WebServlet("/user/myinfo.do")
public class MyInfoController extends HttpServlet{
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	jboardservice service = new jboardservice();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/user/myInfo.jsp");
		dispatcher.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String kind = req.getParameter("kind");
		String uid = req.getParameter("uid");
		String pass = req.getParameter("pass");
		int result = 0;
		if(kind == null) {
			kind = "zero";
		}
		logger.info("kind = "+ kind);
		logger.info("uid = "+ uid);
		logger.info("pass = "+ pass);
		
		
		switch (kind) {
		case "WITHDRAW": 			
			result = service.updateUseforwithdraw(uid);
			
			JsonObject json = new JsonObject();
			json.addProperty("result", result);
			resp.getWriter().print(json);
			break;
		case "PASSWORD": 			
			service.updateUseforwithdraw(uid);
			break;
		case "MODIFY": 			
			service.updateUseforwithdraw(uid);
			break;
		
		}
		
	}
}
