package org.akash.java.custom.generics;

import java.util.ArrayList;
import java.util.List;

public class CustomGenericsList<T> {
    private final List<T> elements;

    public CustomGenericsList() {
        elements = new ArrayList<>();
    }

    // Method to add an element to the list
    public void add(T element) {
        elements.add(element);
    }

    // Method to get an element by index
    public T get(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + elements.size());
        }
    }

    // Method to display the list contents
    public void display() {
        for (T element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        CustomGenericsList<Integer> integerList = new CustomGenericsList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        System.out.println("Contents of Integer CustomList:");
        integerList.display();

        CustomGenericsList<String> stringList = new CustomGenericsList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        System.out.println("\nContents of String CustomList:");
        stringList.display();

        System.out.println("\nElement at index 1 in Integer CustomList: " + integerList.get(1));
        System.out.println("Element at index 2 in String CustomList: " + stringList.get(2));
    }
}

