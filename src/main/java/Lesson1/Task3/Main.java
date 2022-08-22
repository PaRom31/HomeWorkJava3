package Lesson1.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Box<Apple> appleBox = new Box<>(new ArrayList<>());
        for (int i = 0; i < 1; i++) {
            appleBox.addFruit(new Apple());
        }
        Box<Apple> appleBox2 = new Box<>(new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            appleBox2.addFruit(new Apple());
        }
        Box<Orange> orangeBox = new Box<>(new ArrayList<>());
        for (int i = 0; i < 3; i++) {
            orangeBox.addFruit(new Orange());
        }
        Box<Orange> orangeBox2 = new Box<>(new ArrayList<>());
        for (int i = 0; i < 4; i++) {
            orangeBox2.addFruit(new Orange());
        }
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox2.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox2.compare(appleBox2));
        appleBox.transferTheFruit(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());

    }
}
