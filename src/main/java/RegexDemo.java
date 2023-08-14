import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("stepIt", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("visit StepIt!");

        boolean matchFound = matcher.find();

        if (matchFound){
            System.out.println("Match found!");
        } else {
            System.out.println("Match NOT found!");
        }

        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","aryfgffcddun32"));
        System.out.println(Pattern.matches("[a-zA-Z0-9?]{6}","a?un32"));
        System.out.println("______________________________________");
        System.out.println(Pattern.matches("[67][89][0-9]{6}","69123458"));

        String EXAMPLE_TEXT = "This is an example of a text    , please check if it got corrected . here !";
        String pattern1 = "(\\w)(\\s+)([\\.,?!])";
        System.out.println(EXAMPLE_TEXT.replaceAll(pattern1,"$1$3"));
    }
}
