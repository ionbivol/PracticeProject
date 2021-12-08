package ion.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

//        Create a list on unique elements taken from the user.Sort and print these elements.

        //5 integers from user
        //print all unique elements
        //sort in ascending order
        //sort in decreasing order

        System.out.println("Enter 5 element between 0-10");


        List<Integer> listOfNumbers = createArray();
        List<Integer> sortedList = new ArrayList<>();


        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
    }

    private static List<Integer> createArray() {
        List<Integer> listOfNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int numberFromUser = scanner.nextInt();


            if (!listOfNumbers.contains(numberFromUser)) {
                listOfNumbers.add(numberFromUser);
            }
        }
        return listOfNumbers;
    }

}
