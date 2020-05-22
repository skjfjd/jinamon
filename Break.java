package breakClass;

public class Break {

	public static void main(String[] args) {

		/*
		  	break : 탈출 (loop:for , while ,do while)
		  		(return)
		  	단독 사용불가 하고   순환문 , switch와 같이 사용
		  	
		  	switch ( num){
		  		case 100:
		  		  처리
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
		System.out.println("탈출 후 ");
		
		
		
		char charArr[] = { 'A' , 'B' , 'C' , 'D' , 'E'};
		
		for(int i = 0; i<charArr.length; i++) {
			System.out.println(i + ":" + charArr[i]);
			
			if(charArr[i] == 'C') {
				System.out.println("C 문자를 찾았습니다.");
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
		
		// 1. 탈출 방법 : loop문에 갯수에 맞게 break 설정
			
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
		
		// 2. 탈출 방법  : 키워드를 사용(goto)
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