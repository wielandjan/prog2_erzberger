package com.example.Datenstrukturen.util;

public class Stack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }
    }

    public void push(T value) {
        Node<T> newNode = new Node<>(value, top);
        top = newNode;
        size++;
    }

    public T pop() {
        T value = top.getData();
        top = top.getNext();
        size--;
        return value;
    }

    public T peek() {
        return top.getData();
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = top;
        while (current != null) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }

}
