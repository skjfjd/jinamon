import java.util.Scanner;

public class WorkPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//1�� 
		
	/*	int  sum = 0 ;
		
		for(int i = 0; i<=1000; i++) {
			sum = sum+ i;
		}
		System.out.println("sum :" + sum);*/
	
		
		//2�� 10�� ����� �Է¹��� ���� ��� ������  �ִ��� ��� �϶�

	/*	int number;
		
		System.out.println("���� �Է� :");
		number = sc.nextInt();
		
		int n = 0;
		
		for(int i =0; i<10; i++) {
		
		n= 10 * i;
		if(number > n && number <= (n+10)) {
			System.out.println("number�� : " + n + "���� ũ��" + (n+10)+ "�۰ų� ����"); */
		
		//3��
		
	/*	int k = 0;
		
		for(int i = 0; i<=100; i++) {
			if(i%2==0)
				k=k+i;
			
		}
		System.out.println("1���� 100������ ¦���� ���� : " + k);
		
		int j = 0;
		
		for(int q = 0; q<=100; q++) {
			if(q%2!=0)
				j=j+q;
		}
		System.out.println("1���� 100������ Ȧ���� ���� : " + j);*/
		
		//4��°
		
	/*	for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++)
				System.out.println(i + "x" + j + "=" + i*j );
			System.out.println();*/
		//5��° ������ ���� �Է��ϰ� �� �ش��ϴ� ���� �������� ����϶�
		/* int dan;
		 
		 System.out.println("���ϴ� ���� �Է��϶� : ");
		 dan = sc.nextInt();
		 
		 for(int i=1; i<10; i++) {
			 System.out.println(dan + "x" + i + "="+ (dan*i));*/
		
		//6��°

		/*	for(int i= 0 ; i<9; i++) {
				for(int j=0; j<5; j++) {
					System.out.print("*");
			}
				System.out.println(); */
		
		//7��°
	/*		 int n= 0;
			 
			 for(int i=0; i<9; i++) {
				 if(i<5) n= n+1;
				 else    n= n-1;
				 for(int j =0; j<n; j++) {
					 System.out.print("*");
				 }
				 System.out.println();
				 */
		
		
		//8��°
			int num1,num2;
			String oper;
			int result = 0;
			System.out.println("ù��° �� : ");
			num1 = sc.nextInt();

			System.out.println("(+ , - . * , /)");
			oper = sc.next();
			
			System.out.println("�ι��� �� : ");
			num2 = sc.nextInt();
			
			switch(oper) {
			case"+":
				result = num1 + num2;
				break;
			case"-":
				result = num1 - num2;
				break;
			case "*":
				result= num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
				
			}
			System.out.println(num1 + " " + oper + " " + num2  + " = " + result);
			
		
			}
			
			
			
			
			
			
			
		
		
			 

			
				
			
		
		
		
		
		 
		
		
		
		
		
		
		
		
	
			
	
		
		
	
		
		
	
	
	}

	
	
