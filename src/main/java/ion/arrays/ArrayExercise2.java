package ion.arrays;

public class ArrayExercise2 {
    public static void main(String[] args) {

//        2. Given 2 arrays of ints, intArray1 and intArray2, print a message if they have the same first element or
//        they have the same last element. Both arrays will be length 1 or more.
//              [1, 2, 3] and [7, 3] → "Both arrays have the same last element"
//              [1, 2, 3] and [7, 3, 2] → "The arrays don't have the same first or the same last element"
//              [1, 2, 3] and [1, 3] → "Both arrays have the same first element"

        //firstElementArr1
        //lastElement

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2, 3};




        compareFirstAndLastElements(array1, array2);


//        System.out.println(equals(array1, array2));

    }
    //    we gain readability/the code is harder to debug

//    Functions with business logic should be like this/easy to read

    private static void compareFirstAndLastElements(int[] array1, int[] array2) {
        printElementsEquality("first",AreFirstElementsEqual(array1,array2));
        printElementsEquality("last",AreLastElementsEqual(array1,array2));
    }

    private static boolean AreFirstElementsEqual(int[] array1, int[] array2) {
        return array1[0] == array2[0];
    }

    private static boolean AreLastElementsEqual(int[] array1, int[] array2) {
        return array1[array1.length - 1] == array2[array2.length - 1];
    }

    private static void printElementsEquality(String index,boolean areEqual){
        System.out.println("The "+index+" element "+(areEqual?"it's ":"isn't ")+"the same");
    }





    private static boolean equals(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i])
                return false;
        }
        return true;
    }

}
