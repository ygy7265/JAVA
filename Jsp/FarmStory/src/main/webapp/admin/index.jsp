<%@page import="DTO.ProductDTO"%>
<%@page import="DAO.ProductDAO"%>
<%@page import="java.util.List"%>
<%@page import="DAO.UserDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_header.jsp" %>
<%@ include file="./_aside.jsp" %> 
<%
	UserDAO dao = UserDAO.getInstance();
	ProductDAO pdao = new ProductDAO();
	List<UserDTO> userdto = dao.UesrList();
	List<ProductDTO> proddto = pdao.selectProducts();
	
	
%>      
<section>
    <nav>
        <h3>관리자 메인</h3>
    </nav>

    <article>
        <h3>
            <a href="#">상품현황</a>
            <a href="#" class="more">+ 더보기</a>
        </h3>
        <table border="0">
            <tr>
                <th>상품번호</th>
                <th>상품명</th>
                <th>구분</th>
                <th>가격</th>
                <th>재고</th>
                <th>등록일</th>
            </tr>
            <%for(ProductDTO dto : proddto){ %>
            <tr>
                <td><%=dto.getPno() %></td>
                <td><%=dto.getpName() %></td>
                <td>
                <%switch(dto.getType()){
                case 1:%>
                과일
                <% break;
                case 2:
                %>
                야채
                <%break;
                case 3:
                %>
                기타
                <%break; }%>
                </td>
                <td><%=dto.getPrice() %></td>
                <td><%=dto.getStock() %></td>
                <td><%=dto.getRdate() %></td>
             <%} %>                      
        </table>
    </article>

    <article>
        <h3>
            <a href="#">주문현황</a>
            <a href="#" class="more">+ 더보기</a>
        </h3>
        <table border="0">
            <tr>
                <th>주문번호</th>
                <th>상품명</th>
                <th>판매가격</th>
                <th>수량</th>
                <th>배송비</th>
                <th>합계</th>
                <th>주문자</th>
                <th>주문일</th>
            </tr>
            <tr>
                <td>1011</td>
                <td>사과 500g</td>
                <td>4,000원</td>
                <td>2개</td>
                <td>3,000원</td>
                <td>8,000원</td>
                <td>홍길동</td>
                <td>2023-01-01</td>
            </tr>
            <tr>
                <td>1011</td>
                <td>사과 500g</td>
                <td>4,000원</td>
                <td>2개</td>
                <td>3,000원</td>
                <td>8,000원</td>
                <td>홍길동</td>
                <td>2023-01-01</td>
            </tr>
            <tr>
                <td>1011</td>
                <td>사과 500g</td>
                <td>4,000원</td>
                <td>2개</td>
                <td>3,000원</td>
                <td>8,000원</td>
                <td>홍길동</td>
                <td>2023-01-01</td>
            </tr>
        </table>
    </article>
    <article>
        <h3>
            <a href="#">회원현황</a>
            <a href="#" class="more">+ 더보기</a>
        </h3>
        <table border="0">
            <tr>
                <th>회원아이디</th>
                <th>이름</th>
                <th>닉네임</th>
                <th>휴대폰</th>
                <th>이메일</th>
                <th>등급</th>
                <th>회원가입일</th>
            </tr>
            
            <%for(UserDTO list : userdto){ %>
            <tr>
                <td><%=list.getUid() %></td>
                <td><%=list.getName() %></td>
                <td><%=list.getNick() %></td>
                <td><%=list.getHp() %></td>
                <td><%=list.getEmail() %></td>
                <td><%=list.getRole() %></td>
                <td><%=list.getRegDate() %></td>
            </tr>
             <%} %>                 
        </table>
    </article>
</section>
</main>
 <%@ include file="./_footer.jsp" %>