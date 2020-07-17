package assignment1;
import java.util.Scanner;
public class Number_series {
	public static void main(String[] args) {
		System.out.println("Enter No Of Terms:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 1; i <= a; i++) {
          int res = i * i * i;
			System.out.print(res + " ");
		}
	}
}
