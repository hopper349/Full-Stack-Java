package Concepts.CoreJava.InnerClass;

public class NonStaticIC{

    private Lock lock;
    protected String message = "Hello India!!";

    public NonStaticIC() {
        this.lock = new Lock();
    }

    /**
     * NON STATIC Inner Class
     */
    public class Lock {
        private boolean lock;

        Lock() {
            lock = false;
        }

        public boolean isLocked() {
            if(this.lock)
                return true;
            else
                return false;
        }

        public boolean isLock() {
            return lock;
        }

        public void setLock(boolean lock) {
            this.lock = lock;
        }
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }


    public static void main(String[] args) {
        System.out.println(new NonStaticIC().getLock().isLock());
    }
}
