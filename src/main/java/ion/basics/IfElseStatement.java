package ion.basics;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {

        System.out.println("Please enter a number:");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number > 30) {
            System.out.println("The entered number " + number + " is grater than 30 ");
        } else if (number == 30) {
            System.out.println("The entered number " + number + " is equal with 30 ");
        } else {
            System.out.println("The entered number " + number + " is lower than 30 ");
        }

    }
}
