import java.util.Scanner;


/*1 2 3 4 5 6 7 8 
2 3 4 5 6 7 8 
 3 4 5 6 7 8 
  4 5 6 7 8 
   5 6 7 8 
    6 7 8 
     7 8 
      8 
     7 8 
    6 7 8 
   5 6 7 8 
  4 5 6 7 8 
 3 4 5 6 7 8 
2 3 4 5 6 7 8 
1 2 3 4 5 6 7 8 */

public class PatternEx6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j+" "); 
            } 
             
            System.out.println(); 
        } 
        
        
      //Printing lower half of the pattern 
        
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();

	}

}
