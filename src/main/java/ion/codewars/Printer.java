package ion.codewars;

import java.awt.*;
import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {

        System.out.println(printerError("aaabz"));

    }



    public static String printerError(String s) {

        int denominator = s.length();
        int numerator = s.length();
        int goodNumerator = 0;
        char [] inputArray = s.toCharArray();
        char[] array = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm'};

        if (s == null) {
            return "";
        }

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < array.length; j++){
                if(inputArray[i] == array[j]){
                    numerator--;
                    break;
                }

            }
        }



        return numerator + "/" + denominator;
    }
}
