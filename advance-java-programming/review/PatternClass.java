/*
13. Use Pattern.compile() and Matcher.matches() for full-string validation. Use Matcher.find() for
sub-string search in a paragraph. Clearly demonstrate the difference: matches() fails if the regex
doesn't cover the WHOLE string; find() succeeds if the pattern exists ANYWHERE.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternClass {

    // matches takes entire string
    // but find() search only substring

    public void ValidatePatternWithMatches(String sentence, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(sentence);
        // if you use while loop then it is infinite
        if (match.matches()) {// matches only search full string not substring

            System.out.println("Found pattern at " + match.start() + " index");
        } else {
            System.out.println("Not find pattern inside the sentence");
        }
    }

    public void ValidatePatternWithFind(String sentence, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher match = pattern.matcher(sentence);
        boolean findMatch = false;
        while (match.find()) {
            System.out.println("Pattern found at index " + match.start());
            findMatch = true;
        }

        if (!findMatch) {
            System.out.println("Not found ");
        }
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        PatternClass p = new PatternClass();
        System.out.println("Enter sentence");
        String sentence = br.readLine().trim().toLowerCase();
        String regex = "[a-c]{2}";// here matches will fail because length will 3
        p.ValidatePatternWithFind(sentence, regex);
        System.out.println("+=+=+=+=+=+=+=");
        p.ValidatePatternWithMatches(sentence, regex);
        System.out.println("+=+=+=+=+=+=+=");

    }
}
