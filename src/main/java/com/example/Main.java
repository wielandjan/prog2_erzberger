package com.example;

import java.util.Deque;
import java.util.Scanner;

import com.example.Datenstrukturen.ArrayDemo;
import com.example.Datenstrukturen.DequeDemo;
import com.example.Datenstrukturen.LinkedListDemo;
import com.example.Datenstrukturen.QueueDemo;
import com.example.Datenstrukturen.StackDemo;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("==== Datenstrukturen Menü ====");
            System.out.println("1. Array");
            System.out.println("2. LinkedList");
            System.out.println("3. Queue");
            System.out.println("4. Deque");
            System.out.println("5. Stack");
            System.out.println("6. HashMap");
            System.out.println("0. Beenden");
            System.out.print("Wähle eine Option: ");

            int auswahl = sc.nextInt();

            switch (auswahl) {
                case 1 -> ArrayDemo.run();
                case 2 -> LinkedListDemo.run();
                case 3 -> QueueDemo.run();
                case 4 -> DequeDemo.run();
                case 5 -> StackDemo.run();
                // case 6 -> HashMapDemo.run();
                case 0 -> {
                    running = false;
                    System.out.println("Programm beendet.");
                }
                default -> System.out.println("Ungültige Eingabe.");
            }
            System.out.println();
        }

        sc.close();
    }
}
