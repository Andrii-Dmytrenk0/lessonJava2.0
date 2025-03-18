package src.lesson4;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int sum = 0;
        int n = array.length;

//        for (int i = 0; i < n; i++){
//            System.out.println(array[i]);
//            sum += array[i];
//        }
//        System.out.println(sum);

        System.out.println("Array: ");
        for (int num : array) {
            System.out.println(num);
            sum +=num;
        }

        System.out.println("Sum: " + sum);
    }
}
