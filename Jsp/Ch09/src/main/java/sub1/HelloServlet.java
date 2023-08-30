package sub1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

		@Override
		public void init() throws ServletException {	
			//서블릿 최초 실행
			System.out.println("HelloServlet init()...");
		}
		
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//클라이언트의 GET요청
			System.out.println("HelloServlet doget()...");
			
			//HTML
			resp.setContentType("text/html;charset=UTF-8");
			
			PrintWriter writer = resp.getWriter();
			writer.println("<html>");
			writer.println("<head>");
			writer.println("<mata charset='UTF-8'>");
			writer.println("<title>HelloServlet</title>");
			writer.println("</head>");
			writer.println("<body>");
			writer.println("<h3>HelloServlet</h3>");
			writer.println("<a href='./1_Servlet.jsp'>ServletMain</a>");
			writer.println("<a href='./hello.do'>HelloServlet</a>");
			writer.println("</body>");
			writer.println("</html>");
		}
		
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			//클라이언트의 Post요청
			System.out.println("HelloServlet doPost()...");
			
			String uid = req.getParameter("uid");
			String pass = req.getParameter("pass");
			
			if(uid.equals("a101") && pass.equals("1234")) {
				
				HttpSession session = req.getSession();
					
				session.setAttribute("sessUid", uid);
				session.setAttribute("sessPass", pass);
				
				resp.sendRedirect("/Ch09/3_Listener.jsp?success=200");
			}
			else {
				resp.sendRedirect("/Ch09/3_Listener.jsp?success=100");
		
			}
		}
		
}
