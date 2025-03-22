package src.lesson4;

import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arrayMain = {2,5,7,6,1,3,9,4,8};
        int valueMain = 5;
        int multiplier = 2;

        int min = findMin(arrayMain);

        System.out.println("Find Min Number: " + min);

        int max = findMax(arrayMain);

        System.out.println("Find Max Number: " + max);

        int sum = findAvarage(arrayMain);

        System.out.println("Find Avarage: " + sum);

        int[] reverse = reverseArray(arrayMain);

        System.out.println("Reverse Array: " + Arrays.toString(reverse));

        System.out.println("Before multiplyArray: " + Arrays.toString(arrayMain));

        multiplyArray(arrayMain,valueMain);

        System.out.println("After multiplyArray: " + Arrays.toString(arrayMain));

        System.out.println("Before fillArray: " + Arrays.toString(arrayMain));

        fillArray(arrayMain, valueMain);

        System.out.println("After fillArray: " + Arrays.toString(arrayMain));

        System.out.println("Original array after copyAndMultiply: " + Arrays.toString(arrayMain));

        int[] newArray = copyAndMultiply(arrayMain,multiplier);

        System.out.println("New multiplied array: " + Arrays.toString(newArray));
    }

    public static void fillArray(int[] array, int value){
        for(int i = 0;i < array.length; i++){
            array[i] = value;
        }
    }

    public static void multiplyArray(int[] array, int multiplier){
        for(int i = 0;i < array.length;i++){
            array[i] *= multiplier;
        }
    }

    public static int[] copyAndMultiply(int[] array, int multiplier){
        int[] newArray = new int[array.length];

        for (int i = 0;i < array.length;i++){
            newArray[i] = array[i] * multiplier;
        }
        return newArray;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0;i < array.length;i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 0;i < array.length;i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int findAvarage(int[] array){
        int sum = 0;
        int average = 0;
        for (int num : array){
            sum += num;
        }
        average = sum / array.length;
        return average;
    }

    public static int[] reverseArray(int[] array){
        int last = array.length -1;
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[last - i];
            array[last - i] = array[i];
            array[i] = temp;
        }
        return array;
    }
}



