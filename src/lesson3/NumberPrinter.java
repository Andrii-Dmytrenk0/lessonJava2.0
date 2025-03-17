package src.lesson3;

public class NumberPrinter {
    public static void main(String[] args) {

        for (int i = 1;i <= 10;i++){
            System.out.println(i);
        }

        int i = 1;
        while (i <= 20){
            if (i % 2 ==0){
                System.out.println(i);
            }
            i++;
        }

        int number = 1;
        do {
            if (number % 2 != 0){
                System.out.println(number);
            }
            number++;
        } while (number <= 19);

    }
}
