
public class IfClass {

	public static void main(String[] args) {

		/*
		  	����
		 	
		  -	���ǹ� 
		  		if
		  		else
		  		else if
		  	
		  		�� ������: &&(AND)  ||(OR)  !(NOT)
		  		���� :		>  <  >=  <= ==  !=  (�ε�ȣ)
		  		switch
		 		case
		 		break
		  - ��ȯ��
		 	
		  - ������ 
		 	����(���� ���� ����(true/false)) {
		 	     ó�� 
		 	}
		 if(number > 0) {
		   		ó��	
		 }
		 if (number >0  && number <=10  && number !=5) {
		 
		 }
		 
		 if(number  < 5) {
		 	ó��
		 }
		 if(number > 10) {
		 	ó��
		 }
		 
		 if( number <5 || number > 10 {
		 	ó��
		 }
		 if(���� 1) {  ����1 == true
		 	ó��1
		 } else { ����1==  false
		   	ó��2
		 }
		 
		 	���� �б�  n�� ��ŭ�� ����
		 if( ���� 1) {
		          ó��1
		 } else if(����2) {
		       ó��2
		 } else if (����3) {
		 	ó��3
		 } else( ���� 1 = ���� 2 = ���� 3 = false) {
		 	������ ó��
		 }
		   
		 
		 */
		
		int number = 6;
		
		if (number >5) {
			System.out.println("number�� 5���� ũ��");
			
		if(number >= 6) {
			System.out.println("number�� 6���� ũ�ų� ����");
			
			
		if(number == 6) {
			System.out.println("number�� 6�� ����");
			
			
		if(number !=5) {
			System.out.println("number�� 5�� �ƴϴ�");
			
			
		if(number >= 0  && number < 10) {
			System.out.println("number�� 0���� 9������ �� �Դϴ�");
			
		if(number <5  || number >10) {
			System.out.println("number�� 5���� �۰ų� 10���� ũ��"); // number = 6 �̶� ���� ���� ������ �ȵ�
		}	
		if(number > 10) {
			System.out.println("number�� 10���� ũ��");
		}else {
			System.out.println("number�� 10���� �۰ų� �����ϴ�");
		}
		
		if(number>10) System.out.println("number 10���� ũ��");
		else 		 System.out.println("number 10���� �۰ų� ����");
 		}
		//���� ������
		String str;
		str=(number > 10)?"number �� 10���� ũ��": "number�� 10���� �۴�";
		System.out.println(str);
		}
		
		//���� �б�
		number=85;
		
		if(number == 100) {
			System.out.println("100�� �Դϴ�.");
			
		}else if(number >= 90 && number <100) {
			System.out.println("90�� �̻� �Դϴ�");
		}else if(number >=80 && number <90) {
			System.out.println("80�� �̻� �Դϴ�");
		}else {
			System.out.println("80�� �̸� �Դϴ�.");
		}
		
		if(number ==100 ) {
			System.out.println("100�� �Դϴ�.");
		}else if(number >= 90) {
			System.out.println("90�� �̻� �Դϴ�");
		}else if(number >= 80) {
			System.out.println("80�� �̻� �Դϴ�");
		}else {
			System.out.println("80�� �̸� �Դϴ�.");
		}
		// ���ǹ� �� �� ���ǹ�
		if(number >= 80  && number <90) {
			if(number >= 85) {
				System.out.println("�հ��Դϴ�");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
			
		boolean b;
		
		b= false;
		
		if(b== false) {
			System.out.println("false �Դϴ�");
		}
		if(!b) {
			System.out.println("b == false �Դϴ�.");
		}
		if(b) {
			System.out.println("true �Դϴ�");
		}if(true) {
			
		}
		}
		
		}
		}
			
		}
			
			
			
		}
		
	}


