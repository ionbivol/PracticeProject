package ion.hackerRankPrintFormat;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
//
//        Given an integer,n , print its first 10 multiples. Each multiple n*i  (where 1< ) should be
//        printed on a new line in the form: N x i = result.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number that will by multiply");
        int N = scanner.nextInt();
        scanner.close();
        int result;

        for (int i = 1; i < 11; i++) {
            result = N * i;
            System.out.println(N + " x " + i + " = " + result);
//            System.out.printf("%d x %d = %d%n",N,i,result);

        }
    }
}