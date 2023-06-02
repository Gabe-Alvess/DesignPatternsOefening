package be.intecbrussel.strategypattern;

import java.util.Arrays;

public class ArrSorterApp {
    public static void main(String[] args) {

        int[] arr1 = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Unsorted array -> " + Arrays.toString(arr1));

        ArraySorter arraySorter1 = new ArraySorter(new BubbleSortAlgorithm());
        System.out.println("Sorted with bubble algorithm -> " + Arrays.toString(arraySorter1.sortMyArray(arr1)));

        int[] arr2 = {10, 6, 8, 5, 7, 3, 4};
        System.out.println("Unsorted array -> " + Arrays.toString(arr2));

        ArraySorter arraySorter2 = new ArraySorter(new MergeSortAlgorithm());
        System.out.println("Sorted with merge algorithm -> " + Arrays.toString(arraySorter2.sortMyArray(arr2)));
    }
}
