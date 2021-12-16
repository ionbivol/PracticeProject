package ion.codewars;
import java.util.Arrays;
import java.util.stream.IntStream;

public class FizzBuzz {
    public static void main(String[] args) {

        arrayFizzBuzzer(50);

    }

    public static int[] arrayFizzBuzzer(int count) {

        int[] arrayNumbers = IntStream.range(1, count + 1).toArray();

        for (int i = 1; i <= arrayNumbers.length; i++) {
            System.out.println(fizzBuzz(i));
        }
        return arrayNumbers;
    }

    private static String fizzBuzz(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else {
            return String.valueOf(i);
        }

    }

//    public static String streamFizzBuzz(int count){
//
//        int[] arrayNumbers = IntStream.range(1, count + 1).toArray();
//
//        Arrays.stream(arrayNumbers).peek()
//
//        })
//
//    }

}
