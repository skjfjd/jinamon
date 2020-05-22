
public class While {

	public static void main(String[] args) {

		
		/*
		  while (순환문)
		  do while
		  
		   형식 : 
		    변수 선언     //int i;
		    변수 초기화   i = 0;
		     while (조건){        while(i <5){
		     	처리	                  System.out.println();
		       	변수 연산                           i++;
		       	
		 	}
		 	
		 	변수 선언   //int i;
		 	변수 초기화  i= 0;
		 	
		 do{                                do{
		   	처리;                    System.out.println();
		   	연산식					i++;					
		 } while(조건);             }while(i<0;)
		 	
		 	
		 	
		 	for( 변수 초기화 ; 조건; 연산식) {
		 	   처리
		 	}
		 */
		
		int w;
		
		w= 0;
		
		while(w < 10) {
			System.out.println("w = " + w); // if 문을 쓰면 참이므로 0 만 출력만 되고 빠져 나감
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
			
			w2=0;  						//이중 while을 할떈 2번쨰 값을  초기화를 해야 실행이 됨
			while(w2 < 5 ) {
				System.out.println("     w2 = "+ w2);
				w2++;
			}
			w1++;
		}
	/*	w1= 0;
		while(true) {    // while 문의 무한 루프
			System.out.println("w1 : " +w);	
			w++; */
		}
				/*
				  
				1. initialize (초기화)  -> init
				 
				2.  loop(순환) 
				  while(true){							// 프로그램의 순서 !!
				  	탈출
				  	1. 입력
				  	2. 출력
				  
				  }
				 
				 
			  3.	 Release(해방)
				 
				 */
		
	}


