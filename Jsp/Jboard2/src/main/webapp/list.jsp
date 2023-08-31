<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="_header.jsp" %>
<script>
	const success = ${success};
	const list = ${list};
	console.log(list);
	
	if(success == 100){
		alert("글쓰기 성공!");
	}
	
</script>
        <main id="board">
            <section class="list">                
                <form action="#">
                    <input type="text" name="search" placeholder="제목 키워드, 글쓴이 검색">
                    <input type="submit" value="검색">
                </form>
                
                <table border="0">
                    <caption>글목록</caption>
                   
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>글쓴이</th>
                        <th>날짜</th>
                        <th>조회</th>
                    </tr>   
                   
                     <c:forEach var="article" items="${requestScope.list}" varStatus="loopStatus">                
                    <tr>
                    
                        <td>${pageStartNum - loopStatus.index}</td>
                        <td><a href="/Jboard2/view.do?no=${article.no}">${article.title}[3]</a></td>
                        <td>${article.writer}</td>
                        <td>${article.rdate}</td>
                        <td>${article.hit}</td>
                    </tr>
                     </c:forEach> 
                </table>

                <div class="page">
                	<c:if test="${pageGroupStart > 1}">
                    <a href="/Jboard2/list.do?pg=${pageGroupStart -1}" class="prev">이전</a>
                    </c:if>
                    <c:forEach var="i" begin="${pageGroupStart}" end="${pageGroupEnd}" step="1">
                    <a href="/Jboard2/list.do?pg=${i}" class="num ${currentPage == i?'current':''}">${i}</a>
                    </c:forEach>
                    <c:if test="${pageGroupEnd < lastPageNum}">
                    <a href="/Jboard2/list.do?pg=${pageGroupEnd + 1}" class="next">다음</a>
                    </c:if>
                </div>

                <a href="/Jboard2/writer.do" class="btn btnWrite">글쓰기</a>
                
            </section>
        </main>
<%@ include file="_footer.jsp" %>