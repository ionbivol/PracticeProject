package ion.arrays;

import java.util.Arrays;

public class ArrayExercise3 {
    public static void main(String[] args) {

//        3. Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element
//        to 0. Print the initial array and the changed array.
//              [1, 2, 3] → [1, 2, 0]
//              [2, 3, 5] → [2, 0, 5]
//              [1, 2, 1] → [1, 2, 1]

        //nextElement

        int[] array = new int[]{1, 2, 3};
        System.out.println(Arrays.toString(array));

        try {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1)
                    break;
                if (array[i] == 2 && array[i + 1] == 3) {
                    array[i + 1] = 0;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(array));


    }
}
