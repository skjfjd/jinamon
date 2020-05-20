import java.util.Scanner;

public class Study3 {
	
		private static boolean String;

		public static void main(String[] args) {
			String name;
			int age;
			boolean lady;
			String phone;
			double height;
			String address;
			
			
			System.out.println("================================================================================");
			System.out.println("\\\tname\tage\tlady\t\tphone\t\theight\t\taddress\\");
			System.out.println("================================================================================");
			
			name = "홍길동";
			age = 20;
			lady = false;
			phone = "010-111-2222";
			height = 175.01;
			address = "경기도";
			
	System.out.println("\\\t\"" + name +"\"" +"\t" + age +"\t" + lady + "\t\t" + phone +"\t"+ height +"\t\t\"" + address+"\"" +"\t\\");
			
	name = "일지매";
	age = 18;
	lady = false;
	phone = "02-1234-5678";
	height = 180.05;
	address = "서울";
	System.out.println("\\\t\"" + name +"\"" +"\t" + age +"\t" + lady + "\t\t" + phone +"\t"+ height +"\t\t\"" + address+"\"" +"\t\\");
	
		name = "장옥정";
		age = 14;
		lady = true;
		phone = "010-4567-8901";
		height = 155.75;
		address = "부산";
	System.out.println("\\\t\"" + name +"\"" +"\t" + age +"\t" + lady + "\t\t" + phone +"\t"+ height +"\t\t\"" + address+"\"" +"\t\\");
	
	
	
	// 입력 class
	
		/*	Scanner scan = new Scanner(System.in);
			
			System.out.print("이름:");
			name = scan.next();
			
			System.out.print("나이:");
			age = scan.nextInt();
			
			System.out.print("성별:");
			lady = scan.hasNextBoolean();
			
			System.out.println("전화번호:");
			phone = scan.next();
			
			System.out.print("키:");
			height = scan.nextDouble();
			
			System.out.print("주소:");
			address = scan.next();*/
			
			
			
			// swap
			
			
			int x,y;
			
			int temp;
			
			x = 111;
			y = 222;
			
			temp= x;
			x = y;
			y = temp;
			
			System.out.println("x="+ x + "y="+ y);
			
		}  
}
	
		
		


