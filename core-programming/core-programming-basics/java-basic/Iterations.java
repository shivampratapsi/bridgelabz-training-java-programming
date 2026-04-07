/*
Iterations or loops :
1.For loop
2.While loop
3.Do while loop
4.for each 
*/

public class Iterations {
    public static void main(String[] args) {

        // For loop
        int loopCount = 5;
        for (int i = 1; i <= loopCount; i++) {
            System.out.println("Inside first for loop " + i + " times");
        }
        for (int i = 1; i <= 5;) {
            System.out.println("Inside second for loop " + ++i);// but avoid these
        }

        // While loop
        int whileCount = 1;
        while (whileCount <= 5) {
            System.out.println("Inside first while loop " + whileCount++);

        }

        while (whileCount > 1) {
            whileCount--;
            System.out.println("Inside second while loop" + whileCount);
        }

        // Do While loop
        int doCount = 5;
        do {
            System.out.println("Inside first do While loop " + doCount);
            doCount--;
        } while (doCount > 0);

        do {
            doCount++;
            System.out.println("Inside second do while loop " + doCount);
        } while (doCount < 5);

        // For each loop
        // int[] array =new int[5];
        int[] array = { 1, 2, 3, 4, 5 };
        for (int iterator : array) {
            System.out.println("Inside for each loop " + iterator);
        }

    }

}
