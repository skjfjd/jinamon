package work1;

import java.util.Scanner;

public class mainClass {

	public static void main(String[] args) {
		String name;
		int age;
		boolean lady;
		String phone;
		double height;
		String address;
		
		System.out.println("==================================================================");
		System.out.println("\\\tname\tage\tlady\tphone\t\theight\taddress\t\\");
		System.out.println("==================================================================");
		
		name = "홍길동";
		age = 24;
		lady = false;
		phone = "010-111-2222";
		height = 175.12;
		address = "경기도";		
		System.out.println("\\\t\"" + name + "\"\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t\"" + address + "\"\t\\");		
		
		name = "일지매";
		age = 18;
		lady = false;
		phone = "02-123-4567";
		height = 180.01;
		address = "서울";		
		System.out.println("\\\t\"" + name + "\"\t" + age + "\t" + lady + "\t" + phone + "\t" + height + "\t\"" + address + "\"\t\\");
		
		/*
		// 입력 class
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름:");
		name = scan.next();
		
		System.out.print("나이:");
		age = scan.nextInt();
		
		System.out.print("키:");
		height = scan.nextDouble();
		
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("height:" + height);
		*/
		
		// swap == 교환
		int x, y;
		int a, b;
		
		x = 111;
		y = 222;
		
		a = x;
		b = y;
		
		x = b;
		y = a;
		
		System.out.println("x = " + x + " y = " + y);
		
		int x1, y1;
		int temp;
		
		x1 = 333;
		y1 = 444;
		
		temp = x1;
		x1 = y1;
		y1 = temp;
		
		System.out.println("x1 = " + x1 + " y1 = " + y1);
		
		
	}

}





