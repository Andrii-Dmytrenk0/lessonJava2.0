package src.lesson5;

public class StringMethods {
    public static void main(String[] args) {
        String text = " Java Programming ";

        System.out.println("Original: '" + text + "'");
        System.out.println("Trimmed: '" + text.trim() + "'");
        System.out.println("UpperCase: " + text.toUpperCase());
        System.out.println("LowerCase: " + text.toLowerCase());
        System.out.println("Replaced: " + text.replace("Java", "C++"));
    }
}
