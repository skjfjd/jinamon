package forClass;

public class MainClass {

	public static void main(String[] args) {
		/*
		 loop��  ��ȯ��
		 ������ ȸ����ŭ �ݺ��� �ϴ� ���
		 
		 for , while , do while
		 
		 for( �ʱ�ȭ ; ���� ; �����; ) {
		 	//ó��
		 for + if	 
		 	 
		 int num = 0 ;
		 num = num +1;
		 num++;
		 		
		 			 
		 for( �ʱ�ȭ(1) ; ���ǹ�(4)(7)(10);  �����(3)(6)(9)) {
		    
		    	ó��(2)(5)(8)
		   
		 }
		 (11) Ż��
		 */
		
		/*int i;
		
		for(i=0;  i<10; i++) {
			
			
		}
		System.out.println("i=" + i);
			
		int j;
		int num =0;
		
		for(j =1; j<=10; j++) {
			num = num+ j;
			
		}
		System.out.println("num : " + num);*/
		
		for(int i =0;  i< 10; i++) {    //���� �ȿ����� ��� ����  int ��� ���������� ���� �ȿ����� ��밡��
			//System.out.println(i);
			
		}

		int n;
		for(n = 0; n<10; n++) {
			//System.out.println(n);
		}
		for(int i= 10;  i>0; i--) {
		//	System.out.println("i : " + i);
		}
		
		for(int i = 0; i<10; i=i +2) {
		//	System.out.println("i : " + i );
		}
		
		int count = 0;
		for( ; count < 10;) {
		//	System.out.println("count : " + count);
			count++;
		}
		
		for(int i = 0 , j = 0;  i < 10;  i++ , j++) {
		//	System.out.println("i : " + i);
		//	System.out.println("j : "+ j);
	}
		
		//for�� �ȿ� for��
		
		// ������ 2���� ��� ���� ���϶�.
		int sum=0;
		for(int i = 2;  i<= 20; i = i + 2) {
		//	System.out.println("i : " + i);
			sum = sum +i;
		}
	//	System.out.println("�� : " +sum);
		
		sum = 0 ;
		int num2 = 2;
		for(int i= 0 ; i < 10; i++) {
			sum = sum + num2;
			num2 = num2 + 2;
			//System.out.println("�� : " + sum);
		}
		System.out.println("�� : " + sum);
		
		//2�� for��
		for(int i= 0; i< 10; i++) { //loop 10
			//System.out.println("i : " + i);             // 10 x 5  = 50 �� ���� ��
			
			for(int j = 0; j <5; j++) { //loop 5
			//System.out.println("\tj : " + j);
			//
		}
		
	}
}
}
