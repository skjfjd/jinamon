
public class Switch {

	public static void main(String[] args) {

		/*
		 switch : ���ǹ������� ���� ��Ȯ�ؾ� �Ѵ�.
		 
		 switch (����){
		 	case ������ 1: 
		 		ó��
		 		break; Ż��
		 	case ������2:
		 		ó��2
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
		
	// > < >= == ���Ұ�
		char c = '��';
		
		switch(c) {
		case '��':
			System.out.println("c= ��");
		}
		
		//�Ҽ����� ����ġ �Ұ�

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
			System.out.println("�̼��ڴ� 13�̴�");
			break;
		case 12:
			System.out.println("�̼��ڴ� 12�̴�");
			break;
		default:
			System.out.println("���ڰ� �ƴϴ�");
			break;
				
		}
		
		
		
		
		
		
		
		
	}

}
