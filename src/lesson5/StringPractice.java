package src.lesson5;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String palindrome = isPalindrome("kayak");
        System.out.println(palindrome);

        String count = CountWords("Java is a powerful language");
        System.out.println(count);

        String replace = ReplaceNumbers("Andrii901237312");
        System.out.println(replace);
    }

    public static String isPalindrome(String string){
        String result = "Its Palindrome";
        String error = "Its not Palindrome";
        String string1 = new StringBuilder(string).reverse().toString();
        if(string.equals(string1)){
            return result;
        }else {
            return error;
        }
    }

    public static String CountWords(String string){
        String[] words = string.split("\\W+");
        int count = words.length;
        String result = String.valueOf(count);
        return result;
    };

    public static String ReplaceNumbers(String string){
        return string.replaceAll("\\d", "*");
    };
}
