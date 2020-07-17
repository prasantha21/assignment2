package assignment1;
import java.util.Scanner;
public class prime_series {
	 public static void main(String args[])
	   {
	    
	      int status = 1;
	      int num = 3;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter the value of n:");
	       int n = sc.nextInt();
	      if (n >= 1)
	      {
	         System.out.println("First "+n+" prime numbers are:");
	         System.out.print(2);
	      }

	      for ( int i = 2 ; i <=n ;  )
	      {
	         for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
	         {
	            if ( num%j == 0 )
	            {
	               status = 0;
	               break;
	            }
	         }
	         if ( status != 0 )
	         {
	            System.out.print(" "+num);
	            i++;
	         }
	         status = 1;
	         num++;
	      }         
	   }
}
