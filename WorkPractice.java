import java.util.Scanner;

public class WorkPractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	//1번 
		
	/*	int  sum = 0 ;
		
		for(int i = 0; i<=1000; i++) {
			sum = sum+ i;
		}
		System.out.println("sum :" + sum);*/
	
		
		//2번 10의 배수로 입력받은 수는 어느 범위에  있는지 출력 하라

	/*	int number;
		
		System.out.println("숫자 입력 :");
		number = sc.nextInt();
		
		int n = 0;
		
		for(int i =0; i<10; i++) {
		
		n= 10 * i;
		if(number > n && number <= (n+10)) {
			System.out.println("number는 : " + n + "보다 크고" + (n+10)+ "작거나 같다"); */
		
		//3번
		
	/*	int k = 0;
		
		for(int i = 0; i<=100; i++) {
			if(i%2==0)
				k=k+i;
			
		}
		System.out.println("1부터 100사이의 짝수의 합은 : " + k);
		
		int j = 0;
		
		for(int q = 0; q<=100; q++) {
			if(q%2!=0)
				j=j+q;
		}
		System.out.println("1부터 100사이의 홀수의 합은 : " + j);*/
		
		//4번째
		
	/*	for(int i = 1; i<10; i++) {
			for(int j = 1; j<10; j++)
				System.out.println(i + "x" + j + "=" + i*j );
			System.out.println();*/
		//5번째 임의의 수를 입력하고 그 해당하는 단의 구구단을 출력하라
		/* int dan;
		 
		 System.out.println("원하는 단을 입력하라 : ");
		 dan = sc.nextInt();
		 
		 for(int i=1; i<10; i++) {
			 System.out.println(dan + "x" + i + "="+ (dan*i));*/
		
		//6번째

		/*	for(int i= 0 ; i<9; i++) {
				for(int j=0; j<5; j++) {
					System.out.print("*");
			}
				System.out.println(); */
		
		//7번째
	/*		 int n= 0;
			 
			 for(int i=0; i<9; i++) {
				 if(i<5) n= n+1;
				 else    n= n-1;
				 for(int j =0; j<n; j++) {
					 System.out.print("*");
				 }
				 System.out.println();
				 */
		
		
		//8번째
			int num1,num2;
			String oper;
			int result = 0;
			System.out.println("첫번째 수 : ");
			num1 = sc.nextInt();

			System.out.println("(+ , - . * , /)");
			oper = sc.next();
			
			System.out.println("두번쨰 수 : ");
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

	
	
