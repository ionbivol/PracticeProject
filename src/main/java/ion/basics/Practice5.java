package ion.basics;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        byte b = scanner.nextByte();
        char c = scanner.next().charAt(0);
        System.out.println("The Int is:" + a);
        System.out.println("the float is: " + b);
        System.out.println("The char is: " + c);
    }
}
