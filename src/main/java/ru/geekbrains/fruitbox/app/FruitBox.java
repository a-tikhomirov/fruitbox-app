package ru.geekbrains.fruitbox.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FruitBox<T extends Fruit> {
    private Class<?> boxType;
    private List<T> box;

    public FruitBox(T... fruits) {
        this.boxType = fruits.getClass().getComponentType();
        this.box = new ArrayList<>(Arrays.asList(fruits));
    }

    public void add(T... fruit) {
        box.addAll(Arrays.asList(fruit));
    }

    public T getFruit() {
        if (!box.isEmpty()) {
            T f = box.get(box.size() - 1);
            box.remove(box.size() - 1);
            return f;
        } else
            return null;
    }

    public void pourIntoAnotherBox(FruitBox<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }
//        for (T fruit:box) {
//            anotherBox.add(fruit);
//        }
//        box.clear();
        anotherBox.box.addAll(this.box);
        box.clear();
    }

    public float getWeight() {
        float weight = 0.0f;
        for (Fruit f:box) {
            weight += f.getWeight();
        }
        return weight;
    }

    public boolean compare(FruitBox<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    @Override
    public String toString() {
        return  "FruitBox contains " + box.size() + " " + boxType.getSimpleName();
    }
}
