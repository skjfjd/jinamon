import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		/*
		 편의점
		 
		 지불해야될 금액 : 3230원
		 자신의 금액 : 10000원
		거스름 돈 : 출력
		5000원 : ? 장
		1000원 : ? 장
		500원 : ? 개
		100원 " ? 개 
		50 원 : ? 개
		10원  : ? 개 
		 
		
		Scanner scan = new Scanner(System.in);
			int my = 10000;
		 int buy = 3230;
		 
		 int result = 6770;
		 
		 System.out.print("자신의 금액:" );
		 	my = scan.nextInt(); 
			
					
		System.out.print("지불해야될 금액 : " );
		buy = scan.nextInt();
						
		System.out.print("거스름돈:" );
		result = scan.nextInt();
		
		
		if(result == 6770) {
			System.out.println("거스름돈을 맞게 받았습니다.");
			
			System.out.println("5000원 :" + "1장");
			
			System.out.println("1000원 :" + "1장");
			System.out.println("500원 :" + "1개");
			System.out.println("100원 :" + "2개");
			System.out.println("50원 :" + "1개");
			System.out.println("10원 :" + "2개");
		}else if(result !=6770)  {
			System.out.println("거스름돈을 맞게 받지 않았습니다."); */
			
			//샘  코딩
		
		
		int mymoney; 			  // 자신의 금액
		int price; 	 			  // 지불 금액
		int changemoney;		  // 거스름돈	
		
		
		mymoney = 10000;
		price = 3230;
		changemoney = mymoney - price;
		
		//5000 원 권
		int m5000 = changemoney / 5000;
		//1000원 권
		int m1000 = (changemoney % 5000) / 1000 ;
		//500 원 권
		int m500 =  (changemoney % 1000) / 500 ;
		
		//100 원 권 
		
		int m100 = (changemoney % 500)/ 100;
		
		//50  원권
		
		int m50 = (changemoney % 100) / 50;
		
		//10원 권 
		
		int m10 = (changemoney % 50) / 10;
		
		System.out.println("거스름돈: "+ changemoney);
		System.out.println("5000: " + m5000 + "장");
		System.out.println("1000: " + m1000+ "장");
		System.out.println("500: " + m500+ "개");
		System.out.println("100: " + m100+ "개");
		System.out.println("50: " + m50+"개");
		System.out.println("10: " + m10+  "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		}
		
		
		
		
		
		
		
	}


