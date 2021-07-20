package BasicProgram;

import java.util.Scanner;

public class LeepYear {
    public static void main(String[] args) {
        int year = 1972;
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the year......");
//
//        int year = scanner.nextInt();
        if ((year%400==0) || ((year%4==0)&&(year%100)!=0)){
            System.out.println("Leep year");
        }
        else {
            System.out.println("Non Leep Year");
        }
    }
}
