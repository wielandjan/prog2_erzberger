package com.example.Datenstrukturen;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void run() {
        System.out.println("\n=== LinkedList Demo ===");
        System.out.println("Eine LinkedList besteht aus verketteten Nodes mit flexibler Größe.\n");

        LinkedList<String> linkedList = new LinkedList<>();

        // Füge 'B' am Anfang hinzu.
        System.out.println("Füge 'B' am Anfang hinzu.");
        linkedList.addFirst("B");
        System.out.println(linkedList.toString());
        // Füge 'C' am Ende hinzu.
        System.out.println("Füge 'C' am Ende hinzu.");
        linkedList.addLast("C");
        System.out.println(linkedList.toString());
        // Füge 'A' an Position 0 ein.
        System.out.println("Füge 'A' an Position 0 ein.");
        linkedList.add(0, "A");
        System.out.println(linkedList.toString());

        // Aktueller Inhalt der Liste.
        System.out.println("Aktueller Inhalt der Liste.");
        System.out.println("A → B → C → null");
        System.out.println(linkedList.toString());

        // Zugriff auf Index 1:
        System.out.println("Zugriff auf Index 1:");
        System.out.println(linkedList.get(1).toString());

        System.out.println("Zugriff auf 'A':");
        System.out.println("Enthält A?: " + linkedList.contains("A") + "| Index: " + linkedList.indexOf("A"));
    }
}
