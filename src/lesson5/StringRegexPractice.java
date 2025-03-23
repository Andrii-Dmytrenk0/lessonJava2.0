package src.lesson5;

public class StringRegexPractice {
    public static void main(String[] args) {
        String replaceText = "My 1st number is 10 and 20";
        String newReplaceText = replaceText.replaceAll("\\d", "*");
        System.out.println("Result replace: " + newReplaceText);

        String mail = "example@domain.com";
        boolean result = mail.contains("@domain.com");
        System.out.println("Is email: " + result);
    }
}
