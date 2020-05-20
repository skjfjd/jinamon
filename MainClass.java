
public class MainClass {

	public static void main(String[] args) {

		/*
		  random : 난수 ,  무작위   <->	  pattern
		   1~5
		   1~45
		 */
		
		int rnum;
		// 0~ 4
		rnum = (int)(Math.random() *5);
		//System.out.println("rnum : " + rnum);
		// 0~9
		rnum = (int)(Math.random() *10);
		//System.out.println("rnum : " + rnum);
		// 10 ~ 20
		rnum = (int)(Math.random() *11 ) + 10;
		System.out.println("rnum : " + rnum);
		// 10 20 30 40 50
		rnum = ((int)(Math.random() *5) + 1) * 10;
		//System.out.println("rnum : " + rnum);
		
		// - 1 0 1 
		rnum = (int)(Math.random() *3) -1;
		
		int x = (int)(Math.random() *3) -1;
		int y = (int)(Math.random()*3) -1;
		
	}

}
