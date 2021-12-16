package ion.codewars;

public class SumOfTwoArrays {
    public static void main(String[] args) {


        int[] array = arraysSumPerItem(new int[]{1, 2, 3, 5, 1}, new int[]{4, 5, 6, 7});

        for (Integer item : array) {
            System.out.print(item + " ");
        }


    }

    public static int[] arrayPlusArray(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length * arr2.length];

        for (int k = 0; k < arr3.length; ) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr2.length; j++) {
                    arr3[k] = arr1[i] + arr2[j];
                    if (k < arr3.length)
                        k++;
                }
            }
        }
        System.out.println(arr3.toString());
        return arr3;
    }

    public static int sumOfTwoArrays(int[] arr1, int[] arr2) {

        int finalResult = 0;
        int result;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                result = arr1[i] + arr2[j];
                finalResult = finalResult + result;
            }
        }
        System.out.println(finalResult);
        return finalResult;
    }

    public static int arraysSum(int[] arr1, int[] arr2) {

        int result = 0;


        for (int i = 0; i < arr1.length; i++) {
            result += arr1[i];
        }


        for (int i = 0; i < arr2.length; i++) {
            result += arr2[i];
        }


        System.out.println(result);
        return result;
    }

    public static int[] arraysSumPerItem(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length > arr2.length ? arr1.length : arr2.length];

        for (int index = 0; index < arr3.length; index++) {
            if (index >= arr1.length) {
                arr3[index] = arr2[index];

            } else if (index >= arr2.length) {
                arr3[index] = arr1[index];

            } else {

                arr3[index] = arr1[index] + arr2[index];
            }
        }
        return arr3;
    }
}
