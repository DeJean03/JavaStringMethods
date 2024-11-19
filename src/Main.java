//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        /**
         * The split() method divides the string at the specified regex and returns an array of substrings.
         * The syntax of the string split() method is:
         * string.split(String regex, int limit)
         * regex - the string is divided at this regex (can be strings)
         * limit (optional) - controls the number of resulting substrings
         * If the limit parameter is not passed, split() returns all possible substrings.
         */
        String vowels = "a::b::c::d:e";

        // splitting the string at "::"
        // storing the result in an array of strings
        String[] result = vowels.split("::");

        // converting array to string and printing it
        System.out.println("result = " + Arrays.toString(result));

        JavaStringMethods JSM= new JavaStringMethods();
        JSM.lengthDemo();
        JSM.isEmptyExample();
        JSM.stringTrimExample();
        JSM.stringLowerExample();
        JSM.stringUpperExample();
        JSM.concatDemo();
        JSM.compareToExample();
        JSM.substringDemo();
        JSM.findString();
        JSM.containExample();
        JSM.replaceDemoMain();
        JSM.demoReplaceAll();
        JSM.testStringComparison();

    }
}