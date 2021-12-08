package ion.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {

        //how to create an ArrayList

        List<String> animals = new ArrayList<>();

        //example of how to populate the array

        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Caw");
        animals.add("Rat");

        System.out.println(animals);

        //adding new element on position [2]
        animals.add(2,"Elephant");

        //Array doesn't change the value on index [2], it shifting last element and adding new one
        System.out.println(animals);

        //adding new array to previous array

        List<String> animals2 = new ArrayList<>();
        animals2.add("Fish");
        animals2.add("Snake");
        animals2.add("Turtle");

        animals.addAll(animals2);
        System.out.println(animals);

        //replace value with another value accessing by index
        animals.set(0,"Mouse");
        System.out.println(animals);

        //pass through all the element and print them
        for(String animal : animals){
            System.out.println(animal);
        }
    }
}
