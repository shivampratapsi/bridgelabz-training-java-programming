//This class contains 3 ways for taking input from user

//Scanner class, System.Console , BufferedReader class
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taking input through Scanner class :");
        String a = scanner.next(); // next function skip the blank line

        // Using System.console
        System.out.println("Taking input through console ");
        String consoleInput = System.console().readLine();
        System.out.println("consoleInput :" + consoleInput);

        // Using Buffered Reader with try-catch
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            // In below code order also matter for read() & readLine()
            String input1 = br.readLine(); // it reads full line
            int input = br.read(); // it read only single character
            System.out.println(input);
        } catch (IOException v) {
            System.out.println("IO exception occur");
        } finally {
            System.out.println("I am finally block for BufferReader");
        }
        //only one at a time
        // br.close();
        // scanner.close();

    }

}
