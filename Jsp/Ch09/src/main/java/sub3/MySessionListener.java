package sub3;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;


//WAS 실행/종료 감시하는 옵저버
@WebListener
public class MySessionListener implements HttpSessionListener{
	public MySessionListener() {
		System.out.println("MysessionListener()...");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("sessioncreated()...");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("sessionDestoryed()...");
	}
	
	
}
