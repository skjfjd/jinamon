
public class While {

	public static void main(String[] args) {

		
		/*
		  while (��ȯ��)
		  do while
		  
		   ���� : 
		    ���� ����     //int i;
		    ���� �ʱ�ȭ   i = 0;
		     while (����){        while(i <5){
		     	ó��	                  System.out.println();
		       	���� ����                           i++;
		       	
		 	}
		 	
		 	���� ����   //int i;
		 	���� �ʱ�ȭ  i= 0;
		 	
		 do{                                do{
		   	ó��;                    System.out.println();
		   	�����					i++;					
		 } while(����);             }while(i<0;)
		 	
		 	
		 	
		 	for( ���� �ʱ�ȭ ; ����; �����) {
		 	   ó��
		 	}
		 */
		
		int w;
		
		w= 0;
		
		while(w < 10) {
			System.out.println("w = " + w); // if ���� ���� ���̹Ƿ� 0 �� ��¸� �ǰ� ���� ����
			w++;
		}
		System.out.println();
		int dw;
		
		dw= 0;
		
		do {
			System.out.println("dw : "+ dw);
			dw++;
		}while(dw<10);
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i : " + i);
			for (int j = 0; j < 5; j++) {
				System.out.println("j : " + j);
			}
		}
		
		
		int w1 , w2;
		
		w1 = w2 = 0;
		
		while(w1 < 10) {
			System.out.println("w1 = " + w1);
			
			w2=0;  						//���� while�� �ҋ� 2���� ����  �ʱ�ȭ�� �ؾ� ������ ��
			while(w2 < 5 ) {
				System.out.println("     w2 = "+ w2);
				w2++;
			}
			w1++;
		}
	/*	w1= 0;
		while(true) {    // while ���� ���� ����
			System.out.println("w1 : " +w);	
			w++; */
		}
				/*
				  
				1. initialize (�ʱ�ȭ)  -> init
				 
				2.  loop(��ȯ) 
				  while(true){							// ���α׷��� ���� !!
				  	Ż��
				  	1. �Է�
				  	2. ���
				  
				  }
				 
				 
			  3.	 Release(�ع�)
				 
				 */
		
	}


