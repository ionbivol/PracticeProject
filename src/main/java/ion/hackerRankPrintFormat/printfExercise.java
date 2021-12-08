package ion.hackerRankPrintFormat;

import java.util.Calendar;

public class printfExercise {
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

//            formatting string, arg(10)
//                d stands for oll the numbers like byte, short, int, long, bigInteger
        System.out.printf("'%-1d'%n",10);
        System.out.printf("'%10d'%n",10);       //numbers
        System.out.printf("%.2f%n",2.123);      //float numbers
        System.out.printf("%C %n",'a');         //for character
        System.out.printf("%.2S %n","hello");   //string length
        System.out.printf("%tT %n",cal);        // use calendar just to show time, month, hour, day of the week
        System.out.printf("%B %n",5<4);         //boolean
        System.out.printf("%e %n",10.123);      //scientific notation
        System.out.printf("%g %n",100.0);       //it will print decimal format
        System.out.printf("%o %n",10);          //convert number octal, base 8
        System.out.printf("%x %n",10);          //hexadecimal(a)
        System.out.printf("%h %n","hello");     //hash code-->5e918d2  hexadecimal





    }
}
