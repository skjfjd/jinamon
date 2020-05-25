import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
			//정수 냐 실수냐 그것이 문제로다
		
	Scanner sc =new Scanner(System.in);	
		System.out.println("숫자 입력 : ");
		String str = sc.next();
		
		boolean floatTrue = false;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c =='.') {  //".9485"
				floatTrue = true;
				break;
		}
		
		
		}
		if(floatTrue) {
			System.out.println("실수입니다.");
		}else {
			System.out.println("정수입니다.");
		}
		
		}
			// 대문자로 입력 > 소문자로 변환 해서 출력...
			// toLowerCase 사용 X
	
	
			
		
	

}