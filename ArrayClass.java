
public class ArrayClass {

	public static void main(String[] args) {

		/*
		 Array : �迭
		  		 ������ Ȯ�� ���
		  		 ������ �����ϱ� ���� ����.
		  		 ���� : ���� �ڷ����� ����
		  		 ���� : index ��ȣ
		  		 
		  int num1  ,num2 ,num3 ... num10;
		  
		  		 ���� : �ڷ��� �迭�� (=������)[]= new �ڷ���[�迭 ����];
		  		 
		  		 int Array[] = new int[10];   10���� ���� ����  
		  		 
		  		 Array[0] = 1;
		  		 Array[1] = 2;
		  		 Array[2] = 3;
		  		 	:
		  		 Array[9] = 10;
		  		 
		  		 �������� ���� �ؼ� �������� ����Ѵ�
		 */
		
		
		int array[] = new int[3];
		int num1 , num2 ,num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//���� �ʱ�ȭ
		
		int tag = 1;
		
		int arr[] = { 1 , 2 , 3} ;
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[1] = " + arr[1]);
		System.out.println("arr[2] = " + arr[2]);
		
		
		char charArr[] = { 'H' , 'e' , 'l' , 'l' , 'o'};
		System.out.println(charArr);
		System.out.println(charArr[0]);
		System.out.println((int)charArr[0]); // ASCII Code
		
		char charArr2[] = new char[5];
		
		charArr2[0] = 'H';
		charArr2[1] = 'e';
		charArr2[2] = 'l';
		charArr2[3] = 'l';
		charArr2[4] = 'o';
		
		System.out.println(charArr2);
		
	}
}
