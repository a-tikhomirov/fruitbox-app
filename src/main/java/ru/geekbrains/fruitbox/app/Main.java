package ru.geekbrains.fruitbox.app;

public class Main {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>(new Apple(), new Apple(), new Apple());
        System.out.printf("appleBox:\t%s\t- %.1f\n\n", appleBox.toString(), appleBox.getWeight());

        System.out.println("Added 1 apple");
        appleBox.add(new Apple());
        System.out.printf("appleBox:\t%s\t- %.1f\n\n", appleBox.toString(), appleBox.getWeight());

        FruitBox<Orange> orangeBox = new FruitBox<>(new Orange(), new Orange());
        System.out.printf("orangeBox:\t%s\t- %.1f\n\n", orangeBox.toString(), orangeBox.getWeight());

        System.out.println("Added 1 orange");
        orangeBox.add(new Orange());
        System.out.printf("orangeBox:\t%s\t- %.1f\n\n", orangeBox.toString(), orangeBox.getWeight());

        System.out.println("Got 1 apple from appleBox and 1 orange from orangeBox");
        appleBox.getFruit();
        orangeBox.getFruit();
        System.out.printf("appleBox:\t%s\t- %.1f\n", appleBox.toString(), appleBox.getWeight());
        System.out.printf("orangeBox:\t%s\t- %.1f\n", orangeBox.toString(), orangeBox.getWeight());
        System.out.printf("appleBox weight is equal to orangeBox weight:\t%s\n\n", appleBox.compare(orangeBox));

        FruitBox<Apple> appleBox2 = new FruitBox<>(new Apple());
        System.out.printf("appleBox:\t%s\t- %.1f\n", appleBox.toString(), appleBox.getWeight());
        System.out.printf("appleBox2:\t%s\t- %.1f\n", appleBox2.toString(), appleBox2.getWeight());
        System.out.println("appleBox poured into appleBox2");
        appleBox.pourIntoAnotherBox(appleBox2);
        System.out.printf("appleBox:\t%s\t- %.1f\n", appleBox.toString(), appleBox.getWeight());
        System.out.printf("appleBox2:\t%s\t- %.1f\n", appleBox2.toString(), appleBox2.getWeight());
    }
}
