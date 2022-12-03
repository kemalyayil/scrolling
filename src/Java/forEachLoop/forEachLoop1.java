package Java.forEachLoop;

import java.util.ArrayList;

/*
Enhanced for loop(for each loop) repeatedly executes a group of statements for each element of the collection.
It can execute as many times as a number of elements in the collection.
 */
public class forEachLoop1 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<String>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Dhanbad");
        cities.add("Kolkata");

// Iterating arraylist using enhanced for loop.
        for(String city : cities)
        {
            System.out.println("City name: " +city);
        }
        System.out.println("City name: " +cities);      // City name: [Delhi, Mumbai, Dhanbad, Kolkata]
    }
}
