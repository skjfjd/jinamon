
public class StringClass {

	public static void main(String[] args) {

			/*
			 
			  String : wrapper class
			  			문자열 저장  편집 정보 취득
			  
			  
			 */
		
		String str;
		//class명 : String
		// str : Object(객체) , instance(주체) == class 변수
		
		str = "안녕하세요";
		
		System.out.println("str : " + str);
		
		
		String str1 = new String("하이");
	// String str1 = "하이"	
		String str2 = "반갑습니다";
		
		//문자열을 결합
		String str3;
		
		str3 = str1 + str2;
		System.out.println("str : " + str3);
		
		
		String str4;
		str4 = str1.concat(str2);
		System.out.println("str4 :" + str4);
		
		// 비교 함수  equals
		
		String str5 = "hello";
		String str6 = "hell";
		
		str6 = str6 + "o";
		
		if(str5 == str6) {
			System.out.println("str5와 str6는 같은 문자열 입니다.");
		}else {
			System.out.println("str5와 str6는 다른 문자열 입니다.");
		}
		
		boolean b = str5.equals(str6);
		if(b == true) {
			System.out.println("str5와 str6는 같은 문자열 입니다.");
		}
		// indexOf : 지정 문자 의 위치  앞에서부터 찾기
		// lastIndexOF  뒤에서부터 찾기
		
		char cArr[] = { 'a' , 'b' , 'c' };
		
		String str7= "abcdefghabcd";
		int n;
		n=str7.indexOf("d");  //indexOf  위치를 리턴
		System.out.println("n :" + n);
		n =str7.lastIndexOf("d");
		System.out.println("n :" + n);
			
		//길이 length -> 길이
		
		int Array[] = { 1, 2, 3, 4, 5,} ;
		System.out.println("배열의 길이 : "+ Array.length);
		
		int len = str7.length();
		System.out.println("문자열의 길이 : "+ len);
		
		//replace (수정)
		
		String str8 ="A*B**C";     // replace 연산 기호 바꿀수가 있음
		String repStr = str8.replace("*", "+");
		System.out.println("repStr : " +repStr);
		
		//split  
		
		/*
		  
		 split : token을 활용해서 문자열을 자른다.
		 
		  aaa-bbb-ccc    -: 토큰
		  
		  저장매체 : 파일 database(oracle)
		  
		  홍길동-24-2001/10/12-180
		 */
		
		String str9 = "홍길동 -24-2001/10/12-180.2";
		String splitArr[] = str9.split("-");
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);
		}
		// 범위를 통해서 문자열을 취득 subString
		
		String str10 = "abcdefghij";
		String substr = str10.substring(0, 4);
		System.out.println("substr : " + substr);
		
	substr = str10.substring(4);
	System.out.println("substr : " + substr);
	
	// toUpperCase  모든 문자를 대문자로
	// toLowerCase  모든 문자를 소문자로
	// Abcd == ABCD , abcd
	String str11 = "abcDEF";
	String upStr = str11.toUpperCase();
	System.out.println("upStr : " + upStr);
	
	String lowStr = str11.toLowerCase();
	System.out.println("lowStr :" + lowStr);
	
	// trim 앞 뒤의 공백을 없애주는 함수
		String str12 = "               java c언어 python      ";
		String trimStr = str12.trim();
		System.out.println("trimStr :" + trimStr +"----");
		
		
		// valueOf
		/*
		  문자열 > 숫자    "123" > 123
		  숫자 > 문자열   123 > "123"
		  
		  
		  숫자 > 문자열
		  	 
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
		
		
		// contains 탐색
		
		String str13 = "서울시 강남구 ";
		boolean b1 = str13.contains("서울");
		System.out.println("b1 : " + b1);
		
		
		//charAt   array[2] > 
		//String str = "hello"; == charArray[5]
		String str14 = "가나다라마";
		char ch = str14.charAt(3);
		System.out.println("ch :" + ch);
		
		
		
		
	}
	
	

}
