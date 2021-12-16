package ion.streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Program {

    public static int[] someArray = new int[]{1,2,4,6,8,27,29,23,3,99,5,7,9,4,4,4,12,15,20};

    public static void main(String[] args) {
        //First we print the array
        printArray(someArray);

        //TODO: For each TODO put the code under it. Please see how i did it for the first one.
        // Each Dodo solving should have two lines of code, a function call that takes an array parameter
        // and the output which should be printed
        // in your functions use: Arrays.stream(array)...

        //In the first batch we will do functions that take int[] parameter and return only one value (an int)
        //TODO: Print max number of an array
        int x = Arrays.stream(someArray).max().getAsInt();
//        System.out.println(x);

        //TODO: Print min number of an array
        int y = Arrays.stream(someArray).min().getAsInt();
//        System.out.println(y);

        //TODO: Print count of all elements of an array
        long counter = Arrays.stream(someArray).count();
//        System.out.println(counter);

        //TODO: Print the sum of all elements
         int sum = Arrays.stream(someArray).sum();
//        System.out.println(sum);

        //TODO: Print the average of all elements // it will return a double
        double average = Arrays.stream(someArray).average().getAsDouble();
//        System.out.println(average);

        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        //Now we will have functions that take int[] parameter and return arrays, for instance int[]
        //TODO: Print the array skipping the first 4 elements
        int [] arrayAfter4 = Arrays.stream(someArray).skip(4).toArray();
//        printArray(arrayAfter4);

        //TODO: Print the first 6 elements of the array
        int [] first6 = Arrays.stream(someArray).limit(6).toArray();
//        printArray(first6);

        //TODO: Print the elements in the array SORTED
        int [] sortedArray = Arrays.stream(someArray).sorted().toArray();
//        printArray(sortedArray);

        //TODO: Print all Distinct elements
        int [] uniqueElements = Arrays.stream(someArray).distinct().toArray();
//        printArray(uniqueElements);

        //TODO: Print the odd numbers (numerele impare)
        int [] oddNumbers = Arrays.stream(sortedArray).filter(item -> item % 2 != 0).toArray();
//        printArray(oddNumbers);

        //TODO: Print the even numbers (numerele pare)
        int [] evenNumbers = Arrays.stream(someArray).filter(item -> item % 2 == 0).toArray();
//        printArray(evenNumbers);

        //TODO: Print the numbers which are greater than 10
        int [] greaterThen10 = Arrays.stream(someArray).filter(item -> item > 10).toArray();
//        printArray(greaterThen10);

        //TODO: Print the numbers divisible by 3
        int [] divideByThree = Arrays.stream(someArray).filter(item -> item % 3 ==0).toArray();
//        printArray(divideByThree);

        //TODO: Print the numbers that are a multiple of 10
        int [] dividedBy10 = Arrays.stream(someArray).filter(item -> item % 10 ==0).toArray();

        //TODO: Add 1 to all the numbers in the array
        int [] arrayPlusOne = Arrays.stream(someArray).map(item -> item +1).toArray();
//        printArray(arrayPlusOne);

        //TODO: Multiply all the numbers in the array by 2
        int [] multipliedArray = Arrays.stream(someArray).map(operand -> operand *2).toArray();
//        printArray(multipliedArray);

        //------------------------------------------------------------------------------------------
        //------------------------------------------------------------------------------------------
        //Now let's compose the stream operations
        //TODO: Sum the first 6 elements
        int sumOf6 = Arrays.stream(someArray).limit(6).sum();
//        System.out.println(sumOf6);

        //TODO: Calculate the average of the the array, but skipping the first 5
        double averageDouble = Arrays.stream(someArray).skip(5).average().getAsDouble();
//        System.out.println(averageDouble);

        //TODO: Print the all the odd(impare) numbers only once (distinct)
        int [] oddAndDistinct = Arrays.stream(someArray).distinct().filter(item -> item % 2 != 0).toArray();
//        printArray(oddAndDistinct);

        //TODO: Print all the even numbers that are smaller than 20
        int [] evenSmallerThem20 = Arrays.stream(someArray).filter(item -> item % 2 ==0)
                .filter(value -> value <20).distinct().toArray();
//        printArray(evenSmallerThem20);


        //TODO: Calculate the average of distinct even numbers numbers that are smaller than 5
        double  a = Arrays.stream(someArray)
                .distinct()
                .filter(item -> item < 5 &&  item % 2 ==0)
                .average()
                .getAsDouble();
        System.out.println(a);

    }



    public static void printArray(int[] array){
        Arrays.stream(array).forEach(item-> System.out.print(item + " "));
        System.out.println();
    }
}
