package breakClass;

public class Break {

	public static void main(String[] args) {

		/*
		  	break : Ż�� (loop:for , while ,do while)
		  		(return)
		  	�ܵ� ���Ұ� �ϰ�   ��ȯ�� , switch�� ���� ���
		  	
		  	switch ( num){
		  		case 100:
		  		  ó��
		  		  break;
		  		  }
		  		  
		 for(int i = 0; i < 10; i++ ) {
		 		if(i==5){
		 	  	break;
		 		}
		 
		 }
		 */
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("i : " + i);
			if(i==4) {
				break;
			}
						
		}
		System.out.println("Ż�� �� ");
		
		
		
		char charArr[] = { 'A' , 'B' , 'C' , 'D' , 'E'};
		
		for(int i = 0; i<charArr.length; i++) {
			System.out.println(i + ":" + charArr[i]);
			
			if(charArr[i] == 'C') {
				System.out.println("C ���ڸ� ã�ҽ��ϴ�.");
				break;
			}
		}
		
		for(int i =0; i<10; i++) {
			
			System.out.println("i : " + i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("  j : " + j);
				
				if(i ==4 && j ==3) {
					break;
				}
			}
			
		}
		
		// 1. Ż�� ��� : loop���� ������ �°� break ����
			
		boolean b = false;
		for(int i =0; i<10; i++) {
			
			System.out.println("i : " + i);
			 
		for (int j = 0; j < 5; j++) {
			System.out.println("  j : " + j);
			
				if(i ==4 && j ==3) {
					b= true;
				}
				if(b == true) {
					break;
				}
				if(b== true) {
					break;
				}
			}
}
		
		// 2. Ż�� ���  : Ű���带 ���(goto)
		legend:	for(int i =0; i<10; i++) { 
			
			System.out.println("i : " + i);
			
			for (int j = 0; j < 5; j++) {
				System.out.println("  j : " + j);
				
				if(i ==2 && j ==1) {
					break legend;
				}
			}
			
	}

}
}