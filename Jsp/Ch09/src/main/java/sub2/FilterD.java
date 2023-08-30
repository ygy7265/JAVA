package sub2;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter(urlPatterns = {"/wellcome.do","/greeting.do"})
public class FilterD implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)throws IOException, ServletException {
		//필터 처리및 로직수령
		System.out.println("FilterD dofileter()...");
		
		//다음필터 호출, 필터없으면 최종자원호출
		chain.doFilter(request, response);
	}

}
