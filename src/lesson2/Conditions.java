package src.lesson2;

public class Conditions {

    public static final int ADULT_AGE = 18;

    public static void main(String[] args) {
        int age = 14;

        if (age <= 12) {
            System.out.println("You child");
        } else if (age >= 12 && isAdult(age)) {
            System.out.println("You teenager");
        } else {
            System.out.println("You adult");
        }
    }

    private static boolean isAdult(int age) {
        return age <= ADULT_AGE;
    }
}
