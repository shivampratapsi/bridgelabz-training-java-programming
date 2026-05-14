/*
12. Write regex patterns to validate: (a) university email format user@university.ac.in - must have
exactly 2-level domain ending in .ac.in; (b) roll number format AB2024001 - 2 uppercase
letters + 4-digit year + 3-digit sequence; (c) Indian mobile number starting with 6-9. Test each
with 4 valid and 4 invalid inputs.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RegexReview {

    public boolean emailValidator(String email) {

        if (email.matches("^[a-zA-Z0-9]+@[a-zA-Z]+\\.ac\\.in$")) {

            return true;
        }
        return false;
    }

    // AB2024001
    public boolean rollValidator(String roll) {
        if (roll.matches("^[A-Z]{2}\\d{4}\\d{3}$")) {
            return true;
        }
        return false;
    }

    // 6-9
    public boolean mobileValidator(String number) {
        if (number.matches("^[6-9]{1}[0-9]{9}$")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        RegexReview rr = new RegexReview();
        // a.
        System.out.println("Enter university email :- ");
        // user@university.ac.in
        String email = br.readLine().trim();
        // now check pattern
        System.out.println(rr.emailValidator(email));

        // b. Roll number format
        // AB2024001

        System.out.println("Enter roll number :");
        String rollNo = br.readLine().trim();
        System.out.println(rr.rollValidator(rollNo));

        // c. Indian mobile number starting digit 6-9

        System.out.println("Enter mobile number :");
        String phoneNumber = br.readLine().trim();
        System.out.println(rr.mobileValidator(phoneNumber));

    }
}
