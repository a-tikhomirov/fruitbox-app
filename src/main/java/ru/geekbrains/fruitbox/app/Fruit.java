package ru.geekbrains.fruitbox.app;

public abstract class Fruit {
    float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
}
