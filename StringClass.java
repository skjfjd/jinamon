
public class StringClass {

	public static void main(String[] args) {

			/*
			 
			  String : wrapper class
			  			���ڿ� ����  ���� ���� ���
			  
			  
			 */
		
		String str;
		//class�� : String
		// str : Object(��ü) , instance(��ü) == class ����
		
		str = "�ȳ��ϼ���";
		
		System.out.println("str : " + str);
		
		
		String str1 = new String("����");
	// String str1 = "����"	
		String str2 = "�ݰ����ϴ�";
		
		//���ڿ��� ����
		String str3;
		
		str3 = str1 + str2;
		System.out.println("str : " + str3);
		
		
		String str4;
		str4 = str1.concat(str2);
		System.out.println("str4 :" + str4);
		
		// �� �Լ�  equals
		
		String str5 = "hello";
		String str6 = "hell";
		
		str6 = str6 + "o";
		
		if(str5 == str6) {
			System.out.println("str5�� str6�� ���� ���ڿ� �Դϴ�.");
		}else {
			System.out.println("str5�� str6�� �ٸ� ���ڿ� �Դϴ�.");
		}
		
		boolean b = str5.equals(str6);
		if(b == true) {
			System.out.println("str5�� str6�� ���� ���ڿ� �Դϴ�.");
		}
		// indexOf : ���� ���� �� ��ġ  �տ������� ã��
		// lastIndexOF  �ڿ������� ã��
		
		char cArr[] = { 'a' , 'b' , 'c' };
		
		String str7= "abcdefghabcd";
		int n;
		n=str7.indexOf("d");  //indexOf  ��ġ�� ����
		System.out.println("n :" + n);
		n =str7.lastIndexOf("d");
		System.out.println("n :" + n);
			
		//���� length -> ����
		
		int Array[] = { 1, 2, 3, 4, 5,} ;
		System.out.println("�迭�� ���� : "+ Array.length);
		
		int len = str7.length();
		System.out.println("���ڿ��� ���� : "+ len);
		
		//replace (����)
		
		String str8 ="A*B**C";     // replace ���� ��ȣ �ٲܼ��� ����
		String repStr = str8.replace("*", "+");
		System.out.println("repStr : " +repStr);
		
		//split  
		
		/*
		  
		 split : token�� Ȱ���ؼ� ���ڿ��� �ڸ���.
		 
		  aaa-bbb-ccc    -: ��ū
		  
		  �����ü : ���� database(oracle)
		  
		  ȫ�浿-24-2001/10/12-180
		 */
		
		String str9 = "ȫ�浿 -24-2001/10/12-180.2";
		String splitArr[] = str9.split("-");
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		// ������ ���ؼ� ���ڿ��� ��� subString
		
		String str10 = "abcdefghij";
		String substr = str10.substring(0, 4);
		System.out.println("substr : " + substr);
		
	substr = str10.substring(4);
	System.out.println("substr : " + substr);
	
	// toUpperCase  ��� ���ڸ� �빮�ڷ�
	// toLowerCase  ��� ���ڸ� �ҹ��ڷ�
	// Abcd == ABCD , abcd
	String str11 = "abcDEF";
	String upStr = str11.toUpperCase();
	System.out.println("upStr : " + upStr);
	
	String lowStr = str11.toLowerCase();
	System.out.println("lowStr :" + lowStr);
	
	// trim �� ���� ������ �����ִ� �Լ�
		String str12 = "               java c��� python      ";
		String trimStr = str12.trim();
		System.out.println("trimStr :" + trimStr +"----");
		
		
		// valueOf
		/*
		  ���ڿ� > ����    "123" > 123
		  ���� > ���ڿ�   123 > "123"
		  
		  
		  ���� > ���ڿ�
		  	 
		 */
		
		int num = 123;
		long lo = 1234L;
		double d = 123.4567;
		
		String is =String.valueOf(num);
		String ls =String.valueOf(lo);
		String ds =String.valueOf(d);
		
		System.out.println(is + ls +ds);
		
		System.out.println(is + " " + ls  + " " + ds);
		
		int number =234;
		String numStr = number + " ";
		
		
		// contains Ž��
		
		String str13 = "����� ������ ";
		boolean b1 = str13.contains("����");
		System.out.println("b1 : " + b1);
		
		
		//charAt   array[2] > 
		//String str = "hello"; == charArray[5]
		String str14 = "�����ٶ�";
		char ch = str14.charAt(3);
		System.out.println("ch :" + ch);
		
		
		
		
	}
	
	

}
