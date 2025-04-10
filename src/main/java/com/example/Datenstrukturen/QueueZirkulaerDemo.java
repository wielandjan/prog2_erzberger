package com.example.Datenstrukturen;

import com.example.Datenstrukturen.util.QueueZirkulaer;;

public class QueueZirkulaerDemo {
    public static void run() {
        System.out.println("\n=== Queue Demo ===");
        System.out.println(
                "Eine Queue funktioniert nach dem FIFO-Prinzip mit einer maximalen Länge (First In – First Out).\n");

        QueueZirkulaer<String> queue = new QueueZirkulaer<>(3);

        // Elemente hinzufügen
        System.out.println("\nFüge A, B, C zur Warteschlange(3) hinzu --> queue.add(element):");
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        System.out.println("Aktueller Inhalt: " + queue); // [A, B, C]

        System.out.println("\nFüge D zur Warteschlange(3) hinzu --> queue.add(element):");
        queue.enqueue("D");
        System.out.println("Aktueller Inhalt: " + queue); // [A, B, C]

        // Erstes Element entfernen
        System.out.println("\nEntferne erstes Element --> queue.poll():");
        String entfernt = queue.dequeue();
        System.out.println(entfernt + " wurde entfernt.");
        System.out.println("Aktueller Inhalt: " + queue);

        // Inhalt nach Entfernung
        System.out.println("\nAktueller Inhalt der Queue:");
        System.out.println("Aktueller Inhalt: " + queue);

        // Nächstes Element ansehen
        System.out.println("\nNächstes Element --> queue.peek():");
        System.out.println(queue.peek()); // B
        System.out.println("Aktueller Inhalt: " + queue);
    }
}
