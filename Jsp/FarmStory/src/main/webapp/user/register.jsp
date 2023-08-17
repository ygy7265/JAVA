<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../_header.jsp" %>
        <div id="user">
          <section id="user" class="register">
           	<form id ='formuser'action="/FarmStory/Proc/Proc.jsp" method="post">
             <table border="1">
               <caption>Site UsingInformatin ADD</caption>
               <tr>
                   <td>ID</td>
                   <td>
                       <input type="text" name="uid" placeholder="ID ADD">
                       <button type = "button"id="btnCheck"><img src="../images/chk_id.gif" alt=""></button>
                       <span class="resultId"></span>
                   </td>
               </tr>
               <tr>
                   <td>PASSWORD</td>
                   <td>
                       <input type="password" name="pass" placeholder="PASSWORD ADD">
                   </td>
               </tr>
               <tr>
                   <td>PASSWORD CHECK</td>
                   <td>
                   		<input type="password" name="pass2" placeholder="PASSWORD CHECK">
                   		<span class="resultpass"></span>
                   </td>
               </tr>
             </table>
            <table border="1">
              <caption>Information ADD</caption>
              <tr>
                  <td>Name</td>
                  <td>
                      <input type="text" name="name"placeholder="Name Add">
                      <span class="resultname"></span>
                  </td>
              </tr>
              <tr>
                  <td>NickName</td>
                  <td>
                      <p>Only Korea,English,Number</p>
                      <input type="text" name="nick"placeholder="NickName Add">
                      <span class="resultNick"></span>
                  </td>
              </tr>
              <tr>
                  <td>E-Mail</td>
                  <td>
                  		<input  type="text" name="email"placeholder="E-Maii Add">
                  		<span id="resultemail"></span>
                  </td>
                   
              </tr>
              <tr>
                  <td>Phone</td>
                  <td><input type="text" name="hp"placeholder="including - Add ">
                  	<span id="resultHp"></span>
                  </td>
                  
              </tr>
              <tr>
                  <td>Address</td>
                  <td>
                      <div>
                          <input type="text" name="zip" placeholder="Home Number"/>
                          <button type="button" class="bthzip" onclick="zipcode()"><img src="../images/chk_post.gif" alt=""></button>
                      </div>
                      <div>
                          <input type="text" name="addr1" placeholder="Search Add">
                      </div>
                      <div>
                          <input type="text" name="addr2" placeholder="Detail Add">
                      </div>
                  </td>
              </tr>
            </table>
            <div>
              <a href="./login.jsp" class="btnCancel">Cancel</a>
          	  <input type="submit" class="btnjoin" value="SignIn">
        	</div>
      		</form>
      		</section>
        </div>
<%@ include file="../_footer.jsp" %>