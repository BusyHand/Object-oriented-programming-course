package patterns.strategy.impl;

import patterns.strategy.SortStrategy;

import java.util.concurrent.ThreadLocalRandom;

public class QuickSortStrategy implements SortStrategy {


    @Override
    public void sort(long[] array) {
        sort(array, 0, array.length - 1);
    }

    private void sort(long[] array, int left, int right) {

        if (right - left + 1 <= 3) {
            sortLessThanThreeElements(array, left, right);
            return;
        }
        long pivot = randomPivot(array, left, right);
        int partition = doPartition(array, left, right, pivot);
        sort(array, left, partition - 1);
        sort(array, partition + 1, right);
    }

    private void sortLessThanThreeElements(long[] array, int left, int right) {
        int size = right - left + 1;

        if (size == 3) {
            if (array[left] > array[right])
                swap(array, left, right);
            if (array[left] > array[right - 1])
                swap(array, left, right - 1);
            if (array[right - 1] > array[right])
                swap(array, right - 1, right);
        } else if (size == 2) {
            if (array[left] > array[right])
                swap(array, left, right);
        }
    }

    public long randomPivot(long[] array, int left, int right) {
        int random = ThreadLocalRandom.current().nextInt(left, right);
        swap(array, random, right);
        return array[right];
    }

    private int doPartition(long[] array, int left, int right, long pivot) {
        int pivotIndex = right;
        left--;

        while (left < right) {
            while (array[++left] < pivot) ;
            while (right > 0 && array[--right] > pivot) ;

            if (left < right) {
                swap(array, left, right);
            }
        }
        swap(array, left, pivotIndex);
        return left;
    }

    private void swap(long[] array, int first, int second) {
        long temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
