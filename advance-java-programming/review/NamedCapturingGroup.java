/* 
15. Use named capturing groups ( ?< level> ... ), ( ?< date> ... ), ( ?< message> ... ) to extract fields by
name using matcher.group('level'). Rewrite the previous task with named groups - compare
readability.
[LEVEL] YYYY-MM-DD HH:MM:SS ClassName - Message
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NamedCapturingGroup {
    void MatchingPattern(String regex, String input) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        try {
            if (match.find()) {
                System.out.println("Found");
                System.out.println(
                        "Level :" + match.group("level") + " date " + match.group("date") + " time "
                                + match.group("time")
                                + "class Name " + match.group("className") + " message " + match.group("message"));
            } else {
                System.out.println("Not found pattern");
            }
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }
        ;

    }

    public static void main(String[] args) {
        NamedCapturingGroup ncg = new NamedCapturingGroup();
        String input = "[ERROR1234] 2026-02-01 11:50:50 NamedCapturingGroup - This is an error.";
        String regex = "\\[(?<level>\\w+)\\] (?<date>\\d{4}-\\d{2}-\\d{2}) (?<time>\\d{2}:\\d{2}:\\d{2}) (?<className>\\w+) - (?<message>.*)";
        // here we also use name with group
        ncg.MatchingPattern(regex, input);

    }
}