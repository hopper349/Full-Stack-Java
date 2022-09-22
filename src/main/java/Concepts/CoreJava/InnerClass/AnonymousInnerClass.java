package Concepts.CoreJava.InnerClass;

public abstract class AnonymousInnerClass {
    public abstract void message();
}

class abc{
    AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass() {
        @Override
        public void message() {
            System.out.println("Heyy");
        }
    };

    public static void main(String[] args) {
        new abc().anonymousInnerClass.message();
    }
}
