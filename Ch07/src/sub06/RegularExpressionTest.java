package sub06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * JAVA정규식 실습
 */
public class RegularExpressionTest {

	public static void main(String[] args) {
		// 정규표현식
		String strtPatt = "a[a-z]*";
		
		boolean r1 = Pattern.matches(strtPatt, "apple");
		boolean r2 = Pattern.matches(strtPatt, "banana");
		
		System.out.println("apple =" + r1);
		System.out.println("banana = " + r2);
		
		//정규표현식 패턴
		String[] patterns = {
								"[0-9]+", //숫개1개이상
								"1[0-9]]*", //1로시작하는숫자 0개이상
								"^[0-9]", //숫자로 시작하는 문자
								"[^0-9]", //숫자가아닌문자
								".",//문자1개
								"[a-z]?", // 영어소문자1개
								"[a-z]*", //영어소문자 0개이상
								"[a-z]+", //영어소문자 1개이상
								"[A-Z]*", //영어 대문자 0개이상
								"[가-힣]+", //한글 1자이상
								"^[0-9]+[가-힣]+", //숫자+한글 1자이상
								"^[0-9a-z]+", //숫자+영어 1자이상
								"^[A-z]+", //대문자영어+소문자1자이상
								"\\s", //공백
								"\\S", //공백이 아닌문자
								"\\d", //숫자
								"\\w", //숫자와 문자
								"\\W", //특수문자 
		};
		String[] words = {"apple", "123한글", "123456", "011","hello","홍길동","1","apple","APPLE","Banana","#$%"};
		for(String word : words) {
			System.out.print(word + "문자와 일치하는 패턴 : ");
			for(String pattern : patterns) {
				boolean result = Pattern.matches(pattern,word);
				
				if(result) {
					System.out.println(pattern + ", ");
				}
			}
			System.out.println(" ");
		}
		
		//자주 사용하는 정규 표현식
		String ptt1 = "^[a-zA-z0-9]*$";
		String ptt2 = "^[가-힣]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";
		
		String str = "이름:홍길동, 휴대폰:010-1234-1001,이메일:hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		
		System.out.println("휴대폰조회");
		
		while(m1.find()) {
			System.out.println(m1.group());
		}
		System.out.println("이메일 조회");
		while(m2.find()) {
			System.out.println(m2.group());
		}
	}

}
