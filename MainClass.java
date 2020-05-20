
public class MainClass {

	public static void main(String[] args) {

		
		//  bit Operator
		//  고급
		// 처리 속도가 빠르다
		/*
		   bit = 0 , 1
		   & AND
		   | OR
		   ^ XOR
		   << leftshift
		   >> rightshift
		   ~  반전
		 1010 10 (A) 1100 12(C)
		 A	  C
		 1111 15(F) 0000
		 F     0
		 */
		
		// AND
		
		int result ;
		
		result = 0xAC & 0xF0;
		
		System.out.println("result =" + result);
		
		System.out.printf("0x%x\n", result);
		
		// OR
		result = 0x48 | 0xb4;
		System.out.printf("0x%x\n", result);
		// XOR
		
		result = 0xc4 ^ 0x78;
		System.out.printf("0x%x\n", result);
		
		
		// ~ 반전  0 >  1    1 >   0 NOT
		
		byte by = ~0x55;  // 0101 0101 > 1010 1010
		
		System.out.printf("0x%x\n" , by);
		
		// left shift(*2)
		/*
		  0000 0001 > 1
		  0000 0010 > 2
		  0000 0100 > 4
		  0000 1000 > 8
		 */
		byte by1;
		by1 = 0x1 << 1;
		System.out.println("by = "+ by1);
		
		by1 <<=   1;
		System.out.println("by = "+ by1);
		
		by1 <<=   1;
		System.out.println("by = "+ by1);
		// right shift(/2)
		by1 >>=   1;
		System.out.println("by = "+ by1);
		
		by1 >>=   1;
		System.out.println("by = "+ by1);
		
		by1 >>=   1;
		System.out.println("by = "+ by1);
		
		
		
		
		
	}

}
