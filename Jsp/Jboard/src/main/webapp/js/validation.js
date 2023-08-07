/**
 * 
 */
 let isUidOk = false;
    let isPassOk = false;
    let isNameOk = false;
    let isNickOk = false;
    let isEmailOk = false;
    let isHpOk = false;
    
    let reUid   = /^[a-z]+[a-z0-9]{5,19}$/g;
    let rePass  = /^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\(\\)\-_=+]).{5,16}$/;
    let reName  = /^[가-힣]{2,10}$/ 
    let reNick  = /^[a-zA-Zㄱ-힣0-9][a-zA-Zㄱ-힣0-9]*$/;
    let reEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
    let reHp    = /^01(?:0|1|[6-9])-(?:\d{4})-\d{4}$/;
    $(function(){
    	//ID Check
    	$('input[name=uid]').keydown(function(){
    		$('.resultId').text('');
    		isUidOk = false;
    	});
    	//Password Check
    	$('input[name=pass2]').focusout(function(){
    		
    		const pass1 = $('input[name=pass]').val();
    		const pass2 = $('input[name=pass2]').val();
    		
    		if(pass1 == pass2){
    			isPassOk = true;
    			$('.resultpass').text('');
    			if(pass1.match(rePass)){
    				$('.resultpass').css('color','blue').text('Password OK');
        			
    			}else if(pass2 == ''){
    				$('.resultpass').text('');
    			}
    			else{
    				$('.resultpass').css('color','red').text('Password Error');
        			isPassOk = false;
    			}
    			
    			
    		}else{
    			$('.resultpass').css('color','red').text('Password not match');
    			isPassOk = false;
    		}
    	});
    	//Name Check
    	$('input[name=name]').focusout(function(){
    		const name = $(this).val();
    		if(!name.match(reName)){
    			$('.resultname').css('color','red').text('rule Violation');
    			isNameOk = false;
    		}else{
    			$('.resultname').css('color','blue').text('Good');
    			isNameOk = true;
    		}
    	});
    	//Nick Check
    	
    	//Email Check
    	
    	//Phone Check
    	
    	//final Test Check
    	$('#formuser').submit(function(e){
    		
    		
    		if(!isUidOk){
    			return false;
    		}
    		if(!isPassOk){
    			return false;
    		}
    		if(!isNameOk){
    			return false;
    		}
    		if(!isNickOk){
    			return false;
    		}
    		if(!isEmailOk){
    			return false;
    		}
    		if(!isHpOk){
    			return false;
    		}
    		return true;
    	});
    });