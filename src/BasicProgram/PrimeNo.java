package BasicProgram;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number......");
        int no=scanner.nextInt();

        if (no%2 == 0){
            System.out.println("Not Prime");
        }
        else {
            System.out.println("Prime");
        }
    }
}
