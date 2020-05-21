
public class Switch {

	public static void main(String[] args) {

		/*
		 switch : 조건문이지만 값이 명확해야 한다.
		 
		 switch (변수){
		 	case 변수값 1: 
		 		처리
		 		break; 탈출
		 	case 변수값2:
		 		처리2
		 		break;
		 	default == else
		 		break;
		 }
		 */
		
		
		int number = 1;
		
		switch(number) {
			case 1:
				System.out.println("number = 1");
				break;
			case 2:
				System.out.println("number = 2");
				break;
			default:
				System.out.println("number != 1 and number !=2");
				break;
		}
		
	// > < >= == 사용불가
		char c = '가';
		
		switch(c) {
		case '가':
			System.out.println("c= 가");
		}
		
		//소수점은 스위치 불가

		String str ="ABC";
		
		switch(str) {
		case "ABC" :
			System.out.println("str="+ str);
			break;
		}
		
		
		/*switch(process) {
		case create:
			
			break;
		case print:
			
			break;
		case release:
			
			break;
		}*/
		
		
		int num3 = 12;
		
		switch(num3) {
		case 1:
			System.out.println("이숫자는 13이다");
			break;
		case 12:
			System.out.println("이숫자는 12이다");
			break;
		default:
			System.out.println("숫자가 아니다");
			break;
				
		}
		
		
		
		
		
		
		
		
	}

}
