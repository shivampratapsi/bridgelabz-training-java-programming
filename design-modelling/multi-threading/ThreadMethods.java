public class ThreadMethods implements Runnable {
    public void run() {
        System.out.println("Runnable interface");
    }

    void m1() {
        System.out.println();
    }

    public static void main(String[] args) throws IllegalThreadStateException {

        // Thread thread = new Thread( new Runnable(){

        // public void run(){
        // System.out.println("using anonymous class"); // now only this one run
        // }
        // });

        // using lambda expression
        Thread thread = new Thread(() -> {
            System.out.println("Using Lambda expession");
        });
        System.out.println(thread.getState());// NEW before start called
        thread.start();
        System.out.println(thread.getState());// runnable

        thread.setName("custom name");
        System.out.println(thread.getName());
        System.out.println(thread.getPriority()); // default is 5
        // an estimate of the number of active threads in the current thread's thread
        // group and in any other thread group that has the current thread's thread
        // group as an ancestor
        System.out.println(Thread.activeCount());
        // Returns the state of this thread. This method is designed for use in
        // monitoring of the system state, not for synchronization control.

        System.out.println(thread.getState()); // terminated after run() called

    }
}
// Synchronized Methods
// synchronized void m1(){
// System.out.println("Synchronized block");
// }

// Synchronized block - for only specific lines that handle sensitive data
// In this we have to provide object in this
// Synchronized(this) { }

// one more thing is static Synchronization then instance of other classes can't
// access