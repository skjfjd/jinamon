import java.util.Scanner;

public class Study4 {

	public static void main(String[] args) {
		String name;
		int age;
		boolean man;
		String phone;
		double height;
		String address;
		
		
		System.out.println("================================================================================");
		System.out.println("\\\tname\tage\tman\t\tphone\t\theight\t\taddress\t\\");
		System.out.println("================================================================================");
		
		name = "ȫ�浿";
		age = 20;
		man = true;
		phone ="010-111-2222";
		height = 175.01;
		address = "��⵵";
		
		System.out.println("\\\t\""+ name +"\""+"\t"+ age + "\t" + man +"\t\t"+ phone + "\t" + height + "\t\t\"" + address+"\"\t\\" );

		name = "������";
		age = 18;
		man = true;
		phone ="02-345-2587";
		height = 180.08;
		address = "����";
		System.out.println("\\\t\""+ name +"\""+"\t"+ age + "\t" + man +"\t\t"+ phone + "\t" + height + "\t\t\"" + address+"\"\t\\" );
		
		name = "�����";
		age = 15;
		man = false;
		phone ="010-7845-8587";
		height = 172.54;
		address = "�λ�";
		System.out.println("\\\t\""+ name + "\""+ "\t"+ age + "\t" + man + "\t\t"+ phone + "\t" + height + "\t\t\""+ address +"\"\t\\");
		System.out.println("================================================================================");
		
		
		//scan
		
		/*Scanner scan = new Scanner(System.in);
		System.out.print("�̸�:");
		name = scan.next();
		
		System.out.print("����:");
		age = scan.nextInt();
		
		System.out.print("��ȭ��ȣ:");
		 phone = scan.next();
		 
		 System.out.print("Ű:");
		 height = scan.nextDouble();
		 
		 System.out.print("�ּ�:");
		 address = scan.next(); */
		 
		 //swap
		 
		 int x , y ;
		 int temp;
		 
		 
		 x= 100;
		 y= 200;
		 
		 temp = x;
		 x = y;
		 y= temp;
		 
		 System.out.println("x=" + x + "y=" + y);
		 
		 
		 
		 
		
		 
	}

}
