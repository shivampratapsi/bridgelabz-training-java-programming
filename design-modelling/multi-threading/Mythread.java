public class Mythread extends Thread {
    @Override
    public void run() {

        System.out.println("RUn method");
    }

    public static void main(String[] args) {
        Mythread mythread = new Mythread();

        mythread.start();
        System.out.println(mythread.getName());
        System.out.println(Thread.currentThread());

        System.out.println("====================");
        System.out.println("====================");

        Thread t = new Thread() {
        };
        t.start();
        System.out.println(t.getName());
        t.setName("new");
        System.out.println(t.getName());
        System.out.println(Thread.currentThread());
        // t.start();// can't start same thread again , ohterwise
        // IllegalThreadStateException - if the thread was already started.
        t.run();
        mythread.run();

        System.out.println("====================");
        System.out.println("====================");
        // below code can run without implementing Runnable interface.
        // bcz. if we use lambda expressin then internally JVM treats as using RUnnable
        // MyRunnable r = new MyRunnable(){
        // public void run(){
        // System.out.println("Using lambda");
        // }
        // } ;
        // Thread t = new Thread(r);
        //

        Thread t1 = new Thread(() -> {
            System.out.println("Using lambda");
        });
        t1.start();
    }

}
// Thread t1 = new Thread(() -> {
// System.out.println("Running a quick task in a new thread!");
// });
// t1.start();
