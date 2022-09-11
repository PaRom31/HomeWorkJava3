package Lesson1.Task1;

import java.util.Arrays;

public class SwapPlaces {

    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4};

        swapElements(intArr, 1, 3);

    }

    private static <T> void swapElements(T[] array, int index1, int index2) {
        System.out.println("Array " + Arrays.toString(array));
        T temporary = array[index1];
        array[index1] = array[index2];
        array[index2] = temporary;
        System.out.println("New Array " + Arrays.toString(array));
    }
}
