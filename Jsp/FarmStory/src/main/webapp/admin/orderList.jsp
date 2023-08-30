<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="DTO.OrderDTO"%>
<%@page import="DAO.OrderDAO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>

<%
	OrderDAO dao = new OrderDAO();
	List<OrderDTO> list = new ArrayList<>(); 
	list = dao.orderSelectProducts();
%>

<script>

</script>

<%@ include file="./_header.jsp" %>
<%@ include file="./_aside.jsp" %>
            <section id="orderList">
                <nav>
                    <h3>주문목록</h3>
                </nav>

                <article>

                    <table border="0">
                        <tr>
                            <th><input type="checkbox" name="all"/></th>
                            <th>주문번호</th>
                            <th>상품명</th>
                            <th>판매가격</th>
                            <th>수량</th>
                            <th>배송비</th>
                            <th>합계</th>
                            <th>주문자</th>
                            <th>주문일</th>
                            <th>확인</th>
                        </tr>
                      
                        <%for(OrderDTO orderlist : list){ 
                        	
                        %>
                        <tr>
                            <td><input type="checkbox" name=""/></td>
                            <td><%=orderlist.getOrderNo() %></td>
                            <td><%=orderlist.getOrderpName() %></td>                            
                            <td><%=orderlist.getOrderPrice() %>원</td>
                            <td><%=orderlist.getOrderCount() %></td>
                            <td><%=orderlist.getOrderDelivery() %>원</td>
                            <td><%=orderlist.getOrderTotal() %>원</td>
                            <td><%=orderlist.getOrderUser() %></td>
                            <td><%=orderlist.getOrderDate() %></td>
                            <td>
                            <a href="#" class="showPopup"                      
                            data-order=<%=orderlist %>
                            data-thumb=<%=orderlist.getThumb1() %>
                            >[상세확인]</a>
                            </td>
                            
                        </tr>
                        <% System.out.println(orderlist);} %>
                    </table>

                    <p>
                        <a href="#" class="orderDelete">선택삭제</a>                        
                    </p>
                    
                    <p class="paging">
                        <a href="#"><</a>
                        <a href="#" class="on">[1]</a>
                        <a href="#">[2]</a>
                        <a href="#">[3]</a>
                        <a href="#">[4]</a>
                        <a href="#">[5]</a>
                        <a href="#">></a>
                    </p>
                </article>
            </section>
        </main>
        <div id="orderPopup">
            <section>
                <nav>
                    <h1>상세주문내역</h1>
                    <button class="btnClose">닫기</button>
                </nav>
				<script>
				$(function(){
				    $('.showPopup').click(function(e){
				    
				    	var orderlist = $(this).data('order');
				    	var thumb = $(this).data('thumb');
				    	
				    	var jsonlist = JSON.parse(orderlist+'"}');
						console.log("orderlist : "+orderlist);
						console.log(jsonlist);
						console.log("jsonlist : "+jsonlist.orderpName);
						
				    	$('.num').text(jsonlist.orderNo);
				    	$('.name').text(jsonlist.orderProduct);
				    	$('.price').text(jsonlist.orderPrice);
				    	$('.count').text(jsonlist.orderNo);
				    	$('.delivery').text(jsonlist.orderDelivery);
				    	$('.total').text(jsonlist.orderTotal);
				    	$('.user').text(jsonlist.orderUser);
				    	$('.img').attr("src","/FarmStory/images/"+thumb);
				 
				        e.preventDefault();

				        $('#orderPopup').show();
				    });

				    $('#orderPopup .btnClose').click(function(){
				        $('#orderPopup').hide();
				    });

				});
				</script>
				
				
                <article>  
                    <h3>기본정보</h3>
                    <table border="0">
                  
                        <tr>
                            <td rowspan="7" class="thumb"><img class="img" alt="사과 500g"></td>
                            <td>상품번호</td>
                            <td class="num"></td>
                        </tr>
                        <tr>
                            <td>상품명</td>
                            <td class="name"></td>
                        </tr>
                        <tr>
                            <td>판매가격</td>
                            <td class="price">원</td>
                        </tr>
                        <tr>
                            <td>수량</td>
                            <td class="count">개</td>
                        </tr>
                        <tr>
                            <td>배송비</td>
                            <td class="delivery">원</td>
                        </tr>
                        <tr>
                            <td>합계</td>
                            <td class="total">원</td>
                        </tr>
                        <tr>
                            <td>주문자</td>
                            <td class="user"></td>
                        </tr> 
                                        
                    </table>

                    <h3>배송지 정보</h3>
                    <table border="0">
                        <tr>
                            <td>받는분</td>
                            <td>홍길동</td>
                        </tr>
                        <tr>
                            <td>배송지</td>
                            <td>부산광역시 부산진구 대연동 120 루미너스 10층</td>
                        </tr>
                    </table>
                </article>
            </section>
        </div>
 <%@ include file="./_footer.jsp"%>