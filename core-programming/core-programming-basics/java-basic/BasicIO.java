//This class contains 3 ways for taking input from user

//Scanner class, System.Console , BufferedReader class
import java.util.Scanner;
public class BasicIO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taking input through Scanner class :");
        String a = scanner.next(); // next function skip the blank line
        System.out.println("Taking input through console ");
        String consoleInput = System.console().readLine();
        System.out.println("consoleInput :" + consoleInput );



        
    }
    
}
