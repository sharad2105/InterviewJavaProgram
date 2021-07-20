package BasicProgram;

import java.util.Scanner;

public class PalindromNo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number...");
        int n = sc.nextInt();
        int temp;
        int rem;
        int revs = 0;
        temp = n;
        while (temp > 0)
        {
            rem = temp%10;
            revs = revs*10+rem;
            temp = temp/10;
        }
        if (n == revs)
        {
            System.out.println(n+" is palindrome number ");
        }
        else
        {
            System.out.println(n+" i not a palindrome number");
        }
    }
}
