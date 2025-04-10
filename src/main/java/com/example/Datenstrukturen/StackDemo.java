package com.example.Datenstrukturen;

import com.example.Datenstrukturen.util.Stack;

public class StackDemo {
    public static void run() {
        System.out.println("\n=== Stack Demo ===");
        System.out.println("Ein Stack arbeitet nach dem LIFO-Prinzip (Last In – First Out).\n");

        Stack<String> stack = new Stack<>();

        // Elemente hinzufügen
        System.out.println("Füge A, B, C zum Stack hinzu --> stack.push(item):");
        stack.push("A");
        stack.push("B");
        stack.push("C");
        System.out.println(stack); // [A, B, C]

        // Element entfernen
        System.out.println("\nEntferne oberstes Element--> stack.pop():");
        String entfernt = stack.pop();
        System.out.println(entfernt + " wurde entfernt.");

        // Inhalt nach pop
        System.out.println("\nAktueller Inhalt des Stacks:");
        System.out.println(stack); // [A, B]

        // Spitze des Stacks anzeigen
        System.out.println("\nSpitze des Stacks --> stack.peak():");
        System.out.println(stack.peek()); // B
    }
}
