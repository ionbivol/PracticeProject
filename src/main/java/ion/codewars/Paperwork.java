package ion.codewars;

public class Paperwork {
    public static void main(String[] args) {



    }
    public static String repeatStr(final int repeat, final String string) {

        String result = "";

//        int counter = 0;
//        counter++;

        for(int counter = 0; counter<= repeat; counter++){
            result = result+string;

        }

        return result;
    }

//    public static String repeatStr2(final int repeat, final String input){
//
//       return input.repeat(repeat);
//    }

    public static boolean isSquare(int n) {

        if (n < 0) {
            return false;
        }
        int x = (int) Math.sqrt(n);

        if (x * x == n) {
            return true;
        }

        return false;
    }

    public static int paperWork(int n, int m) {
        if (m <= 0) {
            return 0;
        }
        if (n <= 0) {
            return 0;
        }
        return n * m;
    }

    public static int paperWork2(int n, int m) {

//        return n > 0 && m > 0 ? n*m : 0;
        return n < 0 && m < 0 ? 0 : n * m;
    }
}
