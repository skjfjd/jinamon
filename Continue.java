import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {

		/*
		  
		  	continue : skip( ���� )
		  		  �� ���� ó�� ����
		  		  for , while ���� ���
				
				
			loop{
				ó��1
				ó��2
				if (continue) �� ����ϸ� <<  ó�� 3�� ���� �Ѵ� 
				ó��3
			
			}
			

		 */
		
	/*	for(int i =0; i <10 ; i++) {
			System.out.println("i : " + i);
			
			System.out.println("for start");
			if(i > 5) {
				continue;
			}
			System.out.println("for end"); */
		}
	{	
		Scanner sc = new Scanner(System.in);
		
		int numArr[] = new int[3];
		int n; //��ĳ�ʸ� ���� ����
	
		for(int i =0; i<numArr.length; i++) {
			System.out.print((i + 1) + " ��° �� : ");
			n = sc.nextInt();
			if(n <0) {				// ����� �ƴҶ�?
			System.out.println("���� �Դϴ�.");
			 continue;
			}
			numArr[i] = n;
		}
		
		
	/*	for (int i = 0; i < numArr.length; i++) {
			System.out.println("numArr[" + i + "] =" + numArr[i] );
			
			
			
}*/

		{
	/*	
		int w =0;
		int arrNum[] = new int[3];
		while(w < 3) {
			System.out.print((w + 1) + "�� ° �� : ");
			n=sc.nextInt();
			
			if(n<0) {
				System.out.println("���� �Դϴ�");
				continue;
		}
			arrNum[w] = n;
			w++;
		
		}
		for(int i = 0; i <arrNum.length; i++) {
			
		}*/

}
}
}