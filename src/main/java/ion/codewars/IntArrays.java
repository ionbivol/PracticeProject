package ion.codewars;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrays {
    public static void main(String[] args) {


        System.out.println(biggestNumberWithStream(null));
        findSmaller(new int[]{-20, 14, 200});

    }

    //example with stream
    public static int findSmaller(int[] args) {
        System.out.println(Arrays.stream(args).min().getAsInt());
        return Arrays.stream(args).min().getAsInt();
    }

    public static int findSmallestInt(int[] args) {

        int minimumValue = args[0];

        for (int i = 0; i < args.length; i++) {

            if (args[i] < minimumValue)
                minimumValue = args[i];


//           Math.min(array[i],array[i+1]);
        }
        System.out.println(minimumValue);
        return minimumValue;
    }


    public static int biggestNumberWithStream(int[] args) {
        Arrays.stream(args).filter(number -> {
            boolean result = number > 3;
            return result;
        });
        return Arrays.stream(args).max().getAsInt();
    }

    public static int biggestNumber(int[] args) {

        int maxValue = args[0];

        for (int number : args) {
            if (maxValue < number) {
                maxValue = number;
            }
        }

        return maxValue;
    }
}
