import java.util.Arrays;
public class JavaStringMethods {
    public void lengthDemo() {
        /**
         * The length() method returns the length of the string,
         * or it returns the count of the total number of characters present in the string.
         */
        String str1 = "Java";
        String str2 = "";

        System.out.println(str1.length());
        System.out.println(str2.length());
        System.out.println("Java".length());
        System.out.println("Java\n".length());
        System.out.println("Learn Java".length());

    }

    public void isEmptyExample() {
        /**
         * This method checks whether the String contains anything or not.
         * If the Java String is empty, it returns true or false.
         */
        String s1 = "";
        String s2 = "hello";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
    }

    public void stringTrimExample() {
        /**
         * The Java string trim() method removes the leading and trailing spaces.
         * It checks the Unicode value of the space character (‘\u0020’) before and after the string.
         * If it exists, then remove the spaces and return the omitted string.
         */
        String s1 = "  hello   ";
        System.out.println(s1 + "how are you");
        System.out.println(s1.trim() + "how are you");
    }
    public void stringLowerExample() {
        /**
         * The toLowerCase() method converts all the characters of the String to lowercase
         */
        String s1="HELLO HOW Are You?";
        String s1lower=s1.toLowerCase();
        System.out.println(s1lower);
    }
    public void stringUpperExample() {
        /**
         * The toUpperCase() method converts all of the String characters to uppercase
         */
        String s1="hello how are you";
        String s1upper=s1.toUpperCase();
        System.out.println(s1upper);
    }
    public void concatDemo() {
        /**
         * You can also use the + operator to concatenate two or more strings. But the Java String class provides the concat() method.
         * This method combines a specific string at the end of another string,
         * and ultimately returns a combined string.
         */
        //------By using concat method----
        String str1 = "Learn ";
        String str2 = "Java";
        // concatenate str1 and str2
        System.out.println(str1.concat(str2)); // "Learn Java"

        // concatenate str2 and str11
        System.out.println(str2.concat(str1)); // "JavaLearn "
        //--- By using + operator---
        String s3 =  "hello";
        String s4 = "Learners";
        //  String s5 = s3.concat(s4); or
        String s5 = s3 + s4;
        //both of the above statement will give you the same result

        // Three strings are concatenated
        String message = "Welcome " + "to " + "Java";

        // String Chapter is concatenated with number 2
        String s = "Chapter" + 2; // s becomes Chapter2

        // String Supplement is concatenated with character B
        String s1 = "Supplement" + 'B'; // s1 becomes SupplementB

        String message2 = "Welcome to Java";
        System.out.println("The first character in the message is " + message2.charAt(0));
    }
    public void compareToExample(){
        /**
         * The Java String compareTo() method compares the given string with the current string.
         * It is a method of ‘Comparable’ interface that is implemented by the String class.
         * It either returns a positive number, a negative number, or 0.
         */
        String s1="hello";
        String s2="hello";
        String s3="hemlo";
        String s4="flag";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
    }
    public void substringDemo(){
        /**
         * The substring() method extracts a substring from the string and returns it.
         * The syntax of the substring() method is
         * stringObj.substring(int startIndex, int endIndex)
         */
        String str1 = "java is fun";
        System.out.println(str1.substring(0, 4));
    }
    public void findString(){
        /**
         * The indexOf() method returns the index of the first occurrence of the specified character/substring within the string.
         */
        String str1 = "Java is fun";
        int result;

        result = str1.indexOf('s');

        System.out.println(result);

        result = str1.lastIndexOf('J');
        System.out.println(result);

        result = str1.lastIndexOf('a');
        System.out.println(result);

        result = str1.lastIndexOf('j');
        System.out.println(result);

        result = str1.lastIndexOf("ava");
        System.out.println(result);

        result = str1.lastIndexOf("java");
        System.out.println(result);
    }
    public void containExample(){
        /**
         * The contains() method checks whether the specified string (sequence of characters) is present in the string or not.
         */
        String str1 = "Learn Java";
        Boolean result;

        result = str1.contains("Java");
        System.out.println(result);

        result = str1.contains("Python");
        System.out.println(result);

        result = str1.contains("");

        System.out.println(result);
    }
    public void replaceDemoMain(){
        /**
         * The replace() method replaces each matching occurrence of the old character/text in the string with the new character/text.
         * The syntax of the replace() method is either:
         * stringobj.replace(char oldChar, char newChar)
         * or
         * stringobj.replace(CharSequence oldText, CharSequence newText)
         * Here, stringobj is an object of the String class.
         */
        String str1 = "abc cba";

        System.out.println(str1.replace('a', 'z'));

        System.out.println("Lava".replace('L', 'J'));

        System.out.println("Hello".replace('4', 'J'));

        System.out.println(str1.replace("C++", "Java"));

        System.out.println("aa bb aa zz".replace("aa", "zz"));

        System.out.println("Java".replace("C++", "C"));
    }
    public void demoReplaceAll(){
        /**
         * The replaceAll() method replaces each substring that matches the regex of the string with the specified text.
         * The syntax of the replaceAll() method is:
         * string.replaceAll(String regex, String replacement)
         * regex - a regex (can be a typical string) that is to be replaced
         * replacement - matching substrings are replaced with this string
         */
        String str1 = "Java123is456fun";

        String regex = "\\d+";

        System.out.println(str1.replaceAll(regex, " "));
        //In the above example, "\\d+" is a regular expression that matches one or more digits.

    }
    public void testStringComparison(){
        /**
         * We can compare String in Java based on content and reference.
         * It is used in authentication (by equals() method), sorting (by compareTo() method), and reference matching (by == operator) etc.
         * There are three ways to compare String in Java:
         * By Using equals() Method.
         * By Using == Operator.
         * By compareTo() Method.
         */
       //The String class's equals() method compares the original content of the string.
        // It compares the values of strings for equality.
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));

        //The == operator compares references, not values.
        String s11="Perscholas";
        String s21="Perscholas";
        String s31=new String("Perscholas");
        System.out.println(s11==s21);
        System.out.println(s11==s31);

        //The String class's compareTo() method compares values lexicographically.
        // It returns an integer value that describes if the first string is less than, equal to, or greater than the second string.
        // return 0 if this string is the same as another;
        // <0 if lexicographically less than another; or >0
        //
        //
        //Suppose s1 and s2 are two String objects. If:
        //s1 == s2 : The method returns 0.
        //s1 > s2 : The method returns a positive value.
        //s1 < s2 : The method returns a negative value.

        String s12="Perscholas";
        String s22="Perscholas";
        String s32="Perschola";
        String s42="PerscholasX";
        System.out.println(s12.compareTo(s22));
        System.out.println(s12.compareTo(s32));
        System.out.println(s12.compareTo(s42));
    }


}