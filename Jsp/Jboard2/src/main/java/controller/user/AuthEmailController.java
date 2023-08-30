package controller.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.JsonObject;

import service.jboardservice;

@WebServlet("/user/authEmail.do")
public class AuthEmailController extends HttpServlet{

	private static final long serialVersionUID = -5842532618123522585L;
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	private jboardservice service = new jboardservice();
	
	//이메일 전송상태확인
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String email = req.getParameter("email");
		String name = req.getParameter("name");
		String type = req.getParameter("type");
		String uid = req.getParameter("uid");
		logger.info(uid);
		logger.info(email);
		int result = 0;
		int status = 0;
		if(type.equals("REGISTER")) {
			 result = service.selectCountEmail(email);
			 if(result == 0) {
				 status = service.sendCodeByEmail(email);
			 }
			 
		}else if(type.equals("FIND_ID")){
			 result = service.selectCountNameAndEmail(name,email);
			 if(result == 1) {
				 status = service.sendCodeByEmail(email);
				}
		}else if(type.equals("FIND_PASS")){
			 result = service.selectCountUidAndEmail(uid,email);
			 if(result == 1) {
				 status = service.sendCodeByEmail(email);
			 }
		}
		
				
		JsonObject json = new JsonObject();
		json.addProperty("status", status);
		json.addProperty("result", result);
		
		PrintWriter writer = resp.getWriter();
		writer.print(json.toString());
	}
	
	//이메일 코드비교
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String code = req.getParameter("code");
		int parsecode = Integer.parseInt(code);
		int result = service.cofirmCodeByEmail(parsecode);
		
		JsonObject json = new JsonObject();
		json.addProperty("result", result);
		
		PrintWriter writer = resp.getWriter();
		writer.print(json.toString());
	}

}
