package Concepts.CoreJava.InnerClass;

public class LocalInnerClass {

    public LocalInnerClass() {
    }

    public boolean isLocked(String key) {

        /**
         * Local Inner Class
         * <p>Scope is restricted to a code block
         */
        class Lock {
            public boolean isLocked(String key) {
                if (key.equals("abc"))
                    return true;
                else
                    return false;
            }
        }
        return new Lock().isLocked(key);
    }


    public static void main(String[] args) {
//        System.out.println(new LocalInnerClass().isLocked("abc"));
        StaticIC staticIC = new StaticIC();
        System.out.println(StaticIC.getMsg());
    }
}
