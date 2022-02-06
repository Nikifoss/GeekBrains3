package Lesson01;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstAndSecondQuests {

    public static void main(String[] args) {

        //1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);

        System.out.println(Arrays.toString(swap(createStringArray(), 0, 1)));

        //2. Написать метод, который преобразует массив в ArrayList;

        System.out.println("changeArrToList(arr) = " + changeArrToList(createStringArray()).getClass());

    }

    private static String[] createStringArray() {
        String[] arr = new String[]{
                "One","Two","Tree","Four","Five","Six"
        };
        return arr;
    }

    private static <T> T[] swap(T[] arr, int one, int two) {
        if (arr.length >= one & arr.length >= two & one >= 0 & two >= 0) {
            T x = arr[one];
            arr[one] = arr[two];
            arr[two] = x;
        } else {
            System.err.println("Значения за пределами массива");
        }
        return arr;
    }

    public static <T> ArrayList<T> changeArrToList(T[]arr) {
        ArrayList<T> list = new ArrayList<>(Arrays.asList(arr));
        return list;
    }
}
