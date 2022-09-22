package Concepts.CoreJava.Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Person implements Comparable<Person>{

    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person person) {
        if(name.length()== person.name.length())
            return 0;
        else if(name.length()>person.name.length())
            return 1;
        else
            return -1;
    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args) {
        List<Person> ll= new LinkedList<>();
        ll.add(new Person("Pomegranate"));
        ll.add(new Person("Appl"));
        ll.add(new Person("Banana"));
        ll.add(new Person("Chery"));

        System.out.println(ll);
        System.out.println("***************************************");

        Collections.sort(ll);
        System.out.println(ll);
    }
}
