package com.example.Datenstrukturen;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void run() {
        System.out.println("\n=== Deque Demo ===");
        System.out.println("Eine Deque erlaubt Einfügen und Entfernen an beiden Enden.\n");

        Deque<String> deque = new LinkedList<>();

        // Elemente hinzufügen
        System.out.println("Füge A hinten hinzu.");
        deque.addLast("A");

        System.out.println("Füge B vorne hinzu.");
        deque.addFirst("B");

        System.out.println("Füge C hinten hinzu.");
        deque.addLast("C");

        System.out.println("\nAktueller Inhalt der Deque:");
        System.out.println(deque); // [B, A, C]

        // Elemente entfernen
        System.out.println("\nEntferne vorne:");
        String vorne = deque.pollFirst();
        System.out.println(vorne + " wurde entfernt.");

        System.out.println("\nEntferne hinten:");
        String hinten = deque.pollLast();
        System.out.println(hinten + " wurde entfernt.");

        System.out.println("\nInhalt nach den Entfernungen:");
        System.out.println(deque); // [A]
    }
}
