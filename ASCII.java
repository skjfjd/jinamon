import java.util.Scanner;

public class ASCII {

	public static void main(String[] args) {

			/*
			  �Է�: ��� ���ڷ� �Ǿ� �ִ��� Ȯ��
			  
			  > String "12345"  123e5"
			  ��� ���ڷ� �Ǿ� ������,
			  "���ڷ� �Ǿ��ֽ��ϴ�."  > ���� ��ȯ
			  "���ڷ� �Ǿ����� �ʽ��ϴ�."
			  ASCII ��� 
			 */
		/*
		 
		 �Է�: ���� , �Ǽ��� �Ǻ��� �ڵ带 �ۼ�
		 > String	"123.456" "123456"
		 	�Ǽ��� �Ǽ� �Դϴ�.
		 	������ ���� �Դϴ�.
		 	
		 	
		 */
		
	/*	char str;
		boolean check = true;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("�Ǻ��� ���� �Է� : ");
		String input = sc.nextLine();
		
		for (int i = 0; i < input.length(); i++) {
			str = input.charAt(i);
			
			if(!('0'<=str && str<='9')){
				check = false;
			}
			
		}
		
		
		System.out.println("���� ���� : " + check);*/
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�Է� : ");
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
			System.out.println("���� �Դϴ�.");
			
		}else {
			System.out.println("���ڿ� �Դϴ�.");
		}
		
		
		
	}

	
	
}
