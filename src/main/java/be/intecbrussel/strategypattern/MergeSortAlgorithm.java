package be.intecbrussel.strategypattern;

public class MergeSortAlgorithm implements ArraySortingAlgorithm {
    @Override
    public int[] sortArray(int[] array) {
        int length = array.length;

        if (length < 2) {
            return array;
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

        sortArray(lHalf);
        sortArray(rHalf);

        return merge(array, lHalf, rHalf, mid, length - mid);
    }

    private int[] merge(int[] array, int[] lHalf, int[] rHalf, int lengthLH, int lengthRH) {
        int i = 0, j = 0, k = 0;

        while (i < lengthLH && j < lengthRH) {
            if (lHalf[i] <= rHalf[j]) {
                array[k++] = lHalf[i++];
            } else {
                array[k++] = rHalf[j++];
            }
        }
        while (i < lengthLH) {
            array[k++] = lHalf[i++];
        }
        while (j < lengthRH) {
            array[k++] = rHalf[j++];
        }

        return array;
    }
}
