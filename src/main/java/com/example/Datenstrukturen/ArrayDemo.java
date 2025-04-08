package com.example.Datenstrukturen;

import java.util.Arrays;

public class ArrayDemo {
    public static void run() {
        System.out.println("\n=== Array Demo ===");
        System.out.println("Ein Array speichert feste Datenmengen mit schnellem Zugriff (O(1)).\n");

        int[] zahlen = { 10, 20, 30, 40, 50 };
        System.out.println("Original-Array: " + Arrays.toString(zahlen));

        // Zugriff
        System.out.println("Zugriff auf Index 2: " + zahlen[2]);

        // Suchen
        int gesucht = 30;
        boolean gefunden = false;
        for (int z : zahlen) {
            if (z == gesucht)
                gefunden = true;
        }
        System.out.println("Suche nach " + gesucht + ": " + (gefunden ? "Gefunden!" : "Nicht gefunden."));

        // Resize
        int[] neu = new int[10];
        System.arraycopy(zahlen, 0, neu, 0, zahlen.length);
        neu[5] = 60;
        System.out.println("Vergrößertes Array: " + Arrays.toString(neu));
    }
}
