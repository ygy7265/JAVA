<%@page import="vo.ArticleVo"%>
<%@page import="java.util.List"%>
<%@page import="dao.ArticleDAO"%>
<%@page import="vo.UserVo"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_header.jsp" %>
<%
	ArticleDAO dao = new ArticleDAO();
	List<ArticleVo> list = dao.selectAticles();
	
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
                      <td><%=article.getNo() %></td>
                      <td><a href="./view.html"><%=article.getTitle() %></a>&nbsp;[<%=article.getComment() %>]</td>
                      <td><%=article.getWriter() %></td>
                      <td><%=article.getRdate() %></td>
                      <td><%=article.getHit() %></td>
                  </tr>
                  <%
                  }
                  %>
              </table>
          </article>
          <div class="paging">
              <a href="#" class="prev">Back</a>
              <a href="#" class="num current">1</a>
              <a href="#" class="num">2</a>
              <a href="#" class="num">3</a>
              <a href="#" class="next">Next</a>
          </div>

          <a href="/Jboard/write.jsp" class="btnWrite">Write</a>
      </section>
  </main>
<%@ include file="./_footer.jsp" %>
