<%@page import="DAO.TermsDAO"%>
<%@page import="DTO.TermsDTO"%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
<script type="text/javascript">	
	$(function(){
       	$('.next').click(function(e){
       		e.preventDefault();
       		if($("input[name = 'chk1']").is(':checked') && $("input[name = 'chk2']").is(':checked')){
     
       			location.href = "./register.jsp"
       		}
       		else{
       			alert("Check Please..");
       		}
       		
       	}) 
	});
	</script>
	<%
		TermsDAO dao = new TermsDAO();
		TermsDTO dto = dao.selectTerms();
	%>
        <div id="user">
         <section id="user" class="terms">
                <table>
                    <caption>Site Terms</caption>
                    <tr>
                        <td>
                            <textarea id = "text1" readonly><%=dto.getTerms1() %></textarea>
                            <p>
                                <label><input type="checkbox" name="chk1">Agree</label>
                            </p>
                        </td>
                    </tr>
                </table>
                <table>
                    <caption>User Information</caption>
                    <tr>
                        <td>
                            <textarea readonly><%=dto.getPrivacy() %></textarea>
                        <p>
                        <label><input type="checkbox" name ="chk2">Agree</label>
                        </p>
                    </td>
                </tr>
                </table>
                <div>
                    <a href="/FarmStory/user/login.jsp">Cancel</a>
                    <a href="./register.jsp" class = "next">Next</a>
                  
                </div>
            </section>
        </div>
<%@ include file="../_footer.jsp" %>