package ion.arrayList;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {

        List<String> animals = Arrays.asList("Cat", "Rat", "Dog", "Elephant", "Mouse");


//        animals.add("Cat");
//        animals.add("Rat");
//        animals.add("Dog");
//        animals.add("Elephant");
//        animals.add("Mouse");

        System.out.println("Actual list " + animals);


        List<String> pluralAnimals = animalsOnPlural(animals);
        System.out.println(pluralAnimals);

        List<String> upperCaseAnimals = animalsToUppercase(animals);
        System.out.println(upperCaseAnimals);

        List<String> lowerCaseAnimals = animalsToLowerCase(animals);
        System.out.println(lowerCaseAnimals);

        List<String> orderedAnimals = orderAnimalsAlphabetical(animals);
        System.out.println(orderedAnimals);

//        Cat Rat Dog..... printare ca un sigur string
        String animalsAsString = contactAnimals(animals);
        System.out.println(animalsAsString);


    }

    private static String contactAnimals(List<String> animals) {
        StringBuilder sb = new StringBuilder();
        for (String animalString : animals) {
            sb.append(animalString).append(", ");
        }
        sb.deleteCharAt(sb.length()-2);

        return sb.toString();
    }

    private static List<String> orderAnimalsAlphabetical(List<String> animals) {
        Collections.sort(animals);
        return animals;
    }

    private static List<String> animalsOnPlural(List<String> animals) {

        Map<String, String> animalsWithDifferentPlural = new HashMap<>();
        animalsWithDifferentPlural.put("Mouse", "Mice");


        List<String> result = new ArrayList<>();
        for (String animal : animals) {
            if (animalsWithDifferentPlural.containsKey(animal)) {
                String newAnimal = animalsWithDifferentPlural.get(animal);
                result.add(newAnimal);
            }else {

                String plural = "s";
                animal = animal.concat(plural);

                result.add(animal);
            }
        }
        return result;
    }

    private static List<String> animalsToLowerCase(List<String> animals) {
        List<String> result = new ArrayList<>();

        for (String animal : animals) {
            animal = animal.toLowerCase(Locale.ROOT);
            result.add(animal);
        }
        return result;
    }

    private static List<String> animalsToUppercase(List<String> animals) {
        List<String> result = new ArrayList<>();

        for (String animal : animals) {
            animal = animal.toUpperCase(Locale.ROOT);
            result.add(animal);
        }
        return result;
    }

}
