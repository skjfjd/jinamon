import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
			//���� �� �Ǽ��� �װ��� �����δ�
		
	Scanner sc =new Scanner(System.in);	
		System.out.println("���� �Է� : ");
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
			System.out.println("�Ǽ��Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		}
			// �빮�ڷ� �Է� > �ҹ��ڷ� ��ȯ �ؼ� ���...
			// toLowerCase ��� X
	
	
			
		
	

}