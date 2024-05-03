package com.perscholas.Generic_Method_and_Class;
import java.util.ArrayList;
import java.util.List;
public class CreateArrayListExample {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        animals.add("Sheep");
        animals.add("Rabbit");
        System.out.println(animals);
        animals.add(2, "elephant");
        System.out.println(animals);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(10);
        System.out.println(numbers);

    }
}
