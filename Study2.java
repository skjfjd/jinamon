import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {

		// ���̰� 12�� �̻�  ������ 1400~1800 ���� ���尡�� �׿ܿ� ���� �Ұ���
		
		int num1;
		int num2;
		
		int j = 12;
		int o = 100;
		
		int k = 1400;
		int l = 1800;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		num1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		num2 = sc.nextInt();
		
		if(j <= o && k<= l) {
			System.out.println(num1+"��"+num2+"����" + "���尡��");
		}else if (j<= o && k<l){
			System.out.println(num1+"��"+num2+"����" + "����Ұ���");
		
		}else if (j <o && k<=l){
			System.out.println(num1+"��"+num2+"����" + "����Ұ���");
			
		}
	}
}

	
	


