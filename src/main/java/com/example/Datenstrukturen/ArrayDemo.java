package com.example.Datenstrukturen;

import java.util.Arrays;

public class ArrayDemo {
    public static void run() {
        System.out.println("\n=== Array Demo ===");
        System.out.println("Ein Array speichert feste Datenmengen mit schnellem Zugriff (O(1)).\n");

        int[] array = { 10, 20, 30, 40, 50 };
        System.out.println("\nOriginal-Array: " + Arrays.toString(array));

        // Zugriff
        System.out.println("\nZugriff auf Index 2 --> array[2]: " + array[2]);

        // Suchen
        int gesucht = 30;
        boolean gefunden = false;
        for (int z : array) {
            if (z == gesucht)
                gefunden = true;
        }
        System.out.println(
                "\nSuche nach " + gesucht + " --> for-Schleife: " + (gefunden ? "Gefunden!" : "Nicht gefunden."));

        // Resize
        int[] neu = new int[10];
        System.arraycopy(array, 0, neu, 0, array.length);
        neu[5] = 60;
        System.out.println(
                "\nVergrößertes Array --> System.arraycopy(array,srcPos,destPos,length): " + Arrays.toString(neu));
    }
}
