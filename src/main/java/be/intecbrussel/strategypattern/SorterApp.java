package be.intecbrussel.strategypattern;

import java.util.Arrays;

public class SorterApp {
    public static void main(String[] args) {

        int[] arr1 = {3, 60, 35, 2, 45, 320, 5};

        System.out.println("Unsorted array -> " + Arrays.toString(arr1));

        line();

        ArraySorter arraySorter1 = new ArraySorter(new BubbleSortAlgorithm());

        System.out.println("Sorted with bubble algorithm -> " + Arrays.toString(arraySorter1.sortMyArray(arr1)));

        line();
        int[] arr2 = {10, 6, 8, 5, 7, 3, 4};

        System.out.println("Unsorted array -> " + Arrays.toString(arr2));

        line();

        ArraySorter arraySorter2 = new ArraySorter(new MergeSortAlgorithm());

        System.out.println("Sorted with merge algorithm -> " + Arrays.toString(arraySorter2.sortMyArray(arr2)));
    }

    public static void line() {
        System.out.println("-".repeat(50));
    }
}
