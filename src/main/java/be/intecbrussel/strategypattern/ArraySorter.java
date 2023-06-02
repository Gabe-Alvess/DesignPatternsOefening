package be.intecbrussel.strategypattern;

public class ArraySorter {
    private final ArraySortingAlgorithm sortingAlgorithm;

    public ArraySorter(ArraySortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public int[] sortMyArray(int[] array) {
        return sortingAlgorithm.sortArray(array);
    }
}
