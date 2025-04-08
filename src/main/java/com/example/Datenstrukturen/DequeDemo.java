package com.example.Datenstrukturen;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void run() {
        System.out.println("\n=== Deque Demo ===");
        System.out.println("Eine Deque erlaubt Einfügen und Entfernen an beiden Enden.\n");

        Deque<String> deque = new LinkedList<>();

        // Elemente hinzufügen
        System.out.println("\nFüge A hinten hinzu --> deque.addLast(String e):");
        deque.addLast("A");
        System.out.println(deque);

        System.out.println("\nFüge B vorne hinzu --> deque.addFirst(String e):");
        deque.addFirst("B");
        System.out.println(deque);

        System.out.println("\nFüge C hinten hinzu  --> deque.addLast(String e):");
        deque.addLast("C");
        System.out.println(deque);

        System.out.println("\nAktueller Inhalt der Deque:");
        System.out.println(deque); // [B, A, C]

        // Elemente entfernen
        System.out.println("\nEntferne vorne --> deque.pollFirst():");
        String vorne = deque.pollFirst();
        System.out.println(vorne + " wurde entfernt.");
        System.out.println(deque);

        System.out.println("\nEntferne hinten --> deque.pollLast():");
        String hinten = deque.pollLast();
        System.out.println(hinten + " wurde entfernt.");
        System.out.println(deque);

        System.out.println("\nInhalt nach den Entfernungen:");
        System.out.println(deque); // [A]
    }
}
