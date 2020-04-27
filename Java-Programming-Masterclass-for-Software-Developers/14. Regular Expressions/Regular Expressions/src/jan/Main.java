package jan;



import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a string. Yes, I am.";
	    System.out.println(string);

        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric ="abcdeee231FG234hijkl9z";
        System.out.println(alphanumeric.replaceAll(".","Y"));

        System.out.println(alphanumeric.replaceAll("^abcdeee","YYY"));

        String secondString ="abcdeee231FG234hiabcdeeejkl9z";
        System.out.println(secondString.replaceAll("^abcdeee","YYY"));

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcdeee"));
        System.out.println(alphanumeric.matches("^abcdeee231FG234hijkl9z"));

        System.out.println(alphanumeric.replaceAll("jkl9z$","THE END"));
        System.out.println(alphanumeric.replaceAll("[aei]","X"));
        System.out.println(alphanumeric.replaceAll("[aei]"," || I replaced the letter here! || "));
        System.out.println(alphanumeric.replaceAll("[aei][2j]","X"));

        System.out.println("harry".replaceAll("[Hh]arry","Harry"));

        String newAlphanumeric ="abcdeee231FG234hijkl9z";
        System.out.println(newAlphanumeric.replaceAll("[^ej]","X"));
        System.out.println(newAlphanumeric.replaceAll("[abcdef345678]","X"));
        System.out.println(newAlphanumeric.replaceAll("[a-fA-F3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("(?i)[a-f3-8]","X"));
        System.out.println(newAlphanumeric.replaceAll("[0-9]","X"));
        System.out.println(newAlphanumeric.replaceAll("\\d","X"));
        System.out.println(newAlphanumeric.replaceAll("\\D","X"));

        String hasWhiteSpace = "I have blancks and\ta tab, and also a newline \n";
        System.out.println(hasWhiteSpace);
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));
        System.out.println(hasWhiteSpace.replaceAll("\\t","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\S",""));
        System.out.println(newAlphanumeric.replaceAll("\\w","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\w","X"));
        System.out.println(hasWhiteSpace.replaceAll("\\b","|"));

        String thirdAlphanumericString = "abcdeee231FG234hiiiiiiijkl9z";
        System.out.println(thirdAlphanumericString.replaceAll("^abcde{3}","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcde+","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcde*","YYY"));
        System.out.println(thirdAlphanumericString.replaceAll("^abcde{2,5}","YYY"));

        System.out.println(thirdAlphanumericString.replaceAll("h+i*j","Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<p>Something else</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "(<h2>)";
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while (matcher.find()) {
            count++;
            System.out.println("Occurance " + count + " : " + matcher.start() + " to " + matcher.end());
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()) {
            System.out.println("Occurance " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TexMatcher = h2TextPattern.matcher(htmlText);

        while (h2TexMatcher.find()) {
            System.out.println("Occurrence " + h2TexMatcher.group(2));
        }
    }
}
