package Concepts.CoreJava.AccessModifiers;

import Concepts.CoreJava.InnerClass.NonStaticIC;

public class App extends NonStaticIC{

    public void main() {
        System.out.println(new A().msg);
        System.out.println(message);
    }
}
