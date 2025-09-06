package chapter_03;

public class Cwh_14_Stringmethods {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String a = "Harry";
        System.out.println(a);
        String b = new String("Harry");
        System.out.println(b);
        // length
        int value = a.length();
        System.out.println(value);
        // Lower Case
        String lowercase = a.toLowerCase();
        System.out.println(lowercase);
        // Upper Case
        String uppercase = a.toUpperCase();
        System.out.println(uppercase);
        // trim
        String nonTrimmedString = "    harry    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);
        System.out.println(nonTrimmedString.trim());
        // Substring
        System.out.println(nonTrimmedString.substring(6));
        System.out.println(nonTrimmedString.substring(2, 8));
        // replace
        System.out.println(a.replace('r', 'p'));
        System.out.println(a.replace("rry", "ier3"));
        // startsWith
        System.out.println(a.startsWith("Har"));
        System.out.println(a.endsWith("y"));
        // charAt
        System.out.println(a.charAt(2));
        // indexof
        System.out.println(a.indexOf("rry", 4));
        // last indexof
        System.out.println(a.lastIndexOf("rry", 4));
        // Equal
        System.out.println(a.equals("Harry"));
        // EqualsIgnoreCase in which it ignoring case considaretion
        System.out.println(a.equalsIgnoreCase("harry"));
        // Escape Sequence Characters
        /*
         * | Sequence | Meaning |
         * | -------- | ------------------------------------ |
         * | `\n` | New line |
         * | `\t` | Tab (like pressing Tab key) |
         * | `\\` | A literal backslash (`\`) |
         * | `\"`     | Double quote (`"`) inside a string |
         * | `\'` | Single quote (`'`) inside a string |
         * | `\r` | Carriage return (rarely used now) |
         * | `\b` | Backspace |
         * | `\f` | Form feed (page break, old printers) |
         */
        System.out.println("I am escape sequence \fdouble quote");
        System.out.println("Sonalika\tMadhur\tAlok\tMadhur");

    }

}
