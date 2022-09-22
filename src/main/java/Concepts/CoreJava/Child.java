package Concepts.CoreJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Child extends Overriding{

    public static void print(){
        System.out.println("Saini");
    }

    public static void main(String[] args) {
//        Child overriding = new Child();
//
//        overriding.print();
//        Overriding.print();

        new Child().regexx("Dipanshu#22@212");
    }


    public void regexx(String str){

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

//        System.out.println(matcher.matches());
        matcher.find();
        System.out.println(matcher.group());
        System.out.println(matcher.start());
        System.out.println(matcher.end());
        matcher.find();
        System.out.println(matcher.group());
        System.out.println(matcher.start());
        System.out.println(matcher.end());

    }
}
