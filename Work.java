
public class Work {

	public static void main(String[] args) {
		
		int number;
		
		number = 5; // 0101
		
		number = number <<4 ; //0101 2����: 0101 0000  16���� : 80
		
		number = number <<5 ; //0101 2���� 1010 0000  16���� : 160
				
		number = number >>1 ; //0101 2���� 0000 0010 16���� : 2
		
		
		
		
		
		//2��
		
		
		int num1 , num2;
		
		num1 =128; // 2���� 1000 0000   16 :80
		num2 = 56; // 2���� 0011 1000   16 : 38

		System.out.printf("0x%x\n" , num1);
		System.out.printf("0x%x\n" , num2);
		//16������ �ٲ۴�
		
				
		num1 = (num1 & num2) | (num1 & num2); //0
			//	1000 0000
		    //  0011 1000    & �ϳ��� �ٸ� ���̸� 0
			//  0000 0000
		num2 = ~(num1 ^ num2); // 1011 1000
			//  1000 0000
			//  0011 1000
			//  0100 0111  		^ �� ( �ݴ��)
		    //  1011 1000  ������
		 	//	
		System.out.printf("0x%x\n",num1);
		System.out.printf("0x%x\n",num2);
		
		
		//3�� �ϳ��� ���� �Է� �ް� ���� �����ڸ�  ����Ͽ� ������� ���� ���� �Ǵ� �϶�
		
		String n = "10";
		
		n= (number < 5)?"����":"���";
		System.out.println("n= "+ n);
		
		
		//4 ��  �������� ����϶�
		
		//���� 0 ~ 99 ���� 1��
		
		int ju;
		ju = (int)(Math.random() *100);
		//System.out.println("ju : " + ju);
		
		//����  11 , 12 ,13 ,14 ,15 
		
		ju = (int)(Math.random() *5)  +11;
		//System.out.println("ju : " + ju );
		
		// ���� 1~ 45 ���� 1��
		
		ju = (int)(Math.random() *45)  +1;
		System.out.println("ju : " + ju );
		
		
		
		
		
	}

}
