<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::register</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
    
    <!-- Check -->
    <script type="text/javascript" src="/Jboard/js/checkUser.js"></script>
    
    <!-- zip -->
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script type="text/javascript" src="/Jboard/js/zipcode.js"></script>
    
    <script type="text/javascript">
    
    let isUidOk = false;
    let isPassOk = false;
    let isNameOk = false;
    let isEmailOk = false;
    let isHpOk = false;
    $(function(){
    	//ID Check
    	//Password Check
    	//Name Check
    	//Nick Check
    	//Email Check
    	//Phone Check
    	
    	//final Test Check
    	$('#formuser').submit(function(e){
    		
    		
    		if(!isUidOk){
    			return false;
    		}
    		else if(!isPassOk){
    			return false;
    		}
    		else if(!isNameOk){
    			return false;
    		}
    		else if(!isNickOk){
    			return false;
    		}
    		else if(!isEmailOk){
    			return false;
    		}
    		else if(!isHpOk){
    			return false;
    		}
    	
    	});
    });
    </script>
</head>
<body>
    <div id="container">
        <header>
            <h3>Board System v1.0</h3>
        </header>
        <main>
          <section id="user" class="register">
           	<form id ='formuser'action="/Jboard/user/registerProc.jsp" method="post">
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
                       <input type="password" name="pass1" placeholder="PASSWORD ADD">
                   </td>
               </tr>
               <tr>
                   <td>PASSWORD CHECK</td>
                   <td><input type="password" name="pass2" placeholder="PASSWORD CHECK"></td>
               </tr>
             </table>
            <table border="1">
              <caption>Information ADD</caption>
              <tr>
                  <td>Name</td>
                  <td>
                      <input type="text" name="name"placeholder="Name Add">
                  </td>
              </tr>
              <tr>
                  <td>NickName</td>
                  <td>
                      <p>Only Korea,English,Number</p>
                      <input type="text" name="nick"placeholder="NickName Add">
                      <span class="resultnick"></span>
                  </td>
              </tr>
              <tr>
                  <td>E-Mail</td>
                  <td><input type="text" name="email"placeholder="E-Maii Add">
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
                          <input type="text" name="zip" placeholder="Home Number" readonly/>
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
              <a href="./login.html" class="btnCancel">Cancel</a>
          	  <input type="submit" class="btnjoin" value="SignIn">
        	</div>
      		</form>
      		</section>
     	</main>
        <footer>
            <p>ⓒcopyright YoonGyeongYeop.com</p>
        </footer>
    </div>
</body>
</html>