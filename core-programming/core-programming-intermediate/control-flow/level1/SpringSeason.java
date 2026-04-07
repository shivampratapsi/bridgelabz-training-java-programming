import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month ");
        String month = scanner.next().toLowerCase();
        System.out.println("Enter day in number :");
        int day = scanner.nextInt();
        boolean isSpringSeason = false;

        if (month.equals("march") && (day >= 20 && day <= 31)) {
            isSpringSeason = true;
        } else if (month.equals("april") && (day >= 1 && day <= 30)) {
            isSpringSeason = true;
        } else if (month.equals("may") && (day >= 1 && day <= 31)) {
            isSpringSeason = true;
        } else if (month.equals("june") && (day >= 1 && day <= 20)) {
            isSpringSeason = true;
        }

        if (isSpringSeason) {
            System.out.println("It's a Spring season.");
        } else {
            System.out.println("Not a Spring Season.");
        }
        scanner.close();
    }

}
