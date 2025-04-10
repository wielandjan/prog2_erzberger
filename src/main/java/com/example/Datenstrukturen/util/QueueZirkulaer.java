package com.example.Datenstrukturen.util;

public class QueueZirkulaer<T> {
    private Node<T> tail;
    private Node<T> head;
    private int size;
    private final int maxSize;

    private static class Node<T> {
        private T data;
        private Node<T> next;

        Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    public QueueZirkulaer(int maxSize) {
        this.maxSize = maxSize;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (size == 0) {
            newNode.setNext(newNode);
            tail = newNode;
        } else {
            newNode.setNext(tail.getNext());
            tail.setNext(newNode);
            tail = newNode;
        }
        if (size < maxSize) {
            size++;
        } else {
            throw new IllegalStateException("Queue is full");
        }
    }

    public T dequeue() {
        if (size == 0)
            throw new IllegalStateException("Queue is empty");
        head = tail.getNext();
        if (size == 1) {
            tail = head;
        } else {
            tail.setNext(head.getNext());
        }
        size--;
        return head.getData();
    }

    public T peek() {
        if (size == 0)
            throw new IllegalStateException("Queue is empty");
        return tail.getNext().getData();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (tail == null)
            return "null";
        StringBuilder sb = new StringBuilder();
        Node<T> current = tail.getNext();
        for (int i = 0; i < size; i++) {
            sb.append(current.getData()).append(" -> ");
            current = current.getNext();
        }
        sb.append("(head)");
        return sb.toString();
    }
}