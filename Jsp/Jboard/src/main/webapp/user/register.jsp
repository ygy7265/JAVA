<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Jboard::register</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.0/jquery.min.js"></script>
    <script type="text/javascript">
    $(function(){
    	$('#btnCheck').click(function(e){
    		e.preventDefault();
    		
    		const uid = $('input[name=uid]').val();
    		const jsonData = {
    				"uid" : uid
    		}
    		
    		$.ajax({
    			url:'/Jboard/user/checkUid.jsp',
    			type:'GET',
    			data: jsonData,
    			dataType:'json',
    			success: function(data){
    				if(data.result >= 1){
    					$('.resultId').css('color', 'red').text('Using in id Change Please..');
    				}
    				else{
    					alert("Good ID!!");
    					$('.resultId')
    				}
    			}
    		})
    	})
    	$('.btnjoin').click(function(){
    		$.ajax({
    			url:'/Jboard/user/registerProc.jsp',
    			type:'GET',
    			dataType:'json',
    			success: function(data){
    				location.href = "/Jboard/user/register.jsp"
    			}
    		})
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
                <form action="/Jboard/user/registerProc.jsp" method="post">
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
                        <p>Only Korea,English</p>
                        <input type="text" name="nick"placeholder="NickName Add">
                    </td>
                </tr>
                <tr>
                    <td>E-Mail</td>
                    <td><input type="text" name="email"placeholder="E-Maii Add"></td>
                </tr>
                <tr>
                    <td>Phone</td>
                    <td><input type="text" name="hp"placeholder="including - Add "></td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td>
                        <div>
                            <input type="text" name="zip" placeholder="Home Number" readonly/>
                            <button class="bthzip"><img src="../images/chk_post.gif" alt=""></button>
                        </div>
                        <div>
                            <input type="text" name="addr2" placeholder="Search Add">
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