	//상태변수선언
	let isUidOk = false;
	let isPassOk = false;
	let isNameOk = false;
	let isNickOk = false;
	let isEmailOk = false;
	let isHpOk = false;
	
	const reUid   = /^[a-z]+[a-z0-9]{4,19}$/g;
	const rePass  = /^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\(\\)\-_=+]).{5,16}$/;
	const reName  = /^[가-힣]{2,10}$/ 
	const reNick  = /^[a-zA-Zㄱ-힣0-9][a-zA-Zㄱ-힣0-9]*$/;
	const reEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
	const reHp    = /^01(?:0|1|[6-9])-(?:\d{4})-\d{4}$/;
	//유효성검사
	$(function(){
		$('input[name=uid]').keydown(function(){
			$('.uidResult').text('');
			isUidOk = false;
		});
		
		$('input[name=pass2]').focusout(function(){
			const pass1 = $('input[name=pass1]').val();
			const pass2 = $('input[name=pass2]').val();
			
			if(pass1 == pass2){
				
				if(pass2.match(rePass)){
					$('.passResult').css('color','Green').text('GOOD Password');
					isPassOk = true;
				}
				else{
					$('.passResult').css('color','red').text('No Password');
					isPassOk = false;
				}
				
			}else{
				$('.passResult').css('color','red').text('pass Word Check!');
				isPassOk = false;
			}
		});
	
	//아이디
	$('input[name=uid]').keydown(function(){
		$('.uidResult').text('');
		isUidOk = false;
	});
	
	//이름
	$('input[name=name]').focusout(function(){
		const name = $(this).val();
		
		if(name.match(reName)){
			$('.nameResult').text('');
			isNameOk = true;
		}else{
			$('.nameResult').css('color', 'red').text('유효한 이름이 아닙니다.');
			isNameOk = false;
		}
	});
	
	// 별명 검사
	$('input[name=nick]').keydown(function(){
		$('.nickResult').text('');
		isNickOk = false;
	});
	
	// 이메일 검사
	$('input[name=email]').keydown(function(){
		$('.resultEmail').text('');
		isEmailOk = false;
	});
	
	// 휴대폰 검사
	$('input[name=hp]').keydown(function(){
		$('.resultHp').text('');
		isHpOk = false;
	});
	
	//최종확인	
	$('#formUser').submit(function(){
		
		if(!isUidOk){
			alert('ID Check!');
			return false;
		}
		if(!isPassOk){
			alert('Pass Check!');
			return false;
		}
		if(!isNameOk){
			alert('Name Check!');
			return false;
		}
		if(!isNickOk){
			alert('Nick Check!');
			return false;
		}
		if(!isEmailOk){
			alert('Email Check!');
			return false;
		}
		if(!isHpOk){
			alert('Hp Check!');
			return false;
		}
		return true;
	});
});