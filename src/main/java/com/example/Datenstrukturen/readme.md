# Datenstrukturen in Java – Kapitel 2

Dieses Java-Projekt veranschaulicht die grundlegenden Datenstrukturen aus Kapitel 2 des Moduls **"Programmierung II – Datenstrukturen und Algorithmen"** .

Jede Datenstruktur ist in einer eigenen Java-Klasse implementiert und wird über ein Hauptmenü (`Main.java`) ausführbar gemacht.  
Das Projekt dient dem Lernen, Wiederholen und Ausprobieren der Funktionsweise sowie der Komplexität typischer Datenstrukturen in Java.

---

## 🔹 2.0 Was sind Datenstrukturen?

Datenstrukturen sind **systematische Organisationsformen von Daten**, die es ermöglichen, effizient mit Informationen umzugehen.  
Sie entscheiden maßgeblich darüber, wie schnell Algorithmen arbeiten können.

### 📦 Vorteile guter Datenstrukturen:

- Daten effizient speichern
- Schnellen Zugriff ermöglichen
- Einfügen und Löschen optimieren
- Grundlage für komplexe Algorithmen

Typische Datenstrukturen:

- Arrays
- LinkedLists
- Stacks
- Queues
- Deques
- HashMaps

🧠 **Merksatz:**

> "Die Wahl der richtigen Datenstruktur ist oft entscheidender als der eigentliche Algorithmus."

---

## 🔹 2.1 Arrays

### 📦 Was ist ein Array?

Ein **Array** ist eine lineare Datenstruktur, die:

- eine **feste Anzahl von Elementen** speichert,
- **gleichartigen Datentyp** voraussetzt,
- und **direkten Zugriff über einen Index** bietet.

```java
int[] zahlen = {10, 20, 30, 40};
System.out.println(zahlen[2]); // Ausgabe: 30
```

### ✅ Eigenschaften

| Merkmal       | Beschreibung                                      |
| ------------- | ------------------------------------------------- |
| Feste Größe   | Nach Initialisierung nicht mehr veränderbar       |
| Homogener Typ | Alle Elemente haben den gleichen Datentyp         |
| Index-Zugriff | Sehr schneller Zugriff per `array[i]`             |
| Speicherort   | Elemente liegen im **zusammenhängenden Speicher** |

---

### ⚙️ Wichtige Operationen

| Operation   | Beschreibung                           | Laufzeit |
| ----------- | -------------------------------------- | -------- |
| `get(i)`    | Element an Position `i` lesen          | O(1)     |
| `set(i, x)` | Element an Position `i` überschreiben  | O(1)     |
| Suchen      | Lineare Suche nach Wert                | O(n)     |
| Einfügen    | Nur durch Erstellen eines neuen Arrays | O(n)     |
| Löschen     | Elemente nach Entferntem verschieben   | O(n)     |

---

## 🔹 2.2 LinkedList

### 🔗 Was ist eine LinkedList?

Eine **LinkedList** besteht aus **Knoten (Nodes)**, die:

- einen Wert speichern
- eine Referenz auf das nächste (und evtl. vorherige) Element enthalten

### ✅ Eigenschaften

- Dynamische Größe
- Einfügen/Löschen am Anfang oder Ende sehr effizient → **O(1)**
- Kein direkter Index-Zugriff → **O(n)**

```java
LinkedList<String> liste = new LinkedList<>();
liste.addFirst("B");
liste.addLast("C");
liste.add(0, "A");
```

### 🔧 Methoden (Beispiele)

- `addFirst()`, `addLast()`, `add(index, x)`
- `get(index)`, `contains(x)`, `indexOf(x)`
- `removeFirst()`, `removeLast()`

---

## 🔹 2.3 Queue

### 🔁 Was ist eine Queue?

Eine Queue arbeitet nach dem **FIFO-Prinzip**:  
**First In – First Out**

Beispiel: Warteschlange in der Mensa 🍽️

### 🧪 Java-Implementierung mit LinkedList

```java
Queue<String> queue = new LinkedList<>();
queue.add("A");
queue.add("B");
System.out.println(queue.poll()); // → A (entfernt)
System.out.println(queue.peek()); // → B (anschauen)
```

