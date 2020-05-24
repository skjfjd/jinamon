import java.util.Scanner;

public class Study2 {

	public static void main(String[] args) {

		// 나이가 12세 이상  내공이 1400~1800 사이 입장가능 그외엔 입장 불가능
		
		int num1;
		int num2;
		
		int j = 12;
		int o = 100;
		
		int k = 1400;
		int l = 1800;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		num1 = sc.nextInt();
		System.out.print("내공 입력 : ");
		num2 = sc.nextInt();
		
		if(j <= o && k<= l) {
			System.out.println(num1+"세"+num2+"내공" + "입장가능");
		}else if (j<= o && k<l){
			System.out.println(num1+"세"+num2+"내공" + "입장불가능");
		
		}else if (j <o && k<=l){
			System.out.println(num1+"세"+num2+"내공" + "입장불가능");
			
		}
	}
}

	
	


