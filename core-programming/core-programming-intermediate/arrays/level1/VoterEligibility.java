import java.util.InputMismatchException;
import java.util.Scanner;

class VoterEligibility  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        byte[] age = new byte[10];
        System.out.println("Enter age of studentd :");
        for (int i = 0; i < age.length; i++) {
            age[i] = scanner.nextByte();

        }
        
        for (int i : age) {
            if (i > 0) {
                if (i >= 18 ) {
                    System.out.println("The student with the age " + i + " can vote.");
                } else {
                    System.out.println("The student with age " + i + " cannot vote.");
                }
            } else {
                System.out.println("Enter valid age !");

            }
        }
    }
        catch(InputMismatchException e){
            System.out.println("Enter Valid age ");
        }
        
        scanner.close();
    }
}