package assignment1;

import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args)
    {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows ");

        int rows = sc.nextInt();
        
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

