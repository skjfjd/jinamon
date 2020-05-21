
public class IfClass {

	public static void main(String[] args) {

		/*
		  	제어
		 	
		  -	조건문 
		  		if
		  		else
		  		else if
		  	
		  		논리 연산자: &&(AND)  ||(OR)  !(NOT)
		  		범위 :		>  <  >=  <= ==  !=  (부등호)
		  		switch
		 		case
		 		break
		  - 순환문
		 	
		  - 제어절 
		 	조건(조건 성립 공식(true/false)) {
		 	     처리 
		 	}
		 if(number > 0) {
		   		처리	
		 }
		 if (number >0  && number <=10  && number !=5) {
		 
		 }
		 
		 if(number  < 5) {
		 	처리
		 }
		 if(number > 10) {
		 	처리
		 }
		 
		 if( number <5 || number > 10 {
		 	처리
		 }
		 if(조건 1) {  조건1 == true
		 	처리1
		 } else { 조건1==  false
		   	처리2
		 }
		 
		 	조건 분기  n개 만큼의 조건
		 if( 조건 1) {
		          처리1
		 } else if(조건2) {
		       처리2
		 } else if (조건3) {
		 	처리3
		 } else( 조건 1 = 조건 2 = 조건 3 = false) {
		 	마지막 처리
		 }
		   
		 
		 */
		
		int number = 6;
		
		if (number >5) {
			System.out.println("number는 5보다 크다");
			
		if(number >= 6) {
			System.out.println("number는 6보다 크거나 같다");
			
			
		if(number == 6) {
			System.out.println("number는 6과 같다");
			
			
		if(number !=5) {
			System.out.println("number는 5가 아니다");
			
			
		if(number >= 0  && number < 10) {
			System.out.println("number는 0부터 9사이의 수 입니다");
			
		if(number <5  || number >10) {
			System.out.println("number는 5보다 작거나 10보다 크다"); // number = 6 이라 실행 오류 성립이 안됨
		}	
		if(number > 10) {
			System.out.println("number는 10보다 크다");
		}else {
			System.out.println("number는 10보다 작거나 같습니다");
		}
		
		if(number>10) System.out.println("number 10보다 크다");
		else 		 System.out.println("number 10보다 작거나 같다");
 		}
		//삼항 연산자
		String str;
		str=(number > 10)?"number 는 10보다 크다": "number는 10보다 작다";
		System.out.println(str);
		}
		
		//조건 분기
		number=85;
		
		if(number == 100) {
			System.out.println("100점 입니다.");
			
		}else if(number >= 90 && number <100) {
			System.out.println("90점 이상 입니다");
		}else if(number >=80 && number <90) {
			System.out.println("80점 이상 입니다");
		}else {
			System.out.println("80점 미만 입니다.");
		}
		
		if(number ==100 ) {
			System.out.println("100점 입니다.");
		}else if(number >= 90) {
			System.out.println("90점 이상 입니다");
		}else if(number >= 80) {
			System.out.println("80점 이상 입니다");
		}else {
			System.out.println("80점 미만 입니다.");
		}
		// 조건문 안 에 조건문
		if(number >= 80  && number <90) {
			if(number >= 85) {
				System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다.");
		}
			
		boolean b;
		
		b= false;
		
		if(b== false) {
			System.out.println("false 입니다");
		}
		if(!b) {
			System.out.println("b == false 입니다.");
		}
		if(b) {
			System.out.println("true 입니다");
		}if(true) {
			
		}
		}
		
		}
		}
			
		}
			
			
			
		}
		
	}


