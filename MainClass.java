
public class MainClass {
public static void main(String[] args) {
	/*
	 1차원 배열
	 Array: 같은 자료형의 묶음, 변수들의 묶음
	 		intdex number로 관리가 된다.
	 		 0~ n-1 (n은 배열의 총수)
	 		 
	 다른 자료형의 묶음 : C언어 > structure(구조세)
	 				Java > class
	 				
	 	
	 	int array[] = new int[3];
	 	int array[] = { 1 , 2 , 3, 4 , 5 };
	 	
	 	MyStruct my = { 'a' , 24 , "홍길동"};
	 	
	 	
	 	String member[] = { "홍길동" , "24" , "서울시" }
	 	
	 	
	 	2차원 배열
	 			  가로    세로
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
