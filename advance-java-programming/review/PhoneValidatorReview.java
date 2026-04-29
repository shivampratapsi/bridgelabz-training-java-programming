import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneValidatorReview {

    void ValidatePhone(String number, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(number);
        if (match.matches()) {
            System.out.println("Yes validate number");
        } else {
            System.out.println("Not validate number");
        }
    }

    public static void main(String[] args) {
        PhoneValidatorReview pvr = new PhoneValidatorReview();
        // here we ? to make 0 or 1
        String regex = "\\+?\\d{2}\\d{10}";
        pvr.ValidatePhone("+919548968818", regex);
    }

}
