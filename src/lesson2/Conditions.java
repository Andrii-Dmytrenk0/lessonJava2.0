package src.lesson2;

public class Conditions {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 12) {
            System.out.println("You child");
        } else if (age >= 12 && age <= 18) {
            System.out.println("You teenager");
        } else {
            System.out.println("You adult");
        }
    }
}
