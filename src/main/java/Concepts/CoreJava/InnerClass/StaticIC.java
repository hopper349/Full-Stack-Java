package Concepts.CoreJava.InnerClass;

public class StaticIC {

    private static String msg= "neeww";

    public static class Inner{

        public void message(){
            System.out.println("Hello !!!");
        }
    }

    public static String getMsg() {
        return msg;
    }

    public static void main(String[] args) {
        StaticIC.Inner inner = new StaticIC.Inner();
        inner.message();
    }
}
