<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="./_header.jsp" %>
<script src="/Jboard2/js/validation.js"></script>
<script>
	$(function(){
		$('.btnNext').click(function(e){
				e.preventDefault();
				if(isEmailOk){
				$('#formPassChange').submit();
				}else{
					alert("이메일인증받아야함");
				}
		});
	});
</script>
        <main id="user">
            <section class="find findPassChange">
                <form id="formPassChange"action="/Jboard2/user/findPassChange.do" method="post">
                    <table border="0">
                    
                        <caption>비밀번호 변경</caption>                        
                        <tr>
                            <td>아이디</td>
                            <td>
 							<input type="hidden" name="uid" value="${uid}"/>                           
                            ${uid}</td>
                        </tr>
                        <tr>
                            <td>새 비밀번호</td>
                            <td>
                                <input type="password" name="pass1" placeholder="새 비밀번호 입력"/>
                            </td>
                        </tr>
                        <tr>
                            <td>새 비밀번호 확인</td>
                            <td>
                                <input type="password" name="pass2" placeholder="새 비밀번호 입력 확인"/>
                                <span class="passResult"></span>
                            </td>
                        </tr>
                    </table>                                        
                </form>
                
                <p>
                    비밀번호를 변경해 주세요.<br>
                    영문, 숫자, 특수문자를 사용하여 8자 이상 입력해 주세요.                    
                </p>

                <div>
                    <a href="/Jboard2/user/login.do" class="btn btnCancel">취소</a>
                    <a href="#" class="btn btnNext">다음</a>
                </div>
            </section>
        </main>
<%@ include file="./_footer.jsp" %>