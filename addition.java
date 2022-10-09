/*
E
DE
CDE
BCDE
ABCDE
 */

import java.util.Scanner;

public class Addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number");
        int n = sc.nextInt();
        for (int i =n ; i>0; i--)
        {
            char ch = (char)('A'+i-1);
            for (int j=i; j<=n;j++)
            {
                System.out.print(ch);
                ch = (char)(ch+1);
            }
            System.out.println(" ");
        }
    }
}
