import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5];
        // for (int i : number) {
        // i= scanner.nextInt();//pass by value
        // }
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();// Now it's not pass by reference also but it uses pointer to array(number)

        }
        for (int num : number) {
            if (num < 0) {
                System.out.println(num + " Number is negative");

            } else if (num == 0) {
                System.out.println(num + " Number is Zero");
            } else {
                if (num % 2 == 0) {
                    System.out.println(num + " Number is positive & even ");
                } else {
                    System.out.println(num + " Number is positive & odd ");
                }
            }

        }
        String check = (number[0] == number[number.length - 1]) ? "First & Last element of array are equal."
                : "First & Last element of array are not equal.";
        System.out.println(check);

    }
}