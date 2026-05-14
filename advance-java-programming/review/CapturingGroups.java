/*
Parse a log entry format: [LEVEL] YYYY-MM-DD HH:MM:SS ClassName - Message. Use
capturing groups (group(1) through group(5)) to extract each field. Print a formatted report:
'Level: ERROR | Class: GradeService | Issue: NullPointerException'.
*/

import java.util.regex.*;

// import java.util.regex.Matcher;
// import java.util.regex.Pattern;
public class CapturingGroups {

    void printFormatReport(String input, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(input);
        // for printing individual group
        if (match.find()) {
            System.out.print("Level1 : " + match.group(1) + "|");
            System.out.print("Class : " + match.group(4) + "|");
            System.out.println("Issue: " + match.group(5));
        } else {
            System.out.println("Match not found");
        }

    }

    public static void main(String[] args) {
        CapturingGroups cg = new CapturingGroups();
        String input = "[Error] 2026-05-01 22:12:59 CaptureGroups - Invalid entry";
        // [w] this means take only one word \\w+ take more than one ,[(\\w+)]now this
        // is group
        String regex = "\\[(\\w+)\\] (\\d{4}-\\d{2}-\\d{2}) (\\d{2}:\\d{2}:\\d{2}) (\\w+) - (.*)";

        cg.printFormatReport(input, regex);

    }

}

