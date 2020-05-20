
public class ArrayClass {

	public static void main(String[] args) {

		/*
		 Array : 배열
		  		 변수의 확장 기능
		  		 관리를 용이하기 위한 목적.
		  		 정의 : 같은 자료형의 묶음
		  		 관리 : index 번호
		  		 
		  int num1  ,num2 ,num3 ... num10;
		  
		  		 형식 : 자료형 배열명 (=변수명)[]= new 자료형[배열 개수];
		  		 
		  		 int Array[] = new int[10];   10개의 변수 선언  
		  		 
		  		 Array[0] = 1;
		  		 Array[1] = 2;
		  		 Array[2] = 3;
		  		 	:
		  		 Array[9] = 10;
		  		 
		  		 동적으로 생성 해서 정적으로 사용한다
		 */
		
		
		int array[] = new int[3];
		int num1 , num2 ,num3;
		
		array[0] = 11;
		array[1] = 22;
		array[2] = 33;
		
		//변수 초기화
		
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
