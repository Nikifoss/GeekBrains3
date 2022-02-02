package Lesson01;

import Lesson01.Includes.Box;
import Lesson01.Includes.Fruits.Apple;
import Lesson01.Includes.Fruits.Orange;

import java.util.ArrayList;

public class MainQuest {

//    Большая задача:
//    a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//    b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//    c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//    d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//    e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//    g. Не забываем про метод добавления фрукта в коробку.

    public static void main(String[] args) {

        ArrayList<Apple> listApple = new ArrayList<>();
        ArrayList<Apple> listApple2 = new ArrayList<>();
        ArrayList<Orange> listOrange = new ArrayList<>();

        addingFruitInList(listApple,new Apple(), 5);
        addingFruitInList(listApple2,new Apple(), 8);
        addingFruitInList(listOrange,new Orange(), 5);

        Box<Apple> appleBox = new Box<>(listApple);
        Box<Apple> appleBox2 = new Box<>(listApple2);
        Box<Orange> orangeBox = new Box<>(listOrange);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println(orangeBox.getWeight());

        System.out.println("==========================================");
        System.out.println(appleBox.compare(orangeBox));
        System.out.println("==========================================");

        System.out.println("==========================================");
        orangeBox.addFruitInBox(new Orange());
        System.out.println(orangeBox.getWeight());
        System.out.println("==========================================");

        System.out.println("==========================================");
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        appleBox.transferFruitInBox(appleBox2);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox2.getWeight());
        System.out.println("==========================================");


    }

    private static <T> void  addingFruitInList(ArrayList<T> list, T fruit, int count) {
        for (int i = 0; i < count; i++) {
            list.add(fruit);
        }
    }
}
