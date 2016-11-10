package Sample;

import java.io.UnsupportedEncodingException;

public class Equal_Test {

	public static void main(String args[]){
/*		String a = "AAA";
		String b = a;
		String c = new String("AAA");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(a==b);				// T
		System.out.println(a.equals(b));		// T
		System.out.println(b==c);				// F
		System.out.println(b.equals(c));		// T
		System.out.println(c==a);				// F
		System.out.println(c.equals(a));		// T
*/		
		try {
			String d = "안녕 親9";
			  
			// 유니코드 문자열을 UTF-8 캐릭터 바이트배열로 변환하여 반환
			byte[] utf8, utf9;
			utf8 = d.getBytes("UTF-8");
			// 유니코드 문자열을 EUC-KR 캐릭터 바이트배열로 변환하여 반환
			byte [] euckr = d.getBytes("EUC-KR");
			  
			// 당연히 다른 바이트 배열이므로 사이즈가 다르다.
			System.out.println("byte length > " + utf8.length); // byte length > 11
			System.out.println(utf8); // byte length > 11
			System.out.println("byte length > " + euckr.length); // byte length > 8
			System.out.println(euckr); // byte length > 8
			  
			// 실수 코드.
			// UTF-8 캐릭터셋으로 배열된 바이트배열을 EUC-KR로 해석할 수 없다.
			System.out.println(new String(utf8, "EUC-KR"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}	
}