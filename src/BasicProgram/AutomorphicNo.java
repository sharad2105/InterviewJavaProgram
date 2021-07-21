package BasicProgram;

import java.util.Scanner;

public class AutomorphicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number..");
        int no= sc.nextInt();
        int l=0;
        int t=no;

        int sqr = no*no;

        while (t > 0){
            t= t/10;
            l++;
        }
        int end = sqr%(int) Math.pow(10, l);

        if (no == end){
            System.out.println(no+" is automorphic nmber");
        }
        else {
            System.out.println(no+" is not automorphic number");
        }

    }
}
