package patterns.strategy.impl;

import patterns.strategy.SortStrategy;

public class MergeSortStrategy implements SortStrategy {

    @Override
    public void sort(long[] array) {
        sort(array, new long[array.length], 0, array.length - 1);
    }

    private static void sort(long[] array, long[] workSpace, int lowerBound, int upperBound) {

        if (lowerBound == upperBound)
            return;
        else {
            int mid = (lowerBound + upperBound) / 2;
            sort(array, workSpace, lowerBound, mid);
            sort(array, workSpace, mid + 1, upperBound);
            merge(array, workSpace, lowerBound, mid + 1, upperBound);
        }
    }

    private static void merge(long[] array, long[] workSpace, int lowPtr, int highPtr, int upperBound) {
        int j = 0;
        int lowerBound = lowPtr;
        int mid = highPtr - 1;
        int n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {

            if (array[lowPtr] < array[highPtr]) {
                workSpace[j++] = array[lowPtr++];
            } else
                workSpace[j++] = array[highPtr++];
        }

        while (lowPtr <= mid) {
            workSpace[j++] = array[lowPtr++];
        }

        while (highPtr <= upperBound) {
            workSpace[j++] = array[highPtr++];
        }

        for (j = 0; j < n; j++) {
            array[lowerBound + j] = workSpace[j];
        }
    }
}
