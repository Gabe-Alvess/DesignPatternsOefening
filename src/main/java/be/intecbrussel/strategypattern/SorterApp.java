package be.intecbrussel.strategypattern;

import java.util.Arrays;

public class SorterApp {
    public static void main(String[] args) {

        int[] arr = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Unsorted array -> " + Arrays.toString(arr));

        line();

        ArraySorter arraySorter = new ArraySorter(new BubbleSortAlgorithm());

        System.out.println("Sorted array -> " + Arrays.toString(arraySorter.sortMyArray(arr)));

        line();

        System.out.println("Unsorted array -> " + Arrays.toString());

        line();


        System.out.println("Sorted array -> " + Arrays.toString());
    }
    public static void line() {
        System.out.println("-".repeat(50));
    }
}
