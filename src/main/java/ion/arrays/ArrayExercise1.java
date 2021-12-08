package ion.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercise1 {
    public static void main(String[] args) {

//        1. Given an array of ints, print a message if 6 appears as either the first or last element in the array. The
//        array will be length 1 or more.
//            [1, 2, 6] → "6 appears at the end of the array"
//            [6, 1, 2, 3] → "6 appears at the start of the array"
//            [13, 6, 1, 2, 3] → "6 doesn't appear at the start or at the end"

        //Array
        //Last
        //First

        try {

            while (true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("How many characters will have your array?");
                int sizeOfArray = scanner.nextInt();
                int[] array = fillArray(sizeOfArray);
                System.out.println("Your array have this elements: " + Arrays.toString(array));
                printMessageOn6(array);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
          }

    }

    private static int[] fillArray(int numberFromUser) {
        System.out.println("Fill the array with elements that you want");
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[numberFromUser];

        for (int i = 0; i < numberFromUser; i++) {
            System.out.print("Element " + (i + 1) + " : ");
            numArray[i] = scanner.nextInt();
        }
        return numArray;

    }

    private static void printMessageOn6(int[] input) {
        int first = input[0];
        int last = input[input.length - 1];

        if (first == 6) {
            System.out.println("6 appears at the start of the array");
        }
        if (last == 6) {
            System.out.println("6 appears at the end of the array");
        }
        if (first != 6 && last != 6) {
            System.out.println("6 doesn't appear in array");
        }
    }

}
