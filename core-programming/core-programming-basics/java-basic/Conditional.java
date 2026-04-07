/*
Conditional statements
1.If else
2.Ternary
3.Switch case
*/

public class Conditional {
    public static void main(String[] args) {

        // If else example 1
        int number1 = 1, number2 = 3;
        if (++number1 > number2) {
            System.out.println(number1 + "is greater than " + number2);
        } else if (number1++ == --number2) {
            System.out.println(number1 + " and " + number2 + " are equal.");
        } else {
            System.out.println("Numbers are not equal");
        }

        // If else example 2
        int age = 25;
        String city = "Noida";
        if (age < 20) {
            if (city.equals("Noida")) {
                System.out.println("Both condition satisfy");
            } else {
                System.out.println("City must be Noida");
            }
        }

        // Ternary (condition)? true : false
        int variable = (3 > 4) ? 3 : 4; // 4
        String complexVariable = (3 * 2 > 8) ? "true" : ("magic".equals("Magic")) ? "true" : "false"; // false
        
        // Switch case

        // switch (args) {
        // case value: this value in case must be constant not variable
        //
        // default:
        // }

        // Switch Example 1
        // switch case with fallthrough (without break)

        int count = 1;
        switch (count) {
            // case 0 will be ignored
            case 0:
                count++;
                System.out.println("case 0");
                // all cases after 1 will get execute
            case 1:
                System.out.println("case 1");
                return;// program will not execute remaining lines
            case 2:
                System.out.println("case 2");
            default:
                System.out.println("default case");

        }

        // Switch Example 2

        switch (count) {
            case 4:
                System.out.println("case 4");// this will ignored
            case 1:
                System.out.println("case 1");
                break;
            default:
                System.out.println("default case");
        }

        // Switch Example 3
        switch ("case") {
            case "case 1":
                System.out.println("case 1");
                break;
            case "case 2":
                System.out.println("case 2");
                break;
        }

    }

}
