package assignment1;
import java.util.Scanner;
public class pattern2 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();
		System.out.println(" ");
		int count = 1; 
		int i,j;
		for(i=rows; i>=1; i-- ){
		 for(j=1; j<=i*2; j++){
		 System.out.print(" ");
		 }
		 for(j=i; j<=rows; j++){
		 System.out.print(j+" ");
		 }
		for(j=rows-1; j>=i; j--){
		 System.out.print(j+" "); 
		 }
		  System.out.println();
		count++;
		 }
	}
}
