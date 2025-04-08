package com.example.Datenstrukturen;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void run() {
        System.out.println("\n=== Queue Demo ===");
        System.out.println("Eine Queue funktioniert nach dem FIFO-Prinzip (First In – First Out).\n");

        Queue<String> queue = new LinkedList<>();

        // Elemente hinzufügen
        System.out.println("Füge A, B, C zur Warteschlange hinzu.");
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println("Aktueller Inhalt: " + queue); // [A, B, C]

        // Erstes Element entfernen
        System.out.println("\nEntferne erstes Element:");
        String entfernt = queue.poll();
        System.out.println(entfernt + " wurde entfernt.");

        // Inhalt nach Entfernung
        System.out.println("\nAktueller Inhalt der Queue:");
        System.out.println(queue); // [B, C]

        // Nächstes Element ansehen
        System.out.println("\nNächstes Element (peek):");
        System.out.println(queue.peek()); // B
    }
}