### ✅ Methoden

| Methode  | Beschreibung                  |
| -------- | ----------------------------- |
| `add(e)` | Einfügen hinten               |
| `poll()` | Entfernen vorne (oder `null`) |
| `peek()` | Erstes Element anschauen      |

---

## 🔹 2.4 Deque (Double-Ended Queue)

### 🔄 Was ist eine Deque?

Eine **Deque** erlaubt Einfügen und Entfernen **an beiden Enden** – also Kombination aus **Stack** und **Queue**.

```java
Deque<String> deque = new LinkedList<>();
deque.addFirst("B");
deque.addLast("C");
System.out.println(deque.pollFirst()); // B
System.out.println(deque.pollLast());  // C
```

### ✅ Typische Methoden

| Methode       | Beschreibung             |
| ------------- | ------------------------ |
| `addFirst(e)` | Vorne einfügen           |
| `addLast(e)`  | Hinten einfügen          |
| `pollFirst()` | Vorne entfernen          |
| `pollLast()`  | Hinten entfernen         |
| `peekFirst()` | Erstes Element anzeigen  |
| `peekLast()`  | Letztes Element anzeigen |

---

## 🔹 2.5 Stack

### 📚 Was ist ein Stack?

Ein Stack arbeitet nach dem **LIFO-Prinzip**:  
**Last In – First Out**

Beispiel: Bücherstapel 📚 – was zuletzt oben liegt, wird zuerst genommen.

### 🧪 Java-Implementierung

```java
Stack<String> stack = new Stack<>();
stack.push("A");
stack.push("B");
System.out.println(stack.pop());  // B
System.out.println(stack.peek()); // A
```

### ✅ Methoden

| Methode   | Beschreibung             |
| --------- | ------------------------ |
| `push(e)` | Element oben drauflegen  |
| `pop()`   | Element oben entfernen   |
| `peek()`  | Oberstes Element ansehen |

---

## 🔹 2.6 Hashing & HashMap

### 📦 Was ist Hashing?

Hashing ist ein Verfahren, um Daten **sehr schnell über einen Schlüssel zu finden**.  
Eine **Hashfunktion** berechnet, wo im Speicher der Wert liegt.

---

### ✅ HashMap = Schlüssel → Wert

Beispiel:

```
"Name" → "Max"
"ID"   → "12345"
```

### 🧪 Java-Beispiel

```java
HashMap<String, String> map = new HashMap<>();
map.put("Name", "Max");
System.out.println(map.get("Name")); // → Max
```

### 📊 Wichtige Methoden

| Methode          | Beschreibung                       |
| ---------------- | ---------------------------------- |
| `put(k, v)`      | Schlüssel-Wert-Paar speichern      |
| `get(k)`         | Wert zu einem Schlüssel abrufen    |
| `containsKey(k)` | Prüfen, ob Schlüssel vorhanden ist |
| `remove(k)`      | Eintrag löschen                    |
| `keySet()`       | Alle Schlüssel erhalten            |
| `values()`       | Alle Werte erhalten                |

---

### 🧠 Wie funktioniert's?

1. `put("Max", "Student")`
2. Hashfunktion berechnet z. B. Index `42`
3. "Student" wird an Index `42` gespeichert
4. `get("Max")` → Index `42` → Wert gefunden

---

## 📌 Komplexitätsübersicht

| Struktur   | Zugriff | Suche  | Einfügen | Löschen |
| ---------- | ------- | ------ | -------- | ------- |
| Array      | O(1)    | O(n)   | O(n)     | O(n)    |
| LinkedList | O(n)    | O(n)   | O(1)     | O(1)    |
| Queue      | O(n)    | O(n)   | O(1)     | O(1)    |
| Stack      | O(n)    | O(n)   | O(1)     | O(1)    |
| Deque      | O(n)    | O(n)   | O(1)     | O(1)    |
| HashMap    | –       | O(1) ∅ | O(1) ∅   | O(1) ∅  |

> 📘 Dieses Projekt dient dem Lernen und Verstehen der zugrunde liegenden Datenstrukturen und deren Laufzeitverhalten.  
> Jede Klasse demonstriert typische Operationen, ergänzt durch erklärende Konsolenausgaben.
