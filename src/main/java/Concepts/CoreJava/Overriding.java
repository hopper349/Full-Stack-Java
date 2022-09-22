package Concepts.CoreJava;

public class Overriding {

    public static void print(){
        System.out.println("Dipanshu");
    }

    public static void print(String name){
        System.out.println("Dipanshu" + name);
    }

    public static void main(String[] args) {
        Overriding.print(" Saini");
    }
}
