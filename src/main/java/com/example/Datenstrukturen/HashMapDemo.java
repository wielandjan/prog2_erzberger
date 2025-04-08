package com.example.Datenstrukturen;

import java.util.HashMap;

public class HashMapDemo {
    public static void run() {
        System.out.println("\n=== HashMap Demo ===");
        System.out.println("Eine HashMap speichert Daten in Form von Schlüssel-Wert-Paaren.\n");

        HashMap<String, String> hashMap = new HashMap<>();

        // Einträge hinzufügen
        System.out.println("Füge Einträge hinzu --> hasMap.put(key,value):");
        hashMap.put("Name", "Max");
        System.out.println("Name → Max");
        hashMap.put("Alter", "25");
        System.out.println("Alter → 25");
        hashMap.put("Stadt", "Ravensburg");
        System.out.println("Stadt → Ravensburg");

        // Abrufen eines Wertes
        System.out.println("\nGib den Namen aus --> hasMap.get(key):");
        System.out.println(hashMap.get("Name")); // Max

        // Schlüssel überprüfen
        System.out.println("\nExistiert Schlüssel 'Alter'? --> hasMap.containsKey(key):");
        System.out.println(hashMap.containsKey("Alter")); // true

        // Eintrag entfernen
        System.out.println("\nEntferne Schlüssel 'Stadt' --> hasMap.remove(key):");
        hashMap.remove("Stadt");

        // Inhalt anzeigen
        System.out.println("Aktueller Inhalt:");
        System.out.println(hashMap); // {Name=Max, Alter=25}

    }
}
