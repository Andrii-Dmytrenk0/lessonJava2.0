package src.lesson5;

import java.util.Arrays;

public class StringSplitting {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";

        String[] words = sentence.split(" ");
        String[] words1 = sentence.split("o");
        String[] words2 = sentence.split("");
        String[] words3 = sentence.split("x");
        String[] words4 = sentence.split("a", -1);


        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Words: " + Arrays.toString(words1));
        System.out.println("Words: " + Arrays.toString(words2));
        System.out.println("Words: " + Arrays.toString(words3));
        System.out.println("Words: " + Arrays.toString(words4));

    }
}
