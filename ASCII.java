import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {

			/*
			  입력: 모두 숫자로 되어 있는지 확인
			  
			  > String "12345"  123e5"
			  모두 숫자로 되어 있으면,
			  "숫자로 되어있습니다."  > 숫자 변환
			  "숫자로 되어있지 않습니다."
			  ASCII 사용 
			 */
		/*
		 
		 입력: 정수 , 실수를 판별할 코드를 작성
		 > String	"123.456" "123456"
		 	실수면 실수 입니다.
		 	정수면 정수 입니다.
		 	
		 	
		 */
		
	/*	char str;
		boolean check = true;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("판별할 숫자 입력 : ");
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			str = input.charAt(i);
			
			if(!('0'<=str && str<='9')){
				check = false;
			}
			
		}
		
		
		System.out.println("숫자 여부 : " + check);*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = sc.next();
		
		boolean numTrue = true;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.println("c = " + c);
			//ASCII Code
		
		int asccode = (int)c;
		if(asccode < 48 || asccode > 57) {
			numTrue = false;
			break;
		}
			
		}
		if(numTrue) {
			System.out.println("숫자 입니다.");
			
		}else {
			System.out.println("문자열 입니다.");
		}
		
		
		
	}

	
	
}
