package sub06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * JAVAÁ¤±Ô½Ä ½Ç½À
 */
public class RegularExpressionTest {

	public static void main(String[] args) {
		// Á¤±ÔÇ¥Çö½Ä
		String strtPatt = "a[a-z]*";
		
		boolean r1 = Pattern.matches(strtPatt, "apple");
		boolean r2 = Pattern.matches(strtPatt, "banana");
		
		System.out.println("apple =" + r1);
		System.out.println("banana = " + r2);
		
		//Á¤±ÔÇ¥Çö½Ä ÆĞÅÏ
		String[] patterns = {
								"[0-9]+", //¼ı°³1°³ÀÌ»ó
								"1[0-9]]*", //1·Î½ÃÀÛÇÏ´Â¼ıÀÚ 0°³ÀÌ»ó
								"^[0-9]", //¼ıÀÚ·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ
								"[^0-9]", //¼ıÀÚ°¡¾Æ´Ñ¹®ÀÚ
								".",//¹®ÀÚ1°³
								"[a-z]?", // ¿µ¾î¼Ò¹®ÀÚ1°³
								"[a-z]*", //¿µ¾î¼Ò¹®ÀÚ 0°³ÀÌ»ó
								"[a-z]+", //¿µ¾î¼Ò¹®ÀÚ 1°³ÀÌ»ó
								"[A-Z]*", //¿µ¾î ´ë¹®ÀÚ 0°³ÀÌ»ó
								"[°¡-ÆR]+", //ÇÑ±Û 1ÀÚÀÌ»ó
								"^[0-9]+[°¡-ÆR]+", //¼ıÀÚ+ÇÑ±Û 1ÀÚÀÌ»ó
								"^[0-9a-z]+", //¼ıÀÚ+¿µ¾î 1ÀÚÀÌ»ó
								"^[A-z]+", //´ë¹®ÀÚ¿µ¾î+¼Ò¹®ÀÚ1ÀÚÀÌ»ó
								"\\s", //°ø¹é
								"\\S", //°ø¹éÀÌ ¾Æ´Ñ¹®ÀÚ
								"\\d", //¼ıÀÚ
								"\\w", //¼ıÀÚ¿Í ¹®ÀÚ
								"\\W", //Æ¯¼ö¹®ÀÚ 
		};
		String[] words = {"apple", "123ÇÑ±Û", "123456", "011","hello","È«±æµ¿","1","apple","APPLE","Banana","#$%"};
		for(String word : words) {
			System.out.print(word + "¹®ÀÚ¿Í ÀÏÄ¡ÇÏ´Â ÆĞÅÏ : ");
			for(String pattern : patterns) {
				boolean result = Pattern.matches(pattern,word);
				
				if(result) {
					System.out.println(pattern + ", ");
				}
			}
			System.out.println(" ");
		}
		
		//ÀÚÁÖ »ç¿ëÇÏ´Â Á¤±Ô Ç¥Çö½Ä
		String ptt1 = "^[a-zA-z0-9]*$";
		String ptt2 = "^[°¡-ÆR]*$";
		String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
		String ptt4 = "(\\w+)@(\\w+).(\\w+)";
		
		String str = "ÀÌ¸§:È«±æµ¿, ÈŞ´ëÆù:010-1234-1001,ÀÌ¸ŞÀÏ:hong@gmail.com";
		
		Pattern p1 = Pattern.compile(ptt3);
		Matcher m1 = p1.matcher(str);
		Pattern p2 = Pattern.compile(ptt4);
		Matcher m2 = p2.matcher(str);
		
		System.out.println("ÈŞ´ëÆùÁ¶È¸");
		
		while(m1.find()) {
			System.out.println(m1.group());
		}
		System.out.println("ÀÌ¸ŞÀÏ Á¶È¸");
		while(m2.find()) {
			System.out.println(m2.group());
		}
	}

}
