package src.lesson5;

public class StringComparison {
    public static void main(String[] args) {
        String text1 = "Java";
        String text2 = "java";

        System.out.println("Equals: " + text1.equals(text2));
        System.out.println("Equals Ignore Case: " + text1.equalsIgnoreCase(text2));
        System.out.println("Contains 'av': " + text1.contains("av"));
        System.out.println("Starts with 'Ja': " + text1.startsWith("Ja"));
        System.out.println("Ends with 'va': " + text1.endsWith("va"));
    }
}

