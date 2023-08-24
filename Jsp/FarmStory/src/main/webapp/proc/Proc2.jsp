<%@page import="DTO.OrderDTO"%>
<%@page import="DAO.OrderDAO"%>
<%@page import="DTO.UserDTO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");

UserDTO UserSession =(UserDTO) session.getAttribute("sessUser");
//User
String delivery = request.getParameter("delivery");
String price = request.getParameter("price");
String count = request.getParameter("count");
String total = request.getParameter("total");
String product = request.getParameter("pNo");

OrderDAO dao = new OrderDAO();
OrderDTO dto = new OrderDTO();
dto.setOrderCount(count);
dto.setOrderProduct(product);
dto.setOrderTotal(total);
dto.setOrderDelivery(delivery);
dto.setOrderPrice(price);
dto.setOrderUser(UserSession.getUid());
dao.orderInsertProduct(dto);


response.sendRedirect("/FarmStory/market/list.jsp");
%>