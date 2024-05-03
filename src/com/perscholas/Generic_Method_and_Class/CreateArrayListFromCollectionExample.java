package com.perscholas.Generic_Method_and_Class;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(1);
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();

        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(15);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

//        System.out.println(firstTenPrimeNumbers);

        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
//        System.out.println(nextFivePrimeNumbers);
//        System.out.println(firstTenPrimeNumbers);

        List<String> topCompanies = new ArrayList<>();
//        System.out.println(topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

//        System.out.println(topCompanies.set(4, "Walmart"));
//        System.out.println(topCompanies);

        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");
//        System.out.println("Initial List: ?" + programmingLanguages);
        boolean isRemoved = programmingLanguages.remove("css");
//        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);

        System.out.println(isRemoved);
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Python");
        scriptingLanguages.add("perl");

//        System.out.println(programmingLanguages);
        programmingLanguages.removeAll(scriptingLanguages);

//        System.out.println(programmingLanguages);


        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();

            List<String> names = new ArrayList<>();
            names.add("John");
            names.add("Alice");
            names.add("Bob");
            names.add("Steve");
            names.add("John");
            names.add("Steve");
            names.add("Maria");
// Check if an ArrayList contains a given element
            System.out.println("Does names array contain \"Bob\"? : " +
                    names.contains("Bob"));
// Find the index of the first occurrence of an element in an ArrayList
            System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
            System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));
// Find the index of the last occurrence of an element in an ArrayList
            System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
            System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));


        }
}
