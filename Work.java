
public class Work {

	public static void main(String[] args) {
		
		int number;
		
		number = 5; // 0101
		
		number = number <<4 ; //0101 2진법: 0101 0000  16진법 : 80
		
		number = number <<5 ; //0101 2진법 1010 0000  16진법 : 160
				
		number = number >>1 ; //0101 2진법 0000 0010 16진법 : 2
		
		
		
		
		
		//2번
		
		
		int num1 , num2;
		
		num1 =128; // 2진수 1000 0000   16 :80
		num2 = 56; // 2진수 0011 1000   16 : 38

		System.out.printf("0x%x\n" , num1);
		System.out.printf("0x%x\n" , num2);
		//16진수로 바꾼다
		
				
		num1 = (num1 & num2) | (num1 & num2); //0
			//	1000 0000
		    //  0011 1000    & 하나라도 다른 값이면 0
			//  0000 0000
		num2 = ~(num1 ^ num2); // 1011 1000
			//  1000 0000
			//  0011 1000
			//  0100 0111  		^ 값 ( 반대로)
		    //  1011 1000  최종값
		 	//	
		System.out.printf("0x%x\n",num1);
		System.out.printf("0x%x\n",num2);
		
		
		//3번 하나의 수를 입력 받고 삼항 연산자를  사용하여 양수인지 음수 인지 판단 하라
		
		String n = "10";
		
		n= (number < 5)?"음수":"양수";
		System.out.println("n= "+ n);
		
		
		//4 번  랜덤수를 취득하라
		
		//범위 0 ~ 99 개수 1개
		
		int ju;
		ju = (int)(Math.random() *100);
		//System.out.println("ju : " + ju);
		
		//범위  11 , 12 ,13 ,14 ,15 
		
		ju = (int)(Math.random() *5)  +11;
		//System.out.println("ju : " + ju );
		
		// 범위 1~ 45 개수 1개
		
		ju = (int)(Math.random() *45)  +1;
		System.out.println("ju : " + ju );
		
		
		
		
		
	}

}
