
public class MainClass {
public static void main(String[] args) {
	/*
	 1���� �迭
	 Array: ���� �ڷ����� ����, �������� ����
	 		intdex number�� ������ �ȴ�.
	 		 0~ n-1 (n�� �迭�� �Ѽ�)
	 		 
	 �ٸ� �ڷ����� ���� : C��� > structure(������)
	 				Java > class
	 				
	 	
	 	int array[] = new int[3];
	 	int array[] = { 1 , 2 , 3, 4 , 5 };
	 	
	 	MyStruct my = { 'a' , 24 , "ȫ�浿"};
	 	
	 	
	 	String member[] = { "ȫ�浿" , "24" , "�����" }
	 	
	 	
	 	2���� �迭
	 			  ����    ����
	 	int Array2[3] [4] = {
	 	{1  , 2  ,   3,   4 },
	 	{5  , 6   ,  7   , 8},
	 	{9  , 10  , 11  ,12}
	 	};
	 	
	 	int Array2[][] = new int[3][4];
	 	int []Array[] = new int[3][4];
	 */
	
	int Array2[][] = {
			{1 , 2, 3,4},
			{5,6,7,8},
			{9,10,11,12}
	};
	
	for (int i = 0; i < Array2.length; i++) {
		for (int j = 0; j < Array2[0].length; j++) {
			System.out.println("Array2[" + i + "][" + j + "] = " + Array2[i][j]);
		}
		
	}
	
	
}
}
