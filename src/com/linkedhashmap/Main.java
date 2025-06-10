// Java program to demonstrate LinkedHashMap
package com.linkedhashmap;

import java.util.LinkedHashMap;

// Main class
public class Main {

    // Main method to run java program
    public static void main(String[] args) {

        // Create LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding elements to map
        map.put(0, "Red");
        map.put(1, "Green");
        map.put(2, "Blue");
        map.put(3, "Grey");
        map.put(4, "Pink");

        // Printing map to console
        System.out.println(map.toString());

        // Checking if map has value Black
        System.out.println(map.containsValue("Black")); // false

        // Checking if map has value Pink
        System.out.println(map.containsValue("Pink")); // true

        // Checking if map has value Green
        System.out.println(map.containsValue("Green")); // true

    }
}