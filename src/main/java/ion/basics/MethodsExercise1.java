package ion.basics;

public class MethodsExercise1 {
    public static void main(String[] args) {

        System.out.println(isIncludedIn("The Wither", "Wither"));
        System.out.println(isIncludedIn2("Amazing", "this is very beautiful"));
        System.out.println(checkIfItContainsLetterI("Vasile"));
    }

    public static boolean isIncludedIn(String word1, String word2) {
        return word2.contains(word2);
    }

    public static boolean isIncludedIn2(String word3, String word4) {
        return word3.contains(word4);
    }

    public static boolean checkIfItContainsLetterI(String name) {
        return name.contains("i");
    }
}
