package ion.hackerRankPrintFormat;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            String sl = sc.next();
            int x = sc.nextInt();


            System.out.printf("%-15s%3d%n", sl, x);
        }
    }
}
