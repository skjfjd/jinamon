import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		/*
		 ������
		 
		 �����ؾߵ� �ݾ� : 3230��
		 �ڽ��� �ݾ� : 10000��
		�Ž��� �� : ���
		5000�� : ? ��
		1000�� : ? ��
		500�� : ? ��
		100�� " ? �� 
		50 �� : ? ��
		10��  : ? �� 
		 
		
		Scanner scan = new Scanner(System.in);
			int my = 10000;
		 int buy = 3230;
		 
		 int result = 6770;
		 
		 System.out.print("�ڽ��� �ݾ�:" );
		 	my = scan.nextInt(); 
			
					
		System.out.print("�����ؾߵ� �ݾ� : " );
		buy = scan.nextInt();
						
		System.out.print("�Ž�����:" );
		result = scan.nextInt();
		
		
		if(result == 6770) {
			System.out.println("�Ž������� �°� �޾ҽ��ϴ�.");
			
			System.out.println("5000�� :" + "1��");
			
			System.out.println("1000�� :" + "1��");
			System.out.println("500�� :" + "1��");
			System.out.println("100�� :" + "2��");
			System.out.println("50�� :" + "1��");
			System.out.println("10�� :" + "2��");
		}else if(result !=6770)  {
			System.out.println("�Ž������� �°� ���� �ʾҽ��ϴ�."); */
			
			//��  �ڵ�
		
		
		int mymoney; 			  // �ڽ��� �ݾ�
		int price; 	 			  // ���� �ݾ�
		int changemoney;		  // �Ž�����	
		
		
		mymoney = 10000;
		price = 3230;
		changemoney = mymoney - price;
		
		//5000 �� ��
		int m5000 = changemoney / 5000;
		//1000�� ��
		int m1000 = (changemoney % 5000) / 1000 ;
		//500 �� ��
		int m500 =  (changemoney % 1000) / 500 ;
		
		//100 �� �� 
		
		int m100 = (changemoney % 500)/ 100;
		
		//50  ����
		
		int m50 = (changemoney % 100) / 50;
		
		//10�� �� 
		
		int m10 = (changemoney % 50) / 10;
		
		System.out.println("�Ž�����: "+ changemoney);
		System.out.println("5000: " + m5000 + "��");
		System.out.println("1000: " + m1000+ "��");
		System.out.println("500: " + m500+ "��");
		System.out.println("100: " + m100+ "��");
		System.out.println("50: " + m50+"��");
		System.out.println("10: " + m10+  "��");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		}
		
		
		
		
		
		
		
	}


