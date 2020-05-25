
public class Wrapper {

	public static void main(String[] args) {

		/*
		 	Wrapper Class
		 	일반 자료형(int, char)를 클래스화 한것
		 	collection : list map
		 	
		 	일반 자료형        > class
		 	boolean       Boolean
		 	byte          Byte
		 	short		  Short
		 	int           Integer (중요)
		 	long	      Long
		 	float         Float
		 	double        Double (중요)
		 	
		 	char		  character
		 	char[]        String (*****) 아주 중요
		 
		 
		 
		 
		 */
		
		 
		// 숫자 > 문자열
		 // valueOf
		// 123+"";   123.456+"";     123.456 + ""  > "123.456"
		
		
		// 문자열 -> 숫자
		 String strNum = "234";
		 int cNum =Integer.parseInt(strNum);
		 System.out.println("cNum : " + (cNum+1));
		 
		 String dstrNum = "123.456";
		 double dNum =Double.parseDouble(dstrNum);
		 System.out.println("dNum : " + (dNum + 1.1));
		
		 //toString(); > 문자열로 변경해준다 > valueOf()
		 
		 Double dou = 235.789;
		 Double dou1 = new Double("345.678");
		 
		 
				 
		 //10진수 > 2진수
		 int n10 = 12;
		 String n2 =Integer.toBinaryString(n10);
		 System.out.println("n2  :" + n2);
		 
		 n2 = "11001010";
		 
		 //2진수 > 10진수
		 n10 =Integer.parseInt(n2, 2);
		 System.out.println("n10 : " + n10);
		 
		 // 10진수 > 16진수
		 n10 = 12;
		 String n16 = Integer.toHexString(n10);
		 System.out.println("n16 : "+ n16);
		  
		 
		 
		 //16진수 > 10진수
		n16 =Integer.toOctalString(n10);
		System.out.println(n16);
		
	
	}
	
	

}
