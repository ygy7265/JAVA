<%@page import="DTO.ProductDTO"%>
<%@page import="java.util.List"%>
<%@page import="DAO.ProductDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<%
	request.setCharacterEncoding("UTF-8");
	String type = request.getParameter("type");
	String pg = request.getParameter("pg");
	ProductDAO dao = new ProductDAO();
	
	
	int pageStart = 0;
	int pageStartNum = 0;
	int pageEnd = 0;
	int currentPage = 1;
	int pageGroupCurrent = 1;
	int pageGroupStart = 1;
	int pageGroupEnd = 0;
	int total = 0;
	int parsetype = 0;
	
	
	if(pg != null){
		currentPage = Integer.parseInt(pg);
	}
	
	
	 if(type != null){
		 if(type.equals("null")){
			type = null; 
		 }
		 else{
			 parsetype = Integer.parseInt(type);
		 }
	 }
	pageStart = (currentPage - 1) * 10;	
	total = dao.selectCountProductTotal(type);
	if(total % 10 == 0){
		pageEnd = (total / 10);
	}else{
		pageEnd = (total / 10) + 1;
	}
	
	pageGroupCurrent = (int)Math.ceil(currentPage / 10.0);
	pageGroupStart = (pageGroupCurrent - 1) * 10 + 1;
	pageGroupEnd = pageGroupCurrent * 10;
	
	if(pageGroupEnd > pageEnd){
		pageGroupEnd = pageEnd;
	}
	
	pageStartNum = total - pageStart;
	List<ProductDTO> prodlist = dao.selectProducts(type,pageStart);
%>
<div id="sub">
    <div><img src="../images/sub_top_tit2.png" alt="MARKET"></div>
    <section class="market">
        <aside>
            <img src="../images/sub_aside_cate2_tit.png" alt="장보기"/>

            <ul class="lnb">
                <li class="on"><a href="./market.jsp">장보기</a></li>
            </ul>
        </aside>
        <article class="list">
            <nav>
                <img src="../images/sub_nav_tit_cate2_tit1.png" alt="장보기"/>
                <p>
                    HOME > 장보기 > <em>장보기</em>
                </p>
            </nav>
			
				 <%
				 
				 %>
			
	
            <!-- 내용 시작 -->
            <p class="sort">
                <a href="/FarmStory/market/list.jsp?type=null&pg=1" class=<%=type == null?"on":""%>>전체[<%=total %>] |</a>
                <a href="/FarmStory/market/list.jsp?type=1&pg=1" class=<%=parsetype == 1?"on":""%>>과일 |</a>
                <a href="/FarmStory/market/list.jsp?type=2&pg=1" class=<%=parsetype == 2?"on":""%>>야채 |</a>
                <a href="/FarmStory/market/list.jsp?type=3&pg=1" class=<%=parsetype == 3?"on":""%>>곡류</a>
            </p>
            <table border="0">
            	
            	<%for(ProductDTO list : prodlist){ %>
                <tr>
                    <td>
                        <a href="./view.jsp?pNo=<%=list.getPno()%>"><img src="/FarmStory/images/<%=list.getThumb1() %>" alt="사과 500g"></a>
                    </td>
                    <td>
                    <%switch(list.getType()){
                    case 1: out.print("과일"); break;
                    case 2: out.print("야채"); break;
                    case 3: out.print("곡물"); break;
                    }%>
                    </td>
                    <td><a href="./view.jsp?pNo=<%=list.getPno()%>"><%=list.getpName() %></a></td>
                    <td><strong><%=list.getPrecieWithComma() %></strong>원</td>
                </tr>
                <%} %>
            </table>

            <p class="paging">
            	<%if(pageGroupStart > 1){ %>
                <a href="/FarmStory/market/list.jsp?pg=<%=pageStart-1%>&type=<%=type %>"" class="prev"><</a>
                <%} %>
                <%for(int i=pageGroupStart; i<=pageGroupEnd; i++){ %>
                <a href="/FarmStory/market/list.jsp?pg=<%=i%>&type=<%=type %>&page=<%=pageEnd %>" class="num <%=i == currentPage ?"on":"" %>">[<%=i %>]</a>
                <%} %>
                <%if(pageGroupEnd < pageEnd){ %>
                <a href="/FarmStory/market/list.jsp?pg=<%=pageGroupEnd + 1%>&type=<%=type %>" class="next">></a>
                <%} %>
            </p>

            <!-- 내용 끝 -->

        </article>
    </section>

</div>
<%@ include file="../_footer.jsp" %>