<%@page import="vo.ArticleVo"%>
<%@page import="java.util.List"%>
<%@page import="dao.ArticleDAO"%>
<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_header.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	String pg = request.getParameter("pg");
	
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
	List<ArticleVo> list = dao.selectAticles(start);
	
%>
	
  <main>
      <section id="board" class="list">
          <h3>List</h3>
          <article>
              <table class="writertable">
                  <tr>
                      <th>Number</th>
                      <th>Title</th>
                      <th>Writer</th>
                      <th>Date</th>
                      <th>inquiry</th>
                  </tr>
                  
                  <% for(ArticleVo article : list){ %>
                  <tr>
                      <td><%=pageStartNum-- %></td>
                      <td><a href="/Jboard/view.jsp?no=<%=article.getNo()%>"><%=article.getTitle() %></a>&nbsp;[2]</td>
                      <td><%=article.getNick() %></td>
                      <td><%=article.getRdate() %></td>
                      <td><%=article.getHit() %></td>
                  </tr>
                  <% }%>
              </table>
          </article>
          <div class="paging">
          		<!-- page가 첫페이지일경우 이전키 비활성화 -->
          	  <%if(pageGroupStart > 1){ %> 
          	  <!-- 이전키를 누를경우 이전키 페이지그룹의 시작점을 바꾼다 -->
              <a href="/Jboard/list.jsp?pg=<%= pageGroupStart - 1 %>" class="prev">Back</a>
              <%} %>
              <!-- 시작점과 끝점을 정한만큼10개생성 -->
              <%for(int i=pageGroupStart; i<=pageGroupEnd; i++){ %>
              
              <!-- current가 누른 숫자를 넘겨받아 일치하면 강조효과적용-->
              <a href="/Jboard/list.jsp?pg=<%=i %>" class="num <%= (currentPage == i)?"current":""%>"><%=i %></a>
              <%} %>
              
              <%if(pageGroupEnd < lastPageNum){ %>
              <!-- 이전키를 누를경우 이전키 페이지그룹의 끝점을 바꾼다 -->
              <a href="/Jboard/list.jsp?pg=<%= pageGroupEnd + 1 %>" class="next">Next</a>
              <%} %>
          </div>

          <a href="/Jboard/write.jsp" class="btnWrite">Write</a>
      </section>
  </main>
<%@ include file="./_footer.jsp" %>
