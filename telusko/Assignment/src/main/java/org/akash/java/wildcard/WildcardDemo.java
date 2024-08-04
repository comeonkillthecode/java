package org.akash.java.wildcard;

import java.util.Arrays;
import java.util.List;

public class WildcardDemo {

    public static void displayListContents(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Contents of Integer List:");
        displayListContents(integerList);

        List<String> stringList = Arrays.asList("one", "two", "three", "four", "five");
        System.out.println("\nContents of String List:");
        displayListContents(stringList);

        List<Double> doubleList = Arrays.asList(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println("\nContents of Double List:");
        displayListContents(doubleList);

        List<Object> mixedList = Arrays.asList(1, "two", 3.0, "four", 5);
        System.out.println("\nContents of Mixed List:");
        displayListContents(mixedList);
    }
}

