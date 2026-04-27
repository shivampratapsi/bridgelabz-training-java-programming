public class CustomException {

    // Checked exception inlcude IOException , FileNotFoundException , SQLException,
    // ClassNotFoundException

    static class InvalidInputException extends Exception {

        InvalidInputException() {
            // System.out.println("Invalid input exception occurred!"); not recommended
            // super();
        }

        InvalidInputException(String message) {// Here the message is local variable ,
            // so if we pass any argument to it , its simply ignored it and call super() if
            // don't explicitly called super(message)
            // So it prints null.

            // super(message);
        }
    }

    // unchecked exception
    static class InvalidNumberException extends RuntimeException {
        InvalidNumberException() {
            // System.out.println("Error occurred !");// not recommended
            super(); // or it is implicitly called by constructor

        }
    }

    public static void main(String[] args) {
        int a = 1;

        try {
            if (a < 2) {
                System.out.println("Before caught exception!");
                // throw new InvalidInputException("error");
                throw new InvalidInputException();
                // throw new InvalidNumberException();
            }
            int b = 1 / 0;
        }
        // If you declare a catch block for a checked exception (InvalidInputException), the compiler requires that the try block actually contains code for handling this exception
        // It doesn't show any error in exception that are runtime bcz.  compiler does not track where these are thrown.
        catch (ArithmeticException | InvalidInputException | InvalidNumberException e) { // using pipe operator
        
            // System.out.println("Caught exception: " + e.getMessage());
            // for checking type of exception we can use instanceof or printStackTrace()
            e.printStackTrace(); // for printing details where exception occurred.
            String type = (e instanceof InvalidNumberException) ? "InvalidNumberException"
                    : (e instanceof ArithmeticException) ? "Arithmetic Exception" : "InvalidInputException";
            System.out.println(type);
        }
        System.out.println("Ending");
    }
}