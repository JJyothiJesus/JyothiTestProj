import java.util.Scanner;

/*1
10
101
1010
10101
101010
1010101
*/
public class PatternEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	        	//System.out.println(" "+ i);
	            for (int j = 1; j <= i; j++)
	            {
	            //	System.out.println(" "+ j);
	                if(j%2 == 0)
	                {
	                    System.out.print(0);
	                }
	                else
	                {
	                    System.out.print(1);
	                }
	            }
	             
	            System.out.println();
	        }
	         
	        sc.close();
	}

}
