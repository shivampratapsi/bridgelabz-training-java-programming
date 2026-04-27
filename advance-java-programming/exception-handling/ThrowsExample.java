
import java.io.IOException;

public class ThrowsExample {
    void m1() throws ArithmeticException { // mostly exception classes are inside java.lang package , others java.io
                                           // package
        int a = 1 / 0;
        System.out.println("m1");
    }

    void m2() {
        m1();
    }

    public static void main(String[] args) throws IOException {
        int num = 2;
        ThrowsExample te = new ThrowsExample();
        // te.m1();// it will throw error bcz. it is runtime error even You use
        // throws(it only
        // useful for compile time error)
        try {
            te.m2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("second try");
        // If you use try without catch then use finally with it .

        try {
            int a = 1;
            System.out.println("In try block");
            // throw new ArithmeticException();
        }
        // finally{} // blank finally
        finally {

            System.out.println("Finally block");
        }

    }
}

// Now it will ask for which file to run
class My extends ThrowsExample {
    public static void main(String[] args) {
        System.out.println("hi");
    }
}