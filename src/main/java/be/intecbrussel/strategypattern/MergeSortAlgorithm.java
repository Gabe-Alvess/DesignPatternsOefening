package be.intecbrussel.strategypattern;

public class MergeSortAlgorithm implements ArraySortingAlgorithm {
    @Override
    public int[] sortArray(int[] array) {
        int length = array.length;

        if (length < 2) {
            throw new IllegalArgumentException("Error - Invalid Array");
        }

        int mid = length / 2;
        int[] lHalf = new int[mid];
        int[] rHalf = new int[length - mid];

        for (int i = 0; i < mid; i++) {
            lHalf[i] = array[i];
        }
        for (int i = mid; i < length; i++) {
            rHalf[i - mid] = array[i];
        }

        merge(array, lHalf, rHalf, mid, length - mid);

        return array;
    }

    private void merge(int[] array, int[] lHalf, int[] rHalf, int leftL, int rightL) {

        int i = 0, j = 0, k = 0;
        while (i < leftL && j < rightL) {
            if (lHalf[i] <= rHalf[j]) {
                array[k++] = lHalf[i++];
            } else {
                array[k++] = rHalf[j++];
            }
        }
        while (i < leftL) {
            array[k++] = lHalf[i++];
        }
        while (j < rightL) {
            array[k++] = rHalf[j++];
        }
    }
}
