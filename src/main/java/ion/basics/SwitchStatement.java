package ion.basics;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        System.out.println("Place enter a number between 0 and 9");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch(number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("Nine");
                break;
            default:
                System.out.println("The number " + number + " in bigger then 9 let's try again");
        }

    }
}
