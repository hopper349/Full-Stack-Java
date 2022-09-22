package Practise1.DS;

import java.util.LinkedList;

public class LL<T> {

    Node head = null;
    Node tail = null;
    int length = 0;

    //add
    //addFirst
    //addLast
    //remove(index)
    //removeFirst
    //removeLast

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        length++;
    }

    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null)
            head = newNode;
        else {
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
        length++;
    }

    public void remove(int index) {
        if (index > length - 1) {
            System.out.println("Out Of bonds");
        } else {
            if(index == 0){
                removeFirst();
            }
            else if(index == length-1){
                removeLast();
            }
            else{
                int i = 1;
                Node traverse = head;
                while (i < index) {
                    traverse = traverse.next;
                    i++;
                }
                traverse.next=null;
                length--;
            }
        }
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("Out of Bonds");
        } else {
            head = head.next;
            length--;
        }
    }

    public void removeLast() {
        if (tail == null) {
            System.out.println("Out of Bonds");
        } else if (head == tail) {
            removeFirst();
        } else {
            Node traverse = head;
            Node next = traverse.next;

            while (next.next != null) {
                traverse = traverse.next;
                next = traverse.next;
            }
            traverse.next = null;
            length--;
        }
    }
}
