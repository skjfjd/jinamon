
public class Wrapper {

	public static void main(String[] args) {

		/*
		 	Wrapper Class
		 	�Ϲ� �ڷ���(int, char)�� Ŭ����ȭ �Ѱ�
		 	collection : list map
		 	
		 	�Ϲ� �ڷ���        > class
		 	boolean       Boolean
		 	byte          Byte
		 	short		  Short
		 	int           Integer (�߿�)
		 	long	      Long
		 	float         Float
		 	double        Double (�߿�)
		 	
		 	char		  character
		 	char[]        String (*****) ���� �߿�
		 
		 
		 
		 
		 */
		
		 
		// ���� > ���ڿ�
		 // valueOf
		// 123+"";   123.456+"";     123.456 + ""  > "123.456"
		
		
		// ���ڿ� -> ����
		 String strNum = "234";
		 int cNum =Integer.parseInt(strNum);
		 System.out.println("cNum : " + (cNum+1));
		 
		 String dstrNum = "123.456";
		 double dNum =Double.parseDouble(dstrNum);
		 System.out.println("dNum : " + (dNum + 1.1));
		
		 //toString(); > ���ڿ��� �������ش� > valueOf()
		 
		 Double dou = 235.789;
		 Double dou1 = new Double("345.678");
		 
		 
				 
		 //10���� > 2����
		 int n10 = 12;
		 String n2 =Integer.toBinaryString(n10);
		 System.out.println("n2  :" + n2);
		 
		 n2 = "11001010";
		 
		 //2���� > 10����
		 n10 =Integer.parseInt(n2, 2);
		 System.out.println("n10 : " + n10);
		 
		 // 10���� > 16����
		 n10 = 12;
		 String n16 = Integer.toHexString(n10);
		 System.out.println("n16 : "+ n16);
		  
		 
		 
		 //16���� > 10����
		n16 =Integer.toOctalString(n10);
		System.out.println(n16);
		
	
	}
	
	

}
