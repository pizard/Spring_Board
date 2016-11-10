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
			String d = "�ȳ� ��9";
			  
			// �����ڵ� ���ڿ��� UTF-8 ĳ���� ����Ʈ�迭�� ��ȯ�Ͽ� ��ȯ
			byte[] utf8, utf9;
			utf8 = d.getBytes("UTF-8");
			// �����ڵ� ���ڿ��� EUC-KR ĳ���� ����Ʈ�迭�� ��ȯ�Ͽ� ��ȯ
			byte [] euckr = d.getBytes("EUC-KR");
			  
			// �翬�� �ٸ� ����Ʈ �迭�̹Ƿ� ����� �ٸ���.
			System.out.println("byte length > " + utf8.length); // byte length > 11
			System.out.println(utf8); // byte length > 11
			System.out.println("byte length > " + euckr.length); // byte length > 8
			System.out.println(euckr); // byte length > 8
			  
			// �Ǽ� �ڵ�.
			// UTF-8 ĳ���ͼ����� �迭�� ����Ʈ�迭�� EUC-KR�� �ؼ��� �� ����.
			System.out.println(new String(utf8, "EUC-KR"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
	}	
}