package Lesson01.Includes;

import Lesson01.Includes.Fruits.Apple;
import Lesson01.Includes.Fruits.Fruit;

import java.util.ArrayList;
import java.util.Objects;

public class Box <T extends Fruit>{
    ArrayList<T> boxWithFruits;

    public Box(ArrayList<T> boxWithFruits) {
        this.boxWithFruits = boxWithFruits;
    }

    public Float getWeight() {
        Float sumWeight = 0.0f;
        for (T fruit : boxWithFruits) {
            sumWeight += fruit.getWeight();
        }
        return sumWeight;
    }

    public boolean compare(Box<?> boxIn) {
        return Objects.equals(boxIn.getWeight(), this.getWeight());
    }

    public void addFruitInBox(T fruit) {
        boxWithFruits.add(fruit);
    }

    public void transferFruitInBox(Box<T> box) {
        box.boxWithFruits.addAll(boxWithFruits);
        boxWithFruits.clear();
    }

}
