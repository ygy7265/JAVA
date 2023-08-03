/**
 * 
 */

  $(function(){
    	//ID Check
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
    				console.log(data);
    				if(data.result >= 1){
    					$('.resultId').css('color', 'red').text('Using in id Change Please..');
    				}
    				else{
    					$('.resultId').css('color', 'blue').text('Good ID!');
    				}
    			}
    		})
    	})
    	
    	//Signin
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
    	
    	//nickCheck
    	$('input[name=nick]').focusout(function(){
    		
    		const nick = $(this).val();
    		console.log(nick);
    		
    		const jsonData = { "nick" : nick};
    		$.get('/Jboard/user/checkNick.jsp',jsonData,function(data){
    			var result = parseInt(data.result);
    			console.log(data);
    			if(data.result >= 1){
    				$('.resultnick').css('color', 'red').text('Using in Nick Change Please..');
    			}else{
    				$('.resultnick').css('color','blue').text('Nice Nick!!');
    			}
    	});
    		
    		//email check..
    		const email = document.getElementsByName('email')[0];
    		email.onfocusout = function(){
    			
    			const email = this.value;
    			console.log('email = ' + email);
    			const xhr = new XMLHttpRequest();
    			xhr.open('GET','/Jboard/user/checkEmail.jsp?email=' + email);
    			xhr.send();
    			
    			xhr.onreadystatechange = function(){
    				
    				if(xhr.readyState == XMLHttpRequest.DONE){
    					if(xhr.status == 200){
    						const data = JSON.parse(xhr.response);
    						const mail = document.getElementById('resultemail');
    						console.log(mail);
    						if(data.result >= 1){
    		    				mail.innerText = "Using in mail Change Please..";
    		    				mail.style.color = 'red';
    		    			}else{
    		    				mail.innerText = "Nice email";
    		    				mail.style.color = 'blue';
    		    			}
    					}
    				}
    			}
    		}
    		
    		//hp check..
    		document.getElementsByName('hp')[0].addEventListener('focusout',function(){
    			
    			const url = '/Jboard/user/checkHp.jsp?hp='+this.value;
    			fetch(url)
    				.then(response => response.json())
    				.then(data => {
    					console.log(data);
    					const resultHp = document.getElementById('resultHp');
    					if(data.result >= 1){
    						resultHp.innerText = 'No';
    						resultHp.style.color = 'red';
    					}
    					else{
    						resultHp.innerText = "Yes";
    						resultHp.style.color = 'blue';
    					}
    				});
    		});
    		
    		
    	});
    });