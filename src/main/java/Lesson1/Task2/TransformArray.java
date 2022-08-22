package Lesson1.Task2;

import java.util.Arrays;
import java.util.List;

public class TransformArray {

    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4, 5,};
        transform(intArr);
    }

    private static <T> void transform(T[] intArr) {
        List<T> list = Arrays.asList(intArr);
        System.out.println("Array " + intArr.getClass() + " " + Arrays.toString(intArr));
        System.out.println("New Array " + list.getClass() + " " + list);


    }
}
